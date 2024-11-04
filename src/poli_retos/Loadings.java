package poli_retos;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Loadings {
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
    //Delay 12

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
