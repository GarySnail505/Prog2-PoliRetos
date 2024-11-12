package poli_retos.Automatas;

import java.util.Scanner;

public class Automata04 {
    final int ee = 100, aceptado = 500;
    final String alfabeto4 = "+,-,0,1,2,3,4,5,6,7,8,9,.";

    int[][] matriz4 = {
            // +  -   0  1  2  3  4  5  6  7  8  9   .
            { 1,  1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, ee }, // q0
            { ee, ee, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 }, // q1
            { ee, ee, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, ee }, // q2
            { ee, ee, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, ee } // q3
    };
    public Automata04(){
        g2_automata4();
    }
    public void g2_automata4() {
        System.out.print("\n- Automata A04.\n");
        System.out.println("Ingrese el número que desea (utilizando el . para separar decimales): ");
        int n = 0;
        Scanner sc = new Scanner(System.in);
        String lectura = sc.nextLine();

        char[] elementos = lectura.toCharArray();

        for (char elemento : elementos) {
            int indice = devolverIndice4(elemento);
            if (indice < 0 || matriz4[n][indice] == ee) {
                n = ee;
                break;
            }
            n = matriz4[n][indice];
        }

        switch (n) {
            case ee:
                System.out.println("El número no es decimal :(");
                break;

            case 1:
                System.out.println("El número no es decimal :(");
                break;
            case 2:
                System.out.println("El número no es decimal :(");
                break;
            case 3:
                System.out.println("El número es decimal :)");
                break;
            default:
                System.out.println("Caracteres no válidos.");
                break;
        }
    }

    @SuppressWarnings("resource")
    private int devolverIndice4(char elemento) {

        Scanner lecturaAlfabeto = new Scanner(alfabeto4).useDelimiter(",");

        for (int k = 0; lecturaAlfabeto.hasNext(); k++) {
            String siguiente = lecturaAlfabeto.next();

            if (elemento == siguiente.charAt(0)) {

                return k;
            }

        }
        return -1;

    }

}