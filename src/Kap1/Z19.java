package Kap1;

import javax.swing.*;
import java.util.Calendar;

public class Z19 {
    public static void main (String[] arg) {
        String Name = "Liam Murphy";
        String Address ="*Insert Address*";
        String Telefonnummer ="*Insert Number*";
        JOptionPane.showMessageDialog(null, Name + "\n" + Address + "\n" + Telefonnummer);

        JOptionPane.showMessageDialog(null, "Datum Tid" + "\n" + Calendar.getInstance().getTime().toString());
    }
}