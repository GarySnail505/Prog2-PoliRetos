package poliretos;

public class letras {
    public int filas = 6;
    public int columnas = 6;
    public int tamanio = 6;
    public char caracter='*';
    public char letra;
    char[][] letras_matriz;

    public letras() {
        this.tamanio = tamanio;
        this.caracter = caracter;
        this.letra = letra;
        letras_matriz = new char[tamanio][tamanio];
        matriz();
    }

    private void matriz() {
        for (int filas = 0; filas < tamanio; filas++) {
            for (int columnas = 0; columnas < tamanio; columnas++) {
                pintar_v(columnas, filas);
                System.out.print(letras_matriz[filas][columnas]);
            }
            System.out.println();
        }
    }

    private void pintar_a(int j, int i) {
        if (j == 0 | i == (filas/2) | j == columnas-1) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_b(int j, int i) {
        if (j == 0 | i == (filas/2) | j == columnas-1|i==(filas-1)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }

    private void pintar_c(int j, int i) {
        if (j == 0 | i == (this.filas - 1) | i == 0) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_d(int j, int i) {
        if (j == 0 | j == columnas-1|i==(filas-1)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_e(int j, int i) {
        if (j == 0 |i==(filas-1)|i==(filas/2)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_f(int j, int i) {
        if (j == 0 |i==0|i==(filas/2)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_g(int j, int i) {
        if (j == 0 |i==0|(i==(filas/2)&& j!=1)|i==(filas-1)|(j==columnas-1 && i>=(filas/2))) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_h(int j, int i) {
        if (j == 0 | j == (columnas - 1) | i == (filas / 2)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }

    private void pintar_i(int j, int i) {
        if (i == 0 | j == (columnas / 2) | i == (filas - 1)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }

    private void pintar_j(int j, int i) {
        if (i == 0 | j == ((columnas + 1) / 2) - 1 | (i == (filas - 1) && j <= (columnas / 2))) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_k(int j, int i) {
        if (j == 0 | j==(columnas/2)-i|(j==i-(filas/2)&&i>(filas/2))) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_l(int j, int i) {
        if (j==0|i==(filas-1)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_m(int j, int i) {
        if (j == 0 | j == (columnas - 1) | ((j == i || j == (columnas - 1) - i) && i <= ((filas + 1) / 2) - 1)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_n(int j, int i) {
        if (j == 0 | j == (columnas - 1) | j == i) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_o(int j, int i) {
        if (j == 0 | j == (columnas - 1) | i == 0|i==filas-1) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }

    private void pintar_p(int j, int i) {
        if (j == 0 | i == ((filas + 2) / 2) - 1 | i == 0 | (j == (columnas - 1) && i <= (filas / 2))) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_r(int j, int i) {
        if (j == 0 | ((i == ((filas + 2) / 2) - 1 || i == 0) && j <= (columnas / 2))
                | (j == (columnas / 2) && i <= (filas / 2)) | j == i - ((filas) / 2)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_s(int j, int i) {
        if (i == 0 | (j == 0 && i <= (filas / 2)) | i == ((filas + 1) / 2) - 1
                | (j == columnas - 1 && i >= ((filas + 1) / 2))
                | i == filas - 1) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }

    private void pintar_t(int j, int i) {
        if (i == (filas / 2) | j == (columnas / 2) | i == (filas - 1)) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_u(int j, int i) {
        if (j==0|j==columnas-1|i==filas-1) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
    private void pintar_v(int j, int i) {
        if (j==i|j==(columnas-1)-i) {
            letras_matriz[i][j] = caracter;
        } else {
            letras_matriz[i][j] = ' ';
        }
    }
}