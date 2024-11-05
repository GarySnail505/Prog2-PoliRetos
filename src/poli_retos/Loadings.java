package poli_retos;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Loadings {

    public void g2_loading01() {
        char[] simbolos = { '\\', '|', '/', '|' };
        System.out.print("\n- Serie l01.\n");
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

    public void g2_loading02() {
        System.out.print("\n- Serie l02.\n");
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

    public void g2_loading03() {
        System.out.print("\n- Serie l03.\n");
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

    public void g2_loading04() throws InterruptedException {
        String[] signos = {"0oo", "o0o", "oo0"};
        int total = 20;
        System.out.println("Cargando...");
        for (int i = 0; i <= total; i++) {
            System.out.print(signos[i % signos.length] + " " + (i * 5) + "%\r");
            Thread.sleep(500);
        }
        System.out.println(signos[1] + " 100%");
    }

    public void g2_loading05() throws InterruptedException {
        int total = 20;
        System.out.println("Cargando...");
        for (int i = 0; i <= total; i++) {
            int progress = (i * 100) / total;
            StringBuilder barra = new StringBuilder();
            for (int j = 0; j < total; j++) {
                if (j < i) {
                    barra.append("=");
                } else if (j == i) {
                    barra.append(i % 2 == 0 ? ">" : "-");
                } else {
                    barra.append(" ");
                }
            }
            System.out.print("[" + barra + "] " + progress + "%\r");
            Thread.sleep(500);
        }
        System.out.println("[====================] 100%");
    }

    public void g2_loading06() throws InterruptedException {
        int total = 20;
        int barLength = 5; // Length of "<=>"
        int progress = 0;

        for (int i = 0; i <= total - barLength; i++) {
            System.out.print("[");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("<=>");

            for (int j = 0; j < total - i - barLength; j++) {
                System.out.print(" ");
            }

            progress = (i * 100) / (total - barLength);
            System.out.print("] " + progress + "%\r");
            Thread.sleep(300);
        }
        System.out.print("[====================] 100%");
    }

    public void g2_loading07() throws InterruptedException {
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

    public void g2_loading08() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S07.");
        System.out.print("Ingrese una palabra o frase la letra con 'J' o 'j':\n  ");

        String nombre = scanner.nextLine();

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

    public void g2_loading11(int numBarras, int alturaMaxima) {
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

    private void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void g2_loading12(int anchoPantalla) {
        int delayTime = 100;
        for (int i = 0; i < anchoPantalla; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            imprimirFigura(i);
            delay(delayTime);
        }

        for (int i = anchoPantalla; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            imprimirFigura(i);
            delay(delayTime);
        }
    }

    private static void imprimirFigura(int espacios) {
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
