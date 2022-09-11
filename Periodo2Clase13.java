package periodo2;

public class Periodo2Clase13 {

    private static String diaSemana;
    public static void main (String [] args){
        String tipoDia = "";
        String String = diaSemana = "Lunes";
        
        switch (diaSemana.toLowerCase() ){
            case "lunes":
                tipoDia = "Inicio de Semana";
                break;
            case "martes":
            case "miercoles":
            case "jueves": 
                tipoDia = "Mediados de semana";
                break;
            case "sábado":
            case "domingo":
                tipoDia = "Fin de semana";
                break;
        }
        
        System.out.println(diaSemana + "es" + tipoDia);
    }
}
