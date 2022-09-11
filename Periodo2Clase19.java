package periodo2;

import javax.swing.JOptionPane;

public class Periodo2Clase19 {
    public static void main (String [] args){
        String daysLeft = "";
        String weekDay = JOptionPane.showInputDialog("Ingreser el día de la semana  (en inglés)");
        switch (weekDay.toUpperCase()) {
            case "SUNDAY":
                daysLeft = daysLeft + "Sunday ";
            case "MONDAY":
                daysLeft = daysLeft + "Monday ";
            case "TUESDAY":
                daysLeft = daysLeft + "Tuesday ";
            case "WEDNESDAY":
                daysLeft = daysLeft + "Wednesday ";
            case "THURSDAY":
                daysLeft = daysLeft + "Thursday ";
            case "FRIDAY":
                daysLeft = daysLeft + "Friday ";
            case "SATURDAY":
                daysLeft = daysLeft + "Saturday ";
            
        }
        JOptionPane.showMessageDialog(null, "Quedan \"" + daysLeft + "\" para terminar la semana);
    }
}
