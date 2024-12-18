package procesos;

import java.util.Scanner;

public class DarLaVuelta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una String: ");
        String stringLeido = entrada.nextLine();
        if(stringLeido.isEmpty()){
            System.exit(1);
        }

        String dadoVuelta = "";
        for(int i = stringLeido.length() -1; i > -1;i--){
            char letra = stringLeido.charAt(i);
            if(Character.isDigit(letra)){
                System.exit(2);
            }
            dadoVuelta += letra;
        }
        System.out.println(dadoVuelta);
        System.exit(0);


    }
}
