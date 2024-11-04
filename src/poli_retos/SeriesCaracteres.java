package poli_retos;

import javax.swing.JOptionPane;

public class SeriesCaracteres {
    int a, b, c, i, j, k, l, veces;
    int tamanio;
    final String Alfabeto = "a-b-c-d-e-f-g-h-i-j-k-l-m-n-o-p-q-r-s-t-u-v-w-x-y-z";
    String letrasSeparadas[] = Alfabeto.split("-");

    public void lectorDatosC01() {
        tamanio = Integer
                .parseInt(
                        JOptionPane.showInputDialog("Ingrese dimension para todas sus series con caracteres..."));
    }
    // serieC01

    // seriec02

    // serieC03
    public void serieC03() {
        k = 0;
        System.out.print("\n\n- serie C03. ++ +++ +++++ +++++++... (Primos):\n  ");

        for (int contador = 0, numero = 2; contador < tamanio; numero++) {
            if (esPrimo(numero)) {
                while (k < numero) {
                    k++;
                    System.out.print("+");
                }
                k = 0;
                contador++;
                System.out.print(" ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void serieC04() {
        System.out.print("\n\n- serie C04. + - * / + - * /... (Op. básicas):\n  ");
        veces = 1;
        while (veces <= tamanio) {
            System.out.print("+ ");
            veces++;
            if (veces <= tamanio) {
                System.out.print("- ");
            }
            veces++;
            if (veces <= tamanio) {
                System.out.print("* ");
            }
            veces++;
            if (veces <= tamanio) {
                System.out.print("/ ");
            }
            veces++;
        }
    }

    public void serieC05() {
        char[] caracteres = { '|', '\\', '|', '/' };
        System.out.print("\n\n- serie C05. | \\ | / - | \\ | / -... (Vaivén):\n ");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < caracteres.length; j++) {
                System.out.print(caracteres[j] + " ");
            }
            if (i < tamanio - 1) {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    public void serieC06() {
        char letra = 'a';
        System.out.print("\n\n- serie C06. a b c d e... (Abecedario):\n ");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(letra + " ");
            letra++;
            if (letra > 'z') {
                letra = 'a';
            }
        }
        System.out.println();
    }

    public void g2_serieCaracteres07() {
        int numeroRepeticiones = 2;
        System.out.print("\n\n- serie C07.  aa bbbb cccccc dddddddd ... (Abecedario):\n ");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < numeroRepeticiones; j++) {
                System.out.print(letrasSeparadas[i]);
            }
            System.out.print(" ");
            numeroRepeticiones += 2;
        }
    }

    public void g2_serieCaracteres08() {
        int numeroRepeticiones = 1;
        System.out.print("\n\n- serie C08. a bbb ccccc ddddddd eeeeeeeee... (Abecedario):\n ");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < numeroRepeticiones; j++) {
                System.out.print(letrasSeparadas[i]);
            }
            System.out.print(" ");
            numeroRepeticiones += 2;
        }
    }

    // serie C09
}