package periodo2;

import java.util.Scanner;

public class Periodo2Clase14 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numlados;
        System.out.println("Número de lados");
        numlados= entrada.nextInt();
        switch(numlados){
            case 1:
                System.out.println("No es figura");
                break;
            case 2: 
                System.out.println("No es figura");
                break;
            case 3:
                System.out.println("Triángulo");
                break;
            case 4:
                System.out.println("Cuadrado o Rectangulo");
                break;
            case 5: 
                System.out.println("Pentagono");
                break;
            case 6: 
                System.out.println("Hexágono");
                
                break;
            case 8: 
                System.out.println("Octágono");
                break;
            default:
                System.out.println("No registrada");
        }
             
    }
}
