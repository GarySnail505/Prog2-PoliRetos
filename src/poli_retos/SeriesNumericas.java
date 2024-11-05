package poli_retos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SeriesNumericas {
    int a, b, c, repeticiones, tamanio;
    int cantidadTerminos, inicio;

    public void g2_lectorDatos() {
        tamanio = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese tamanio para las series numericas..."));
    }

    public void g2_serieN01() {
        a = 0;
        b = 1;
        repeticiones=0;
        System.out.print("\n- Serie N01.\n");

        while (repeticiones < tamanio) {
            repeticiones = repeticiones + 2;
            System.out.print(a + " ");
            b = b + a;
            a = a + b;
            if (repeticiones <= tamanio) {
                System.out.print(b + " ");
            }
        }
        System.out.println("");
    }

    public void g2_serieN02() {

        System.out.print("\n- Serie N02.\n");

        for (repeticiones = 1; repeticiones <= tamanio; repeticiones++) {
            if (repeticiones %2 !=0 ) {
                System.out.print(repeticiones+" ");
            }
            else
                System.out.print(0+" ");
        }
        System.out.println("");
    }

    public void g2_serieN03() {
        a = 0;
        b = 1;
        c = 1;
        repeticiones = 0;

        System.out.print("\n\n- Serie N03.\n");

        while (repeticiones < tamanio) {
            repeticiones = repeticiones + 2;

            System.out.print(a + "/" + c + " ");
            b = b + a;
            a = a + b;
            c = c + 2;
            if (repeticiones <= tamanio) {
                System.out.print(b + "/" + c + " ");
            }
            c = c + 2;
        }
        System.out.println("");
    }

    public void g2_serie04() {
        a = 1;
        b = 0;
        c = 2;
        repeticiones = 0;
        System.out.print("\n\n- Serie 04.\n  ");

        while (repeticiones < tamanio) {
            repeticiones = repeticiones + 2;

            System.out.print(a + "/" + c + " ");
            b = b + a;
            a = a + b;
            c = c + 2;
            if (repeticiones <= tamanio) {
                System.out.print(b + "/" + c + " ");
            }
            c = c + 2;
        }
    }

    public void g2_serie05() {
        System.out.print("\n\n- Serie 05\n  ");

        for (int contador = 0, numero = 2; contador < tamanio; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
        }
    }
    private boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public void g2_serieN06() {
        System.out.println("\n- Serie N06.\n");
        System.out.println(" ");
        for (int i = 1; i <= cantidadTerminos; i++) {
            System.out.println(i * i);
        }
    }

    public void g2_serieN07() {
        a = 1;
        repeticiones = 0;
        System.out.print("\n- Serie N07.\n");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(a + " ");
            a += 3;
        }
        System.out.println();
    }

    public void g2_serieN08() {
        a = 3;
        repeticiones = 0;
        System.out.print("\n- Serie N08.\n");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(a + " ");
            a += 5;
        }
        System.out.println();
    }

    public void g2_serieN09() {
        int total = 1;
        System.out.print("\n- Serie N09.\n");
        for (int i = 0; i < tamanio; i++) {
            total = total * 2;
            System.out.print(total + " ");
        }
    }

    public void g2_serieN10() {
        int total = 1;
        System.out.print("\n- Serie N010.\n");
        for (int i = 0; i < tamanio; i++) {
            total = total * 3;
            System.out.print(total + " ");
        }
    }
}
