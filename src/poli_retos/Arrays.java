package poli_retos;

import java.util.Scanner;

public class Arrays {

    public void g2_array01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase con múltiples palabras:");
        String frase = scanner.nextLine();
        
        String[] palabras = frase.split(" ");
        int[] porcentajes = new int[palabras.length];
        
        System.out.println("Ingrese los porcentajes de carga para cada palabra (separados por comas):");
        String porcentajesStr = scanner.nextLine();
        String[] porcentajesArr = porcentajesStr.split(",");
        
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = Integer.parseInt(porcentajesArr[i].trim());
        }
        
        for (int i = 0; i < palabras.length; i++) {
            int longitud = palabras[i].length();
            int caracteresCargados = (longitud * porcentajes[i]) / 100;
            
            System.out.print("[");
            for (int j = 0; j < longitud; j++) {
                if (j < caracteresCargados) {
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentajes[i] + "% " + palabras[i].substring(0, caracteresCargados));
            System.out.println();
        }
    }

    //Array 02


    public void g2_arrays03() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Array 03.");
        System.out.print("\nIngrese su nombre':\n  ");

        String nombre = scanner.nextLine();

        System.out.println("\nPlano de coordenadas para la función f(x) = 2x:");
        int ejeY = nombre.length(); 
        for (int y = 0; y <= ejeY; y++) {
            if (y < ejeY) {
                System.out.printf("%3d |", ejeY - y);
            } else {
                System.out.printf("%3d |", 0);
                System.out.print(" _");
            }
            for (int x = 0; x < nombre.length(); x++) {
                if (y == x) { 
                    System.out.print(" " + nombre.charAt(x) + " ");
                } else {
                    System.out.print("   "); 
                }
            }
            System.out.println(); 
        }
        System.out.print("      ");
        for (int x = 0; x < nombre.length(); x++) {
            System.out.printf("%3d", x); 
        }
        System.out.println();
    }

    public void Array04(){
        char nombre[] = {'G','A','R','Y'};
        char apellido[] = {'D','E','F','A','S'};

        int max = Math.max(nombre.length, apellido.length);

        for (int f = 0; f < max; f++) {
            for (int c = 0; c < max; c++) {
                if (f < nombre.length && f == c)
                    System.out.print(nombre[c] + " ");
                else
                    System.out.print(" ");

                if (f == max - c - 1 && f < apellido.length)
                    System.out.print(apellido[f] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    //Array 05
    public void g2_array05() {
        System.out.print("\n- Serie A05.\n");
        System.out.println("Ingrese su nombre completo");
        Scanner sc = new Scanner(System.in);
        String nombreCompleto = sc.nextLine();
        System.out.println("");
        String[] palabras = nombreCompleto.split(" ");
        String primerPalabra = palabras[0];
        int tamanoMatriz = primerPalabra.length();

        char[][] matriz = new char[tamanoMatriz][tamanoMatriz];

        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int k = 0; k < palabras.length; k++) {
            primerPalabra = palabras[k];
            

            for (char letra : primerPalabra.toCharArray()) {
                int x, y;

                x = (int) (Math.random() * tamanoMatriz);
                y = (int) (Math.random() * tamanoMatriz);

                if (matriz[x][y] != ' ') {
                    matriz[x][y] = '*';
                } else {
                    matriz[x][y] = letra;
                }

            }

        }
        mostrarMatriz(matriz, tamanoMatriz);
        System.out.println(" ");
    }

    public void mostrarMatriz(char[][] matriz, int tamanoMatriz) {
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                try {
                    Thread.sleep(200); // Esperar 200 ms entre letras
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (matriz[i][j] == ' ') {
                    System.out.print("  ");
                } else {
                    System.out.print(matriz[i][j]+" ");
                
                }

            }
            System.out.println(" ");
        }
    }
}
