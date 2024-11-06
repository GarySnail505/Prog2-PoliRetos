package Menu;

import java.util.Scanner;
import poli_retos.*;
import poli_retos.Automatas.*;

public class menu {
    public String frase;
    public String[] nombres = { "Carrillo Cristhian", "Cardena Karina", "Defas Condor", "Diaz Pineda",
            "Guerra Melisa" };
    public String caracter;
    public String porcentajes;
    public int terminos,
            tamanio,
            numero_1,
            numero_2,
            opcion = 0,
            cuadrado = 10;
    Scanner teclado = new Scanner(System.in);

    public menu() {
        gr2_creditos();
        gr2_presentacion();
    }

    public void gr2_creditos() {
        System.out.println("\u001B[33m" + "\tCREDITOS");
        for (int indice = 0; indice < 5; indice++) {
            System.out.println("\u001B[34m" + "»" + "\u001B[37m" + "  " + this.nombres[indice]);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

    public void gr2_presentacion() {

        do {
            System.out.println("\u001B[34m" + "\n\t Menu" + "\u001B[37m");
            System.out.println("1. Series numericas y de caracteres");
            System.out.println("2. Figuras");
            System.out.println("3. Cadena de caracteres");
            System.out.println("4. Arrays");
            System.out.println("5. Loading");
            System.out.println("6. Recursion");
            System.out.println("7. Automatas");
            System.out.println("8. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese la cantidad de terminos");
                    terminos=teclado.nextInt();
                    SeriesNumericas serie_numericas= new SeriesNumericas(terminos);
                    SeriesCaracteres serie_Caracteres=new SeriesCaracteres(terminos);
                        break;
                    }
                    case 2: {
                        System.out.println("Ingrese el tamanio o la cantidad de niveles");
                        tamanio=teclado.nextInt();
                        SeriesFiguras serie_figura= new SeriesFiguras(tamanio);
                        break;
                    }
                    case 3: {
                        gr2_submenu_cadena();
                        break;
                    }
                    case 4: {
                        gr2_submenu_arrays();
                        break;
                    }
                    case 5: {
                        gr2_submenu_loadings();
                        break;
                    }
                    case 6: {
                        gr2_submenu_recursion();
                        break;
                    }
                    case 7: {gr2_submenu_automatas();
                        break;
                    }
                    case 8: {
                        return;
                    }
                    default: {
                        System.out.println("\u001B[31m"+"\tIngrese un numero entero entre el 1 y el 8");
                        break;
                    }
                }
        } while (opcion!=8);
    }

    public void gr2_submenu_cadena() {
        int opcion;
        System.out.println("\u001B[34m" + "\n\t Menu_Caracteres");
        System.out.println("1. Contar Vocales y Letras e Invertir");
        System.out.println("2. Eliminar Vocales y letras");
        System.out.println("3. Anagrama");
        System.out.println("4. Mayusculas");
        System.out.println("5. Salir");
        while (!(teclado.hasNextInt())) {
            System.out.println("\u001B[31m" + "Ingrese un número entero");
            teclado.nextLine();
        }
        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese una frase");
                frase = teclado.nextLine();
                CadenasCaracteres vocales_letras = new CadenasCaracteres(frase);
                break;
            }
            case 2: {
                System.out.println("Ingrese una frase");
                frase = teclado.next();
                System.out.println("Ingrese el caracter a eliminar");
                caracter = teclado.nextLine();
                CadenasCaracteres vocales_letras = new CadenasCaracteres(frase, caracter);
                break;
            }
            case 3: { //////
                String palabra;
                int contador = 1;
                boolean ingresa = false;
                System.out.print("\n- Serie S08.\n");
                System.out.print("Anagrama de palabras...");
                do {
                    System.out.print("  Anagrama: paso - poas - sapo - opas.-\n");
                    System.out.print("  Adivina y escribe en cual de estas palabras está pensando el computador.\n");
                    System.out.print("  Únicamente tienes 3 intentos juas juas.\n  ");
                    palabra = teclado.nextLine();

                    if (palabra.equals("sapo")) {
                        ingresa = true;
                        System.out.print("________________________________________________________\n");
                    } else {
                        System.out.print("________________________________________________________\n");
                        System.out.println(
                                "\n  La palabra \"" + palabra + "\" es incorrecta, elige otra del anagrama.\n");
                        System.out.println("\n  Vas \"" + contador + "\" intentos.");
                        contador++;
                    }
                } while (!ingresa && contador <= 3);

                if (!ingresa) {
                    System.out.println("\n  La respuesta era \"sapo\", se acabaron tus intentos :( !");
                } else {
                    System.out.print("\n  Su respuesta es correcta, \"sapo\" era la palabra. ¡Ganaste! :)");
                }
                teclado.nextLine();
                break;
            }
            case 4: {
                System.out.println("Ingrese una frase");
                frase = teclado.nextLine();
                CadenasCaracteres intercalar = new CadenasCaracteres(frase, 1);
                break;
            }
            case 5: {
                gr2_presentacion();
                break;
            }
            default: {
                System.out.println("\u001B[31m" + "\tIngrese un numero entero entre el 1 y el 5");
                break;
            }
        }
    }

    public void gr2_submenu_arrays() {
        int opcion;
        System.out.println("\u001B[34m" + "\n\t Menu_Arrays");
        System.out.println("1. Barra de carga");
        System.out.println("2. Iniciales del nombre");
        System.out.println("3. Matriz");
        System.out.println("4. Salir");
        while (!(teclado.hasNextInt())) {
            System.out.println("\u001B[31m" + "Ingrese un número entero");
            teclado.nextLine();
        }
        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese su nombre completo");
                frase = teclado.nextLine();
                System.out.println("Ingrese los porcentajes de presentacion de cada palabra");
                porcentajes = teclado.nextLine();
                Arrays barra_de_carga = new Arrays(frase, porcentajes);
                break;

            }
            case 2: {
                System.out.println("Ingrese su nombre completo:");
                frase = teclado.nextLine();
                System.out.println("Ingrese el tamaño:");
                while (!(teclado.hasNextInt())) {
                    System.out.println("\u001B[31m" + "Ingrese un número entero");
                    teclado.nextLine();
                }
                tamanio = teclado.nextInt();
                teclado.nextLine();
                System.out.println("El caracter que desea para las iniciales de su nombre:");
                caracter = teclado.nextLine();
                Arrays barra_de_carga = new Arrays(tamanio, frase, caracter.charAt(0));
                break;
            }
            case 3: {
                System.out.println("Ingrese su nombre completo:");
                frase = teclado.nextLine();
                Arrays matriz_ = new Arrays(frase);
                break;
            }
            case 4: {
                gr2_presentacion();
                break;
            }
            default: {
                System.out.println("\u001B[31m" + "\tIngrese un numero entero entre el 1 y el 5");
                break;
            }
        }
    }

    public void gr2_submenu_loadings() {
        int opcion;
        System.out.println("\u001B[34m" + "\n\t Menu_Loadings");
        System.out.println("1. Barra de carga");
        System.out.println("2. Nombre");
        System.out.println("3. Archivo");
        System.out.println("4. Salir");
        while (!(teclado.hasNextInt())) { 
            System.out.println("\u001B[31m"+ "Ingrese un número entero");
            teclado.nextLine();
        }
        opcion = teclado.nextInt();
        teclado.nextLine();
                switch (opcion) {
                    case 1: {
                        System.out.println("Ingrese un caracter:");
                        frase=teclado.next();
                        Loadings barra = new Loadings(frase);
                        break;
                    }
                    case 2: {
                        System.out.println("Ingrese el nombre completo:");
                        frase=teclado.nextLine();
                        Loadings barra_nombre = new Loadings(frase,1);
                        break;
                    }
                    case 3: { 
                        System.out.println("Ingrese el nombre del archivo:");
                        frase=teclado.nextLine();
                        Loadings barra_nombre = new Loadings(1,frase);
                        break;
                    }
                    case 4: {
                        gr2_presentacion();break;
                    }
                    default: {
                        System.out.println("\u001B[31m"+"\tIngrese un numero entero entre el 1 y el 4");
                        break;
                    }
                }
    }

    public void gr2_submenu_recursion() {
        int opcion;
        System.out.println("\u001B[34m" + "\n\t Menu_Recursion");
        System.out.println("1. Factorial y conteo");
        System.out.println("2. Suma y multiplicacion");
        System.out.println("3. Potencia");
        System.out.println("4. Salir");
        while (!(teclado.hasNextInt())) { 
            System.out.println("\u001B[31m"+ "Ingrese un número entero");
            teclado.nextLine();
        }
        opcion = teclado.nextInt();
        teclado.nextLine();
                switch (opcion) {
                    case 1: {
                    System.out.println("Ingrese el número 'n' para realizar el conteo y realizar el factorial: ");
                    while (!(teclado.hasNextInt())) { 
                        System.out.println("\u001B[31m"+ "Ingrese un número entero");
                        teclado.nextLine();
                    }
                        numero_1= teclado.nextInt();
                        Recursividad conteo_factorial=new Recursividad(numero_1);
                        break;
                    }
                    case 3: {
                    System.out.println("Ingrese la base (a) que quiere elevar: ");

                        while (!(teclado.hasNextInt())) { 
                            System.out.println("\u001B[31m"+ "Ingrese un número entero");
                            teclado.nextLine();
                        }
                            numero_1= teclado.nextInt();
                    System.out.println("Ingrese el exponente (b) al que desea elevar la base: ");
                    while (!(teclado.hasNextInt())) { 
                        System.out.println("\u001B[31m"+ "Ingrese un número entero");
                        teclado.nextLine();
                    }
                        numero_2= teclado.nextInt();
                        Recursividad potencia=new Recursividad(numero_1,numero_2);
                        break;
                    }
                    case 2: { 
                        System.out.println("Ingrese el primer numero: ");
                        while (!(teclado.hasNextInt())) { 
                            System.out.println("\u001B[31m"+ "Ingrese un número entero");
                            teclado.nextLine();
                        }
                            numero_1= teclado.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    while (!(teclado.hasNextInt())) { 
                        System.out.println("\u001B[31m"+ "Ingrese un número entero");
                        teclado.nextLine();
                    }
                        numero_2= teclado.nextInt();
                        Recursividad suma_multiplicacion=new Recursividad(numero_1,numero_2,1);
                        break;
                            }
                    case 4: { 
                gr2_presentacion();
                        break;
                    }
                    default: {
                        System.out.println("\u001B[31m"+"\tIngrese un numero entero entre el 1 y el 4");
                        break;
                    }
                }
    }

    public void gr2_submenu_automatas() {
        System.out.println("\u001B[34m" + "\n\t Menu_Automatas");
        System.out.println("1. Validar Cadena de caracteres a*b+c");
        System.out.println("2. Validar Cadena de caracteres ab+ca");
        System.out.println("3. Validar secuencia de numeros 1+/0+1*");
        System.out.println("4. Validacion decimal");
        System.out.println("5. Validacion variables");
        System.out.println("6. Validacion bucles");
        System.out.println("7. Validacion clave");
        System.out.println("8. Salir");
        while (!(teclado.hasNextInt())) { 
            System.out.println("\u001B[31m"+ "Ingrese un número entero");
            teclado.nextLine();
        }
        opcion = teclado.nextInt();
        teclado.nextLine();
                switch (opcion) {
                    case 1: {
                        Automata01 autoamata =new Automata01();
                    }
                    case 2: {
                        Automata02 autoamata2 =new Automata02();
                    }
                    case 3: { 
                        Automata03 autoamata3 =new Automata03();
                    }
                    case 4: {
                        Automata04 autoamata4 =new Automata04();

                    }
                    case 5: { System.out.println("Ingrese la cadena para validar si es una variable");
                    frase=teclado.nextLine();
                    Automata05 afd=new Automata05(frase);
                    }
                    case 6: {
                        Automata06 autoamata6 =new Automata06();
                    }
                    case 7: {
                        Automata07 autoamata7 =new Automata07();
                    }
                    case 8: {
                        gr2_presentacion();break;
                    }
                    default: {
                        System.out.println("\u001B[31m"+"\tIngrese un numero entero entre el 1 y el 7");
                        break;
                    }
                }
    }
}