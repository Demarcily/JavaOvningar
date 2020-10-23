package DiagnosIteration;

import javax.swing.*;

public class DiagnosIterationWhile {
    public static void main (String[] arg) {
        int i = 1;
        String s = JOptionPane.showInputDialog("Insert Number");
        int n = Integer.parseInt(s);


        while (i <= 10){
            /* 10 answers i * n becomes 1 * whatever we type in then every loop i increases by one */
            int sv;
            sv = i * n;
            i = i + 1;

            System.out.println(sv);
        }

    }
}
