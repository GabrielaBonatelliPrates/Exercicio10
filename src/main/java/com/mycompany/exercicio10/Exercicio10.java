

package com.mycompany.exercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio10 {

    public static void main(String[] args) {
        int n1, n2, soma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2: "));
        soma = n1 + n2;

        if (soma > 10) {
            JOptionPane.showMessageDialog(null, "Seu número é maior que 10: " + soma);
        }
    }
}