package sincronizacionHilos.usoSyncrhonized;

public class Launcher {
    public static void main(String[] args) {
        // ¿Que pasa aquí?
        Thread hilo1 = new Thread(new SyncroJava(0)); // orden = 0
        Thread hilo2 = new Thread(new SyncroJava(0)); // orden = 1

        hilo1.start();
        hilo2.start();
    }
}
