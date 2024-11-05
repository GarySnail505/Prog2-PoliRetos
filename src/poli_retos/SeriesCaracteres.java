package poli_retos;

import javax.swing.JOptionPane;

public class SeriesCaracteres {
    int a, b, c, i, j, k, l, veces;
    int tamanio;
    int cantidadTerminos;
    final String Alfabeto = "a-b-c-d-e-f-g-h-i-j-k-l-m-n-o-p-q-r-s-t-u-v-w-x-y-z";
    String letrasSeparadas[] = Alfabeto.split("-");

    public void g2_lectorDatosC01() {
        tamanio = Integer
                .parseInt(
                        JOptionPane.showInputDialog("Ingrese dimension para todas sus series con caracteres..."));
    }
    
    // g2_serieC01
    public void g2_serieC01(){
        System.out.print("\n- Serie C01:\n  ");
        while (veces < tamanio) {
            veces = veces + 2;
            System.out.print("+ ");
            if (veces <= tamanio) {
                System.out.print("- ");
            }
        }
        System.out.println("");
    }
    
    // g2_seriec02
    public void g2_serieC02() {
        j = 1;
        veces = -1;
        k = 0;
        System.out.print("\n\n- Serie C02:\n ");

        while (veces < tamanio) {
            veces = veces + 2;
            while (k < i) {
                System.out.print("+");
                k++;
            }
            k = 0;
            System.out.print(" ");
            j = i + j;
            i = i + j;
            if (veces <= tamanio) {
                while (k < j) {
                    System.out.print("+");
                    k++;
                }
                k = 0;
                System.out.print(" ");
            }
        }
    }

    
    // g2_serieC03
    public void g2_serieC03() {
        k = 0;
        System.out.print("\n\n- Serie C03.\n  ");

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

    public void g2_serieC04() {
        System.out.print("\n\n- Serie C04:\n  ");
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

    public void g2_serieC05() {
        char[] caracteres = { '|', '\\', '|', '/' };
        System.out.print("\n\n- Serie C05.\n ");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < caracteres.length; j++) {
                System.out.print(caracteres[j] + " ");
            }
            if (i < tamanio - 1) {
                System.out.print("- ");
            }
        }
    }

    public void g2_serieC06() {
        char letra = 'a';
        System.out.print("\n\n- Serie C06.\n ");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(letra + " ");
            letra++;
            if (letra > 'z') {
                letra = 'a';
            }
        }
    }

    public void g2_serieCaracteres07() {
        int numeroRepeticiones = 2;
        System.out.print("\n\n- Serie C07. \n ");
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
        System.out.print("\n\n- Serie C08.\n ");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < numeroRepeticiones; j++) {
                System.out.print(letrasSeparadas[i]);
            }
            System.out.print(" ");
            numeroRepeticiones += 2;
        }
        System.out.println("");
    }
}
    // serie C09
