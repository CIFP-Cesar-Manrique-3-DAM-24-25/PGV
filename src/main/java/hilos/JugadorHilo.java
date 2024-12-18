package hilos;

public class JugadorHilo implements Runnable{
    private String nombre;
    private int tiempo;

    public JugadorHilo(int tiempo, String nombre) {
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        // TODO: Añadir el código de cada jugador
    }




}
