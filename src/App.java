//import java.lang.reflect.Array;
import poli_retos.SeriesNumericas;

import java.util.Scanner;

import poli_retos.Arrays;
import poli_retos.Automata06;
import poli_retos.Recursividad;

public class App {
    public static void main(String[] args) throws Exception {
        SeriesNumericas op = new SeriesNumericas();
        Arrays arr = new Arrays();
        Recursividad rec = new Recursividad();
        Automata06 automata = new Automata06();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la secuencia a validar (use '-' como separador entre caracteres): ");
        String input = sc.nextLine();

        automata.validarSecuencia(input);
        //op.LectorDatos();
        //op.Serie01();
        //arr.Array04();
        System.out.println(rec.recursividad_01(5));
        System.out.println(rec.recursividad_02(2, 5));
    }
}
