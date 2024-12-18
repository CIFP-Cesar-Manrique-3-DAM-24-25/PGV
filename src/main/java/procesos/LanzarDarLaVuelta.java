package procesos;

import java.io.*;

public class LanzarDarLaVuelta {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar","out/artifacts/Repositorio_jar/Repositorio.jar");

        //p -> proceso hijo
        Process p = pb.start();

        // entrada del proceso hijo -> ME ESCRIBES
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
        // salida del proceso hijo -> ME LA LEES
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

        bw.write("Moises el salvador 10");
        bw.newLine();
        bw.flush();

        String linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }


        int codigoSalida = p.waitFor();
        System.out.println("Codigo que devuelve el hijo " + codigoSalida);
    }
}
