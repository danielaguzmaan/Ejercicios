package periodo3;

import java.util.Scanner;

public class Periodo3Clase8 {

    private static Object si;
    public static void main (String [] args) {
        Scanner Reader = new Scanner (System.in);
        String quieroJugar = "si";
        while (quieroJugar.equals(si)) {
            System.out.println("¿Quieres seguir jugando? ");
            quieroJugar = Reader.next();
        }
    }
}
