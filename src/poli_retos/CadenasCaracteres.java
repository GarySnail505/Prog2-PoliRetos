package poli_retos;

import java.util.Scanner;

public class CadenasCaracteres {

    String vocales = "a e i o u";
    String consonantes = "b c d f g h j k l m n p q r s t v w x y z";
    String palabra,frase,vocal, consonante;
    public CadenasCaracteres(String frase){
        this.palabra=frase;
        g2_serieCC01();
        g2_serieCC02();
        g2_serieCC05();
        g2_serieCC06();
        g2_serieCC07();
    }

    public CadenasCaracteres(String frase,String vocal){
        this.frase=frase;
        this.vocal=vocal;
        g2_serieCC03();
    }

    public CadenasCaracteres(String frase,int indice){
        this.palabra=frase;
        g2_serieCC09();
    }
    


    public void g2_serieCC01( ) {
        System.out.println("\n- Serie CC01:");
        System.out.println("\nFrase o palabra ingresada:" + palabra);
        int contadorVocales = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La palabra o frase tiene: " + contadorVocales + " vocales.");
    }

    public void g2_serieCC02() {
        int contadorConsonantes = 0;
        System.out.println("\n- Serie CC02:");
        System.out.println("\nFrase o palabra ingresada: " + palabra);
        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));
            if (Character.isLetter(letra) && "aeiou".indexOf(letra) == -1){
                contadorConsonantes++;
            }
        }
        System.out.println("La palabra o frase tiene: " + contadorConsonantes + " consonantes.");
    }

    public void g2_serieCC03() {
        System.out.println("\n- Serie CC03:");

        if (vocales.contains(vocal)) {
            String fraseNueva = frase.replace(vocal, " ");
            System.out.println(fraseNueva);
        } else {
            System.out.println("No ha ingresado una vocal");
        }
    }

    public void g2_serieCC04(String frase, String consonante) {
        System.out.println("\n- Serie CC04:");

        if (consonantes.contains(consonante)) {
            String fraseNueva = frase.replace(consonante, " ");
            System.out.println(fraseNueva);
        } else {
            System.out.println("No ha ingresado una consonante");
        }

    }

    public void g2_serieCC05() {
        System.out.println("\n- Serie CC05. Invertir frase con vocales en mayúsculas:");
        palabra=palabra.toLowerCase();
        char[] frase=this.palabra.toCharArray();
        for (int indice = frase.length-1; indice >0; indice--) {
            if(frase[indice]== 'a' || frase[indice] == 'e' || frase[indice] == 'i' || frase[indice] == 'o' || frase[indice] == 'u'){
                frase[indice]=Character.toUpperCase(frase[indice]);
            }
            System.out.print(frase[indice]);
        }
        System.out.println();
    }

    public void g2_serieCC06() {
        System.out.println("\n- Serie CC06. Invertir frase con consonantes en mayúsculas:");
        palabra=palabra.toLowerCase();
        
        char[] frase=this.palabra.toCharArray();
        for (int indice = frase.length-1; indice >0; indice--) {
            if(!(frase[indice]== 'a' || frase[indice] == 'e' || frase[indice] == 'i' || frase[indice] == 'o' || frase[indice] == 'u')){
                frase[indice]=Character.toUpperCase(frase[indice]);
            }
            System.out.print(frase[indice]);
        }
        System.out.println();

    }


    public void g2_serieCC07() {
        System.out.print("\n- Serie CC07.");
        System.out.print("Ingrese una palabra o frase la letra con 'J' o 'j':\n  ");     
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.print("\n  Su frase aparecerá en mayúsculas y sin la letra previa:\n  ");
        String nueva_frase=frase.replaceAll("[J,j]", "");
        System.out.println(nueva_frase.toUpperCase());
    }

    private static final String respuesta_CC08 = "sapo";

    public void g2_serieCC08() {
        String palabra=this.palabra;
        int contador = 1;
        boolean ingresa = false;
        System.out.print("\n- Serie CC08.\n");
        System.out.print("Anagrama de palabras...");
        do {
            System.out.print("  Anagrama: paso - poas - sapo - opas.-\n");
            System.out.print("  Adivina y escribe en cual de estas palabras está pensando el computador.\n");
            System.out.print("  Únicamente tienes 3 intentos juas juas.\n  ");
            if (palabra.equals(respuesta_CC08)) {
                ingresa = true;
                System.out.print("________________________________________________________\n");
            } else {
                System.out.print("________________________________________________________\n");
                System.out.println("\n  La palabra \"" + palabra + "\" es incorrecta, elige otra del anagrama.\n");
                System.out.println("\n  Vas \"" + contador + "\" intentos.");
                contador++;
            }
        } while (!ingresa && contador <= 3);

        if (!ingresa) {
            System.out.println("\n  La respuesta era \"sapo\", se acabaron tus intentos :( !");
        } else {
            System.out.print("\n  Su respuesta es correcta, \"sapo\" era la palabra. ¡Ganaste! :)");
        }
    }
    private void g2_serieCC09() {
        System.out.println("\n- Serie CC09:");
        Scanner separador = new Scanner(this.palabra.toLowerCase());
        while (separador.hasNext()) {
            String frases = separador.next();
            String frase;
            char[] palabras = frases.toCharArray();
            for (int contador = 0; contador < frases.length(); contador++) {
                palabras[contador] = (contador % 2 == 0) ? Character.toUpperCase(palabras[contador])
                        : Character.toLowerCase(palabras[contador]);
            }
            frase = new String(palabras);
            System.out.print(frase + " ");
        }
    }
}
