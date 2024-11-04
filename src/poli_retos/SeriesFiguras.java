package poli_retos;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SeriesFiguras {
    int a, b, c, i, j, k, tamanio02;
    int cantidadTerminos, numero;

    public void g2_lectorF02() {
        tamanio02 = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese dimension para todas sus series con figuras..."));
    }
   // g2_SerieF01
    public void g2_serieF01() {
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
    // g2_SerieF02
    public void g2_serieF02() {
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
    // g2_SerieF03 
    public void g2_serieF03() {
        System.out.print("\n- Serie F03.:\n");
        for (i = 0; i < tamanio02; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // g2_SerieF04 
    public void g2_serieF04() { 
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

    public void g2_serieF9() {
        System.out.println("\nFigura pirámide:");
        int anchoBase = cantidadTerminos * 4 - 4; 

        for (int i = 1; i <= cantidadTerminos; i++) {
            int espaciosExteriores = anchoBase - (i - 1) * 4; 
            int espaciosInteriores = (i - 1) * 4;
            System.out.print(" ".repeat(espaciosExteriores));
            System.out.print("_|");
            if (i > 1) {
                System.out.print(" ".repeat(espaciosInteriores));
            }
            System.out.print(" ".repeat(espaciosInteriores));
            System.out.println("|_");
        }
    }

    public void g2_serieF10() {
        System.out.println("\nGradas con signos (+ -):");

        for (int i = 1; i <= cantidadTerminos; i++) {
            int espacios = (i - 1) * 4;

                if (i % 2 == 1) {
                    System.out.print(" ".repeat(espacios));
                    System.out.println("_+_");
                    System.out.print(" ".repeat(espacios));
                    System.out.println("   |");
                } else {
                    System.out.print(" ".repeat(espacios));
                    System.out.println("_-_");
                    System.out.print(" ".repeat(espacios));
                    System.out.println("   |");
                }
            }
            System.out.print("   ");
    }

    public void g2_serieF11() {
        System.out.println("\nGradas:");

        for (int i = 1; i <= cantidadTerminos; i++) {
            int espacios = (i - 1) * 5;
            String guionesBajos = "_ ".repeat(i);
            System.out.print(" ".repeat(espacios));
            System.out.print("|_ ");
            System.out.print(guionesBajos.trim());
            System.out.print(" ".repeat(espacios));
            System.out.println(" ");
        }
    }

    public void g2_serieF12() {
        System.out.println("\nFigura pirámide números:");

        for (int i = numero; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    // g2_SerieF13
    public void g2_serieF13() {
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

    // g2_SerieF14
    public void g2_serieF14() {
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

    // g2_SerieF15
    public void g2_serieF15() {
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

    // g2_SerieF16
    public void g2_serieF16() {

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

    //Serie F17
    public void g2_crearFigura17() {
        System.out.print("\n- Serie F17:\n");
        for (int i = 0; i < tamanio02; i++) {
            for (int j = 0; j < tamanio02; j++) {
                if (i == j || i == tamanio02 - j - 1) {
                    if (i % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    //Serie F18
    public void g2_crearFigura18() {
        System.out.print("\n- Serie F18:\n");
        int[][] matriz = new int[tamanio02][tamanio02];
        for (int fila = 0; fila < tamanio02; fila++) {
            for (int columna = 0; columna < tamanio02; columna++) {

                if (columna <= fila) {
                    if (!(fila == columna || (fila > 0 && columna == 0))) {
                        matriz[fila][columna] = matriz[fila - 1][columna - 1] + matriz[fila - 1][columna];
                    }
                    if (fila == columna) {
                        matriz[fila][columna] = 2;
                    }
                    if (fila > 0 && columna == 0) {
                        matriz[fila][columna] = 1;
                    }
                } else {
                    matriz[fila][columna] = 0;
                }

                if (matriz[fila][columna] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[fila][columna] + "  ");
                }
            }
            System.out.println(" ");
        }
    }

    //Serie F19
    public void g2_crearFigura19() {
        System.out.print("\n- Serie F19:\n");
        int[][] matriz = new int[tamanio02][tamanio02];
        for (int fila = 0; fila < tamanio02; fila++) {
            for (int columna = 0; columna < tamanio02; columna++) {

                if (columna <= fila) {
                    if (!(fila == columna || (fila > 0 && columna == 0))) {
                        matriz[fila][columna] = matriz[fila - 1][columna - 1] + matriz[fila - 1][columna];
                    }
                    if (fila == columna) {
                        matriz[fila][columna] = 2;
                    }
                    if (fila > 0 && columna == 0) {
                        matriz[fila][columna] = 1;
                    }
                } else {
                    matriz[fila][columna] = 0;
                }

                switch (matriz[fila][columna]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("+  ");
                        break;
                    case 2:
                        System.out.print("*  ");
                        break;
                    default:
                        System.out.print(matriz[fila][columna] + "  ");
                        break;
                }
            }
            System.out.println(" ");
        }

    }
}
