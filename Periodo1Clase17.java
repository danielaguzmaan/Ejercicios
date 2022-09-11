
package ejercicioslaboratorio;

import java.util.Scanner;

public class Periodo1Clase17 {
    public static void main (String [] args){
        String nombre, clave;
        Scanner Entrada = new Scanner (System.in);
        System.out.print("Ingrese Nombre de Usuario: ");
        nombre = entrada.nextLine;
        System.out.print ("Ingrese Clave de Usuario: ");
        clave = entrada.nextLine ();
        if (nombre.equals ("juan") && clave.equals("123456")) {
            System.out.println("Bienvenido al Sistema");
        }
        else{
            System.out.println("Nombre de usuario o contraseña Incorrecta");
    }
    }
}
