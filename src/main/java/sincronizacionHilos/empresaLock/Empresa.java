package sincronizacionHilos.empresaLock;

import java.util.Random;

class Empresa {
    private int contadorEntrada = 0;
    private int contadorSalida = 0;
    // TODO: Crear los ReentrantLock para gestionar el acceso

    public void entra(Fan f) {
        // TODO
    }

    public void sale(Fan f) {
       // TODO
    }
}

class Fan implements Runnable {
    private String nombre;
    private Empresa empresa;

    public Fan(String nombre, Empresa empresa) {
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        Random rand = new Random();
        try {
            int llegada = (rand.nextInt(10) + 1) * 1000; // Entre 1 y 10 segundos
            System.out.println(nombre + " está llegando a la empresa. Tiempo: " + llegada / 1000 + "s");
            Thread.sleep(llegada);

            empresa.entra(this);

            int queja = (rand.nextInt(11) + 5) * 1000; // Entre 5 y 15 segundos
            System.out.println(nombre + " se está quejando por " + queja / 1000 + "s");
            Thread.sleep(queja);

            empresa.sale(this);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

