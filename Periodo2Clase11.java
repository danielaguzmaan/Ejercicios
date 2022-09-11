package tareaejercicios;

import java.util.Scanner;

public class TareaEjercicios {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        String cadena = "";
        System.out.println("Ingrese un carácter: ");
        String carácter = ingresar.nextLine();
        for (int i=1; i<=20; i++){
            cadena = cadena + carácter;
            System.out.println(cadena);
        }
    }
    
}
