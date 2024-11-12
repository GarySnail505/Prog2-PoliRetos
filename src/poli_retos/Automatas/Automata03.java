package poli_retos.Automatas;

import java.util.Scanner;

public class Automata03 {
    final int ee = 100, ac = 500;
    final String alfabeto3 = "0-1- ";
    int[][] matriz3 = {
            { 2 , 1, ee }, // q0
            { ee, 1, ac }, // q1
            { 2 , 3, ac }, // q2
            { ee, 3, ac }, // q3
    };
    public Automata03(){
        g2_automata3();
    }

    public void g2_automata3() {
        System.out.print("\n- Automata A03.\n");
        System.out.println("Ingrese la cadena que desea verificar (separando los números con -): ");
        int n = 0;
        Scanner sc = new Scanner(System.in);
        String lectura = sc.nextLine();

        @SuppressWarnings("resource")
        Scanner eliminador = new Scanner(lectura).useDelimiter("-");

        for (int i = 0; eliminador.hasNext();) {
            i = devolverIndice3(eliminador.next());
            if (i < 0 || matriz3[n][i] == ee) {
                n = ee;
                break;
            }
            n = matriz3[n][i];
        }

        switch (n) {
            case ee:
                System.out.println("Cadena denegada");
                break;

            case 1:
                System.out.println("Cadena aceptada");
                break;
            case 2:
                System.out.println("Cadena aceptada");
                break;
            case 3:
                System.out.println("Cadena aceptada");
                break;
            case ac:
                System.out.println("Cadena aceptada");
                break;
            default:
                System.out.println("Cadena no válida");
        }

    }

    @SuppressWarnings("resource")
    private int devolverIndice3(String numero) {

        Scanner lecturaAlfabeto = new Scanner(alfabeto3).useDelimiter("-");

        for (int k = 0; lecturaAlfabeto.hasNext(); k++) {
            if (numero.equals(lecturaAlfabeto.next())) {
                return k;
            }
        }
        return -1;
    }
}
