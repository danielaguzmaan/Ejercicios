package periodo3;

public class Periodo3Clase18 {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        int i=1; //contador del bucle
        int potencia; //guarda el valor de la potencia
        int base; 
        int calculo = 1;
        System.out.print("Introduzca el valor de la base: ");
        base= teclado.nextInt();
        System.out.print("Introduzca el valor del exponente: ");
        potencia = teclado.nextInt();
        while (i <=potencia){
            calculo = calculo * base;
            i ++;
        }
        System.out.println("El resultado del calculo de la potencia es: " + calculo);
        }
    }

