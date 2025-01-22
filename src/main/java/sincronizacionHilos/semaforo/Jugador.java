package sincronizacionHilos.semaforo;

import java.util.concurrent.Semaphore;

public class Jugador implements Runnable{
    // Declaramos un semáforo para controlar el acceso a la sección crítica
    public static final Semaphore semaforo = new Semaphore(3);

    public void entrar() throws InterruptedException {
        // TODO: Aqui hay que coger un permiso
        semaforo.acquire();
    }

    public void salir(){
        // TODO: Aqui hay que soltar un permiso
        semaforo.release();
    }

    @Override
    public void run() {

        while(true){

            System.out.println("Hola, soy " + Thread.currentThread().getName() + " y me voy a echar una partida ");
            System.out.println("Hay un total de " + semaforo.getQueueLength() + " aqui esperando");

            try {
                entrar();
                System.out.println("Vaya partidica aqui que bien " + Thread.currentThread().getName() + " ya he entrado");

                Thread.sleep(3000);
                salir();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
