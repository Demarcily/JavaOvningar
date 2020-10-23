package DiagnosIteration;

import javax.swing.*;

public class DiagnosIterationFor {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("Insert Number");
        int n = Integer.parseInt(s);

        for (int i = 1; i <= 10; i++)
        {
            /* 10 answers i * n becomes 1 * whatever we type in then every loop i increases by one */
            int sv;
            sv = i * n;

            System.out.println(sv);
        }

    }
}