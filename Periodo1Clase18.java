
package ejercicioslaboratorio;

import java.util.Scanner;

public class Periodo1Clase18 {
    public static void main (String [] args){
        double valor, descuento, recargo, total;
        String tipo_pago;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese el valor de la compra: ");
        valor = entrada.nextDouble ();
        System.out.print("Ingrese el tipo de pago: ");
        tipo_pago=entrada.next();
        descuento = 0.05 * valor;
        recargo = 0.03* valor;
        if (tipo_pago.equalsIgnoreCase("contado")) {
            System.out.println("El total es: " + descuento);
            total = valor - descuento;
            System.out.println("El total es: " + total);
        }
        else if (tipo_pago.equalsIgnoreCase("Tarjeta")){
        System.out.println("El recargo es: " + recargo);
        total = valor + recargo;
        System.out.println("El total es: " + total);
        }
        else {
            System.out.println("Método de pago Invalido");
        }
    }
}
