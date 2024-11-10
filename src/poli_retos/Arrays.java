package poli_retos;

import java.util.Scanner;

public class Arrays {
    public String frase,porcentajes;
    public String[] matriz_;
    public char caracter;
    public Integer tamanio;
    public Arrays(String frase, String porcentajes){
        this.frase=frase;
        this.porcentajes=porcentajes;
        g2_array01();
    }
    public Arrays(int tamanio, String nombre,char caracter){
        this.tamanio=tamanio;
        this.frase=nombre;
        this.caracter=caracter;
        g2_arrays02();
        g2_arrays03();
    }
    public Arrays(String nombre){
        this.frase=nombre;
        g2_array04();
        g2_array05();

    }

    public void g2_array01() {
        Scanner separador= new Scanner(frase);
        String palabra;
        char[] letra;
        int i=0, por;
        matriz_=porcentajes.split(" ");
        int[] porcentajes=new int[matriz_.length];
        for (int indice = 0; indice < matriz_.length; indice++) {
            porcentajes[indice]=Integer.parseInt(matriz_[indice]) ;
        }
        while(separador.hasNext()){
            palabra=separador.next();
            letra=palabra.toCharArray();
            por=(int)Math.round((porcentajes[i]*palabra.length())/100);
            for (int barra = 0; barra <=10; barra++) {
                if(barra==0){
                    System.out.print("[");
                }else if(barra==10){
                    System.out.print("]");
                }else if(barra<Math.round(porcentajes[i]/11)){
                    System.out.print("=");
                }else if(barra==Math.round(porcentajes[i]/11)){
                    System.out.print(">");
                }else{System.out.print(" ");}
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
            System.out.print(porcentajes[i]+"% ");
            for (int j = 0; j < por; j++) {
                System.out.print(letra[j]);
            }
            System.out.println("");
            i++;
        }
    }
    //Array 02
    private void g2_arrays02(){
        System.out.print("\n- Array A02.\n");
        frase=frase.toLowerCase();
        char letra1=frase.charAt(0),
            letra2=frase.charAt(frase.indexOf(' ')+1);
        char[][][] matriz_letras;
        letras generador=new letras(tamanio,letra1,letra2,caracter);
        matriz_letras=generador.matriz();
        for (int filas = 0; filas < tamanio; filas++) {
            for (int columnas = 0; columnas < tamanio; columnas++) {
                System.out.print(matriz_letras[0][filas][columnas]);
            }
            System.out.print("        ");
            for (int columnas = 0; columnas < tamanio; columnas++) {
                System.out.print(matriz_letras[1][filas][columnas]);
            }
            System.out.println();
        }
}

    public void g2_arrays03() {
        System.out.print("\n- Array A03.");
        System.out.println("\nPlano de coordenadas para la función f(x) = 2x:");
        int ejeY = frase.length(); 
        for (int y = 0; y <= ejeY; y++) {
            if (y < ejeY) {
                System.out.printf("%3d |", ejeY - y);
            } else {
                System.out.printf("%3d |", 0);
                System.out.print(" _");
            }
            for (int x = 0; x < frase.length(); x++) {
                if (y == x) { 
                    System.out.print(" " + frase.charAt(x) + " ");
                } else {
                    System.out.print("   "); 
                }
            }
            System.out.println(); 
        }
        System.out.print("      ");
        for (int x = 0; x < frase.length(); x++) {
            System.out.printf("%3d", x); 
        }
        System.out.println();
    }

    public void g2_array04(){
        System.out.print("\n- Array A04.\n");
        matriz_=frase.split(" ");
        char nombre[] = matriz_[0].toCharArray();
        char apellido[] = matriz_[1].toCharArray();
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
        System.out.print("\n- Array A05.\n");
        String nombreCompleto = frase;
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
