package sincronizacionHilos.empresaLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Empresa empresa = new Empresa();
        Thread fan1 = new Thread(new Fan("Fan 1", empresa));
        Thread fan2 = new Thread(new Fan("Fan 2", empresa));
        Thread fan3 = new Thread(new Fan("Fan 3", empresa));

        fan1.start();
        fan2.start();
        fan3.start();

        fan1.join();
        fan2.join();
        fan3.join();
    }
}
