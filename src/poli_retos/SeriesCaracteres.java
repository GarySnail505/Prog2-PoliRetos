package poli_retos;

import javax.swing.JOptionPane;

public class SeriesCaracteres {
    int a, b, c, i, j, k, l, veces;
    int tamanio;

    public void lectorDatosC01() {
        tamanio = Integer
                .parseInt(
                        JOptionPane.showInputDialog("Ingrese dimension para todas sus series con caracteres..."));
    }
     //serieC01

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
}