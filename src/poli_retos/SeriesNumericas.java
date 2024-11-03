package poli_retos;
import javax.swing.JOptionPane;

public class SeriesNumericas {
    int i, j, k, veces, dimension;

    public void LectorDatos() {
        dimension = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese dimension para todas sus series numericas..."));
    }

    // SERIE 01, Fibonacci....................
    public void Serie01() {
        j = 1;
        System.out.print("\n- Serie 01. 0 1 1 2 3 5 8 13... (Fibonacci):\n  ");

        while (veces < dimension) {
            veces = veces + 2;
            System.out.print(i + " ");
            j = j + i;
            i = i + j;
            if (veces <= dimension) {
                System.out.print(j + " ");
            }
        }
    }

    // SERIE 02, Impares y Ceros....................
    public void Serie02() {
        i = 1;
        veces = 0;
        System.out.print("\n\n- Serie 02. 1 0 3 0 5 0 7 0... (Impares y 0s):\n  ");

        while (veces < dimension) {
            veces = veces + 2;
            System.out.print(i + " ");
            i = i + 2;
            if (veces <= dimension) {
                System.out.print("0 ");
            }
        }
    }

    // SERIE 03, Fibonacci y denominador impar.....................
    public void Serie03() {
        j = 1;
        i = 0;
        k = 1;
        veces = 0;
        System.out.print("\n\n- Serie 03. 0/1 1/3 1/5 2/7 3/9... (Fibonacci/impares):\n  ");

        while (veces < dimension) {
            veces = veces + 2;

            System.out.print(i + "/" + k + " ");
            j = j + i;
            i = i + j;
            k = k + 2;
            if (veces <= dimension) {
                System.out.print(j + "/" + k + " ");
            }
            k = k + 2;
        }
    }

    // SERIE 04, Fibonacci y Pares.....................
    public void Serie04() {
        j = 1;
        i = 0;
        k = 2;
        veces = 0;
        System.out.print("\n\n- Serie 04. 0/2 1/4 1/6 2/8 3/10... (Fibonacci/pares):\n  ");

        while (veces < dimension) {
            veces = veces + 2;

            System.out.print(i + "/" + k + " ");
            j = j + i;
            i = i + j;
            k = k + 2;
            if (veces <= dimension) {
                System.out.print(j + "/" + k + " ");
            }
            k = k + 2;
        }
    }

    // SERIE 05, Números primos.....................
    public void Serie05() {
        System.out.print("\n\n- Serie 05. 2 3 5 7 11 13 17 19... (Primos):\n  ");

        for (int contador = 0, numero = 2; contador < dimension; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
        }
    }

    public static boolean esPrimo(int numero) {
        return numero > 1
                && java.util.stream.IntStream.range(2, (int) Math.sqrt(numero) + 1).noneMatch(i -> numero % i == 0);
    }

    // SERIE 06, Cuadrado de números naturales.....................
    public void Serie06() {
        i = 1;
        veces = 0;
        System.out.print("\n\n- Serie 06. 1 4 9 16 25 36 49 64... (Al cuadrado):\n  ");
        while (veces < dimension) {
            veces++;
            i = veces * veces;
            System.out.print(i + " ");
        }
    }

    // SERIE 07, (+3) desde el 1.....................
    public void Serie07() {
        i = 1;
        veces = 0;
        System.out.print("\n\n- Serie 07. 1 4 7 10 13 16 19 22... (+3 desde 1):\n  ");
        while (veces < dimension) {
            veces++;
            System.out.print(i + " ");
            i = i + 3;
        }
    }

    // SERIE 08, (+5) desde el 3.....................
    public void Serie08() {
        i = 3;
        veces = 0;
        System.out.print("\n\n- Serie 08. 3 8 13 18 23 28 33 38... (+5 desde 3):\n  ");
        while (veces < dimension) {
            veces++;
            System.out.print(i + " ");
            i = i + 5;
        }
    }

    // SERIE 09, 2 al cuadrado.....................
    public void Serie09() {
        veces = 0;
        i = 1;
        System.out.print("\n\n- Serie 09. 2 4 8 16 32 64 128 256... (Potencias de 2):\n  ");
        while (veces < dimension) {
            veces++;
            i = i * 2;
            System.out.print(+i + " ");
        }
    }

    // SERIE 10, 3 al cuadrado.....................
    public void Serie10() {
        veces = 0;
        i = 1;
        System.out.print("\n\n- Serie 10. 3 9 27 81 243 729 2187 6561... (Potencias de 3):\n  ");
        while (veces < dimension) {
            veces++;
            i = i * 3;
            System.out.print(+i + " ");
        }
    }

    // SERIE 12.....................
    public void Serie12() {
        k = 0;
        i = 1;
        j = 2;

        System.out.print("\n\n- Serie 12. 2 6 12 20 30 42 56 72... (Producto creciente):\n  ");

        while (i <= dimension) {
            k = i * j;
            i++;
            j++;
            System.out.print(k + " ");
        }
        System.out.print(
                "\n................................................................................................\n");
    }
}
