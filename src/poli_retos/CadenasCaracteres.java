package poli_retos;

import java.util.Scanner;

public class CadenasCaracteres {

        public void SerieS05() {
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

    public void SerieS06() {
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
    
    public void SerieS07() {
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
    public void SerieS08() {
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
