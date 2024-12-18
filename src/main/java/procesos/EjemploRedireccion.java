package procesos;

import java.io.File;
import java.io.IOException;

public class EjemploRedireccion {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c","sort");
        pb.redirectInput(new File("src/pokemon_names.txt"));
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);

        pb.inheritIO();
        //p -> proceso hijo
        Process p = pb.start();

        p.waitFor();
    }
}
