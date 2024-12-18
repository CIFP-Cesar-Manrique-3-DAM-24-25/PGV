package sincronizacionHilos.usoSyncrhonized;

public class SyncroJava implements Runnable {
    private int orden;

    public SyncroJava(int orden) {
        this.orden = orden;
    }

    public static void metodoPGL() {
        System.out.println("Cómo me gusta PGL");
        try {
            Thread.sleep(3000); // 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  static void metodoPGV() {
        System.out.println("Cómo me gusta PGV");
        try {
            Thread.sleep(3000); // 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        if (orden == 0) {
            metodoPGL();
            metodoPGV();
        } else {
            metodoPGV();
            metodoPGL();
        }
    }


}

