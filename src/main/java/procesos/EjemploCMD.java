package procesos;

import java.io.*;

public class EjemploCMD {

    //proceso padre
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c","dir");

        //p -> proceso hijo
        Process p = pb.start();

        // entrada del proceso hijo -> ME ESCRIBES
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
        // salida del proceso hijo -> ME LA LEES
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }


        int codigoSalida = p.waitFor();
        System.out.println("Codigo que devuelve el hijo " + codigoSalida);

    }
}
