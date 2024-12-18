package hilos;

import java.util.ArrayList;
import java.util.Random;

public class LauncherHilo {
    public static void main(String[] args) throws InterruptedException {

        // creamos una lista de objetos
         ArrayList<JugadorHilo> listaMataos = new ArrayList<>();

        for(int i = 0; i < 10;i++){
            listaMataos.add(new JugadorHilo(new Random().nextInt(10000) + 1,"Jugador hilo" + i));
        }

        // TODO: declaramos una lista de hilos.
        ArrayList<Thread> listaHilos = new ArrayList<>();

        // TODO : los añadimos  a la lista
        for (JugadorHilo js : listaMataos ) {
            listaHilos.add(new Thread(js));
        }
        long start = System.currentTimeMillis();
        // todo: lanzarlos con start()
        // ProcessBuilder.start()


        // TODO: pararlos join
       // process.waitFor()


        // CALCULO EL TIEMPO PARA COMPARAR
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Un total de " + timeElapsed / 1000);

    }

}
