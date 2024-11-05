package poli_retos;

import java.util.Scanner;

public class CadenasCaracteres {

    String vocales = "a e i o u";
    String consonantes = "b c d f g h j k l m n p q r s t v w x y z";

    public void g2_serieCC01() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S01.");
        System.out.print("Ingrese una frase para contar sus vocales:\n  ");

        String palabra = scanner.nextLine();

        System.out.println("\nFrase o palabra ingresada:");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S02.");
        System.out.print("Ingrese una palabra o frase para contar sus letras':\n  ");

        String palabra = scanner.nextLine();

        int contadorLetras = 0;
        System.out.println("\nFrase o palabra ingresada: " + palabra);
        for (int i = 0; i < palabra.length(); i++) {
            contadorLetras++;
        }
        System.out.println("La palabra o frase tiene: " + contadorLetras + " letras.");
    }

    public void g2_serieS03() {
        System.out.println("Ingrese una frase a la que desea eliminarle una vocal ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println("Ingrese la vocal que desea eliminar");
        String vocal = sc.next();
        if (vocales.contains(vocal)) {
            String fraseNueva = frase.replace(vocal, " ");
            System.out.println(fraseNueva);
        } else {
            System.out.println("No ha ingresado una vocal");
        }
    }

    public void g2_serieS04() {
        System.out.println("Ingrese una frase a la que desea eliminarle una consonante: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println("Ingrese la consonante que desea eliminar");
        String letra = sc.next();
        if (consonantes.contains(letra)) {
            String fraseNueva = frase.replace(letra, " ");
            System.out.println(fraseNueva);
        } else {
            System.out.println("No ha ingresado una consonante");
        }

    }

    public void g2_serieS05() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S05. Invertir frase con vocales en mayúsculas:");
        System.out.print("\nIngrese una palabra o frase:\n  ");

        String frase = scanner.nextLine();
        String fraseModificada = invertirYMayusculas(frase);
        System.out.println("\n  Frase invertida con vocales en mayúsculas:\n  " + fraseModificada);
    }

    public static String invertirYMayusculas(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();

        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (esVocal(c)) {
                builder.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return builder.toString();
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public void g2_serieS06() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S06. Invertir frase con consonantes en mayúsculas:");
        System.out.print("\nIngrese una palabra o frase:\n  ");

        String frase = scanner.nextLine();
        String fraseModificada = invertirYMayusculasConsonantes(frase);
        System.out.println("\n  Frase invertida con consonantes en mayúsculas:\n  " + fraseModificada);
    }

    public static String invertirYMayusculasConsonantes(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();

        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (!esVocal(c) && Character.isLetter(c)) {
                builder.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return builder.toString();
    }

    public void g2_serieS07() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S07.");
        System.out.print("Ingrese una palabra o frase la letra con 'J' o 'j':\n  ");

        String frase = scanner.nextLine();

        System.out.print("\n  Su frase aparecerá en mayúsculas y sin la letra previa:\n  ");
        frase = modificarFrase(frase);
        System.out.println(frase);
    }

    public static String modificarFrase(String frase) {
        StringBuilder builder = new StringBuilder(frase.toUpperCase());

        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (c == 'J') {
                builder.setCharAt(i, ' ');
            }
        }
        return builder.toString();
    }

    private static final String respuesta_s08 = "sapo";

    public void g2_serieS08() {
        Scanner scanner = new Scanner(System.in);
        String palabra;
        int contador = 1;
        boolean ingresa = false;

        System.out.print("\n- Serie S08.\n");
        System.out.print("Anagrama de palabras...");
        do {
            System.out.print("  Anagrama: paso - poas - sapo - opas.-\n");
            System.out.print("  Adivina y escribe en cual de estas palabras está pensando el computador.\n");
            System.out.print("  Únicamente tienes 3 intentos juas juas.\n  ");

            palabra = scanner.nextLine();

            if (palabra.equals(respuesta_s08)) {
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
        scanner.nextLine();
    }
}
