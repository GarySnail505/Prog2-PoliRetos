package poli_retos;

public class SeriesFiguras {
    int a, b, c, i, j, k, tamanio;
    int cantidadTerminos, numero;

    public SeriesFiguras(int tamanio){
        this.tamanio=tamanio;
        g2_serieF01();
        g2_serieF02();
        g2_serieF03();
        g2_serieF04();
        g2_serieF05();
        g2_serieF06();
        g2_serieF07();
        g2_serieF08();
        g2_serieF09();
        g2_serieF10();
        g2_serieF11();
        g2_serieF12();
        g2_serieF13();
        g2_serieF14();
        g2_serieF15();
        g2_serieF16();
        g2_serieF17();
        g2_serieF18();
        g2_serieF19();
    }
    
   // g2_SerieF01
    public void g2_serieF01() {
        System.out.print("\n- Serie F01.:\n");
        for (i = 0; i < tamanio; i++) {
            for (j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio - 1 || j == 0 || j == tamanio - 1) {
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
        for (i = 0; i < tamanio; i++) {
            for (j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio - 1) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else if (j == 0 || j == tamanio - 1) {
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
        for (i = 0; i < tamanio; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // g2_SerieF04 
    public void g2_serieF04() { 
        System.out.print("\n- Serie F04.:\n"); 
        for (i = 0; i < tamanio; i++) { 
            for (j = 0; j < tamanio - i - 1; j++) { 
                System.out.print(" "); 
            } 
            for (j = 0; j <= i; j++) { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        }
    }

    private void g2_serieF05() {
        System.out.print("\n- Serie F05.:\n");
        for (int filas = 0; filas < tamanio; filas++) {
            for (int columnas = 0; columnas < (tamanio * 2) - 1; columnas++) {
                if (columnas == (tamanio - 1)
                        || (columnas <= (tamanio - 1) + filas && columnas >= (tamanio - 1) - filas)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void g2_serieF06() {
        System.out.print("\n- Serie F06.:\n");

        for (int filas = 1; filas <= tamanio; filas++) {
            for (int columnas = 1; columnas <= (tamanio * 2) - 1; columnas++) {
                String caracter = (filas == 1 || (columnas >= filas && columnas <= (tamanio * 2) - filas)) ? "*" : " ";
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private void g2_serieF07() {
        System.out.print("\n- Serie F07.:\n");

        int tamanio = 1;
        int espacios = 1;
        System.out.println("_");
        while (tamanio < this.tamanio) {
            for (int contador = 0; contador < espacios; contador++) {
                System.out.print(" ");
            }
            espacios = espacios + 2;
            System.out.println("|_");
            tamanio = tamanio + 1;
        }
    }

    private void g2_serieF08() {
        System.out.print("\n- Serie F08.:\n");

        int espacios = 3;
        for (int filas = 0; filas < tamanio; filas++) {
            for (int columnas = 1; columnas < (tamanio * 2); columnas++) {
                if ((columnas == (tamanio * 2) - 1) && (filas == 0)) {
                    System.out.print("_");
                } else if ((columnas == (tamanio * 2) - espacios) && filas != 0) {
                    System.out.print("_|");
                    espacios = espacios + 2;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public void g2_serieF09() {
        System.out.print("\n- Serie F09.:\n");
        int anchoBase = tamanio * 4 - 4;
        for (int i = 1; i <= tamanio; i++) {
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
        System.out.print("\n- Serie F10.:\n");

        for (int i = 1; i <= tamanio; i++) {
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
        System.out.print("\n- Serie F11.:\n");

        for (int i = 1; i <= tamanio; i++) {
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
        System.out.print("\n- Serie F12.:\n");
        for (int i = tamanio; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
    // g2_SerieF13
    public void g2_serieF13() {
        j = 1;
        i = 1;
        k = tamanio + 1;
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
        b = tamanio;

        System.out.print("\n- Serie F14:\n");

        int[][] matrix = new int[tamanio][tamanio];

        for (int i = 0; i < tamanio; i++) {
            matrix[i][0] = 1;
            matrix[i][i] = 1;

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }

        for (int i = 0; i < tamanio; i++) {
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
        int[][] matrix = new int[tamanio][tamanio];

        System.out.print("\n- Serie F15.:\n");
        for (int i = 0; i < tamanio; i++) {
            matrix[i][0] = 1;
            matrix[i][i] = 1;

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; 
            }
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // g2_SerieF16
    public void g2_serieF16() {

        System.out.print("\n- Serie F16.\n");

        char[][] matriz = new char[tamanio][tamanio];

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == j || i == (tamanio - 1 - j)) {
                    matriz[i][j] = (i % 2 == 0) ? '+' : '-';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //Serie F17
    public void g2_serieF17() {
        System.out.print("\n- Serie F17:\n");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == j || i == tamanio - j - 1) {
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
    public void g2_serieF18() {
        System.out.print("\n- Serie F18:\n");
        int[][] matriz = new int[tamanio][tamanio];
        for (int fila = 0; fila < tamanio; fila++) {
            for (int columna = 0; columna < tamanio; columna++) {

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
    public void g2_serieF19() {
        System.out.print("\n- Serie F19:\n");
        int[][] matriz = new int[tamanio][tamanio];
        for (int fila = 0; fila < tamanio; fila++) {
            for (int columna = 0; columna < tamanio; columna++) {

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
