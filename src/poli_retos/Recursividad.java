package poli_retos;

import java.util.Scanner;

public class Recursividad {
    public int g2_recursividad_01(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * g2_recursividad_01(n - 1);
    }

    public int g2_recursividad_02(int a, int b) {
        if (b == 0)
            return a + 0;
        else
            return g2_recursividad_02(a + 1, b - 1);
    }

    public void g2_recursividad04() {
        System.out.print("\n- Serie R04.\n");
        System.out.println("Ingrese la base (a) que quiere elevar: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente (b) al que desea elevar la base: ");
        int exponente = sc.nextInt();
        double resultado = potencia(base, exponente);
        System.out.println(base + "^" + exponente + " = " + resultado);
    }

    public static double potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return 1.0 / potencia(a, -b);
        } else {
            return a * potencia(a, b - 1);
        }
    }

    public void g2_recursividad_06(int numero) {
        if (numero < 0) {
            return;
        } else {
            System.out.println(numero);
            g2_recursividad_06(numero - 1);
        }
    }
}

