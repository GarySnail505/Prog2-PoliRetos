package poli_retos;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Loadings {

    public void g2_loading01() {
        char[] simbolos = { '\\', '|', '/', '|' };

        for (int i = 0; i < 100; i++) {
            char simbolo = simbolos[i % simbolos.length];
            System.out.print("\r" + simbolo + "Cargando..." + i + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\rCarga completa: 100%\n");
    }

    public void g2_loading2() {
        System.out.println("Ingrese el símbolo que desea para la carga: ");
        Scanner sc = new Scanner(System.in);
        String lectura = sc.next();
        char s = lectura.charAt(0);
        char[] simbolos = { '[', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ']' };

        for (int i = 1; i < simbolos.length - 2; i++) {
            simbolos[i] = s;

            StringBuilder barra = new StringBuilder();
            for (char simbolo : simbolos) {
                barra.append(simbolo);
            }
            System.out.print("\r" + barra + " " + (float) (i * 5.56) + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\rCarga completa: 100%             ");
    }

    public void g2_loading3() {
        System.out.println("Ingrese el símbolo que desea para la carga: ");
        Scanner sc = new Scanner(System.in);
        String lectura = sc.next();
        char s = lectura.charAt(0);
        char[] simbolos = { '[', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ']' };

        for (int i = 1; i < simbolos.length - 2; i++) {
            simbolos[i] = s;

            StringBuilder barra = new StringBuilder();
            for (char simbolo : simbolos) {
                barra.append(simbolo);
            }
            System.out.print("\r" + barra + " " + (float) (i * 5.56) + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\rCarga completa: 100%             ");
    }


    public static void g2_barra07() throws InterruptedException {
        int total = 20;
        System.out.println("Cargando...");
        System.out.print("  [");
        String[] puntas = { "\\", "|", "//", "-", "|" };

        for (int i = 0; i <= total; i++) {
            Thread.sleep(1000);

            if (i < total) {
                System.out.print("=");
            } else {
                System.out.print(puntas[i % puntas.length]);
            }
            int porcentaje = (i * 100) / total;
            System.out.print(" ]" + porcentaje + "%\r");
        }
        System.out.print(" ] 100%");
    }

    public static void g2_nombre08(String nombre) throws InterruptedException {
        int total = nombre.length();
        System.out.println("Cargando...");
        System.out.print("  [");

        for (int i = 0; i <= total; i++) {
            Thread.sleep(1000);
            System.out.print(nombre.charAt(i));
            int porcentaje = ((i + 1) * 100) / total;
            System.out.print(nombre + " ]" + porcentaje + "%\r");
        }
        System.out.println(" ] 100%");
        System.out.println(" [ " + nombre + " ] 100%");
    }

    // Delay 11
    public void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void g2_delay11(int numBarras, int alturaMaxima) {
        Random random = new Random();
        int[] alturas = new int[numBarras];

        for (int i = 0; i < numBarras; i++) {
            alturas[i] = random.nextInt(alturaMaxima + 1);
        }

        for (int nivel = alturaMaxima; nivel >= 0; nivel--) {
            for (int i = 0; i < numBarras; i++) {
                if (alturas[i] > nivel) {
                    System.out.print("= ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            delay(200); // Pausa entre cada línea de la animación
        }
    }
    // Delay 12

    public void g2_delay12(int anchoPantalla) {
        int delayTime = 100;
        for (int i = 0; i < anchoPantalla; i++) {
            limpiarPantalla();
            imprimirFigura(i);
            delay(delayTime);
        }

        for (int i = anchoPantalla; i >= 0; i--) {
            limpiarPantalla();
            imprimirFigura(i);
            delay(delayTime);
        }
    }

    public void imprimirFigura(int espacios) {
        String figura[] = {
                "   \\\\| | |//   ",
                "    ( > < )    ",
                " ooO-(_)-Ooo "
        };

        for (String linea : figura) {
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println(linea);
        }
    }
}
