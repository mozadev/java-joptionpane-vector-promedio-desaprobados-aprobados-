/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class promedio {

    public static void main(String[] args) {

        int num;
        int aprobados = 0;
        int desaprobados = 0;
        int sumApro = 0;
        int sumDesa = 0;
        float promApro = 0;
        float promDesa = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        int[] notas = new int[num];

        for (int i = 0; i < notas.length; i++) {
            do {
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor[" + i + "]"));
            } while (notas[i] > 20 || notas[i] < 0);

            if (notas[i] >= 11) {
                sumApro = sumApro + notas[i];
                aprobados++;
            } else {
                desaprobados++;
                sumDesa=sumDesa+notas[i];
            }
        }
        promApro=sumApro/aprobados;
        promDesa=sumDesa/desaprobados;

        JOptionPane.showMessageDialog(null, "promedio notas dapro  " + promApro);
        JOptionPane.showMessageDialog(null, "promedio notas desaaprobados: " + promDesa);

    }
}
