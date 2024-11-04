package poli_retos;

import java.util.Arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SeriesFiguras {
    int a, b, c, i, j, k, tamanio02;

    public void lectorF02() {
        tamanio02 = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese dimension para todas sus series con figuras..."));
    }
   // SerieF01
    public void serieF01() {
        System.out.print("\n- Serie F01.:\n");
        for (i = 0; i < tamanio02; i++) {
            for (j = 0; j < tamanio02; j++) {
                if (i == 0 || i == tamanio02 - 1 || j == 0 || j == tamanio02 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // SerieF02
    public void serieF02() {
        System.out.print("\n- Serie F02.:\n");
        for (i = 0; i < tamanio02; i++) {
            for (j = 0; j < tamanio02; j++) {
                if (i == 0 || i == tamanio02 - 1) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else if (j == 0 || j == tamanio02 - 1) {
                    if (i % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // SerieF03 
    public void serieF03() {
        System.out.print("\n- Serie F03.:\n");
        for (i = 0; i < tamanio02; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // SerieF04 
    public void serieF04() { 
        System.out.print("\n- Serie F04.:\n"); 
        for (i = 0; i < tamanio02; i++) { 
            for (j = 0; j < tamanio02 - i - 1; j++) { 
                System.out.print(" "); 
            } 
            for (j = 0; j <= i; j++) { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        }
    }
    // SerieF13
    public void serieF13() {
        j = 1;
        i = 1;
        k = tamanio02 + 1;
        System.out.print("\n- Serie F13.:\n");
        while (k >= j) {
            while (j >= i) {
                System.out.print(+i + " ");
                i++;
            }
            i = 1;
            j++;
            if (k == j) {
                k = 0;
                j = 1;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    // SerieF14
    public void serieF14() {
        a = 0;
        b = tamanio02;

        System.out.print("\n- Serie F14:\n");

        int[][] matrix = new int[tamanio02][tamanio02];

        for (int i = 0; i < tamanio02; i++) {
            matrix[i][0] = 1;
            matrix[i][i] = 1;

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; // Suma de los dos números superiores
            }
        }

        for (int i = 0; i < tamanio02; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    while (a < b) {
                        System.out.print(" ");
                        a++;
                    }
                    b--;
                    a = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // SerieF15
    public void serieF15() {
        int[][] matrix = new int[tamanio02][tamanio02];

        System.out.print("\n- Serie F15.:\n");
        for (int i = 0; i < tamanio02; i++) {
            matrix[i][0] = 1;
            matrix[i][i] = 1;

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; 
            }
        }

        for (int i = 0; i < tamanio02; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // SerieF16
    public void serieF16() {

        System.out.print("\n- Serie F16.\n");

        char[][] matriz = new char[tamanio02][tamanio02];

        for (int i = 0; i < tamanio02; i++) {
            for (int j = 0; j < tamanio02; j++) {
                if (i == j || i == (tamanio02 - 1 - j)) {
                    matriz[i][j] = (i % 2 == 0) ? '+' : '-';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < tamanio02; i++) {
            for (int j = 0; j < tamanio02; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
