package poli_retos;

import java.util.ArrayList;
import java.util.List;

public class SeriesNumericas {
    int a, b, c, repeticiones, terminos;
    int cantidadTerminos, inicio;

    public SeriesNumericas(int termino) {
        this.terminos = termino;
        g2_serieN01();
        g2_serieN02();
        g2_serieN03();
        g2_serieN04();
        g2_serieN05();
        g2_serieN06();
        g2_serieN07();
        g2_serieN08();
        g2_serieN09();
        g2_serieN10();
        g2_serieN12();
    }

    private void g2_serieN01() {
        int termino_anterior = 1,
                termino_penultimo = 0,
                termino_actual = 0;
        System.out.print("\n- Serie N01.\n");
        System.out.print("0 1 ");
        for (int contador = 0; contador < terminos; contador++) {
            termino_actual = termino_anterior + termino_penultimo;
            termino_penultimo = termino_anterior;
            termino_anterior = termino_actual;
            System.out.print(termino_actual + " ");
        }
    }

    private void g2_serieN02() {
        int termino = 0;
        System.out.print("\n- Serie N02.\n");
        for (int contador = 1; contador <= this.terminos; contador++) {
            termino = (contador % 2 != 0) ? contador : 0;
            System.out.print(termino + " ");
        }
    }

    public void g2_serieN03() {
        int termino_actual_serie1,
                termino_anterior_serie1 = 1,
                termino_serie2 = 3,
                termino_penultimo_serie1 = 0;
        System.out.print("\n- Serie N03.\n");
        System.out.print("0/1 1/3 ");
        for (int contador = 0; contador < terminos; contador++) {
            termino_serie2 = termino_serie2 + 2;
            termino_actual_serie1 = termino_anterior_serie1 + termino_penultimo_serie1;
            termino_penultimo_serie1 = termino_anterior_serie1;
            termino_anterior_serie1 = termino_actual_serie1;
            System.out.print(termino_actual_serie1 + "/" + termino_serie2 + " ");
        }
    }

    public void g2_serieN04() {
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador = 2;
        System.out.print("\n- Serie N04.\n");
        for (int i = 0; i < terminos; i++) {
            Fraccion fraccionActual = new Fraccion(numerador1, denominador);
            System.out.print(fraccionActual+" ");
            int siguiente = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = siguiente;
            denominador += 2;
        }
    }

    static class Fraccion {
        private int numerador;
        private int denominador;

        public Fraccion(int numerador, int denominador) {
            this.numerador = numerador;
            this.denominador = denominador;
        }

        public int getDenominador() {
            return denominador;
        }

        public int getNumerador() {
            return numerador;
        }

        @Override
        public String toString() {
            return numerador + "/" + denominador;
        }
    }

    public void g2_serieN05() {
        List<Integer> primos = new ArrayList<>();
        int numero = inicio;
        System.out.print("\n- Serie N05.\n");
        while (primos.size() < terminos) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }

    private boolean esPrimo(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public void g2_serieN06() {
        System.out.print("\n- Serie N06.\n");
        for (int i = 1; i <= terminos; i++) {
            System.out.print(i * i + " ");
        }
    }

    public void g2_serieN07() {
        a = 1;
        repeticiones = 0;
        System.out.print("\n- Serie N07.\n");
        for (int i = 0; i < terminos; i++) {
            System.out.print(a + " ");
            a += 3;
        }
    }

    public void g2_serieN08() {
        a = 3;
        repeticiones = 0;
        System.out.print("\n- Serie N08.\n");
        for (int i = 0; i < terminos; i++) {
            System.out.print(a + " ");
            a += 5;
        }
    }

    public void g2_serieN09() {
        int total = 1;
        System.out.print("\n- Serie N09.\n");
        for (int i = 0; i < terminos; i++) {
            total = total * 2;
            System.out.print(total + " ");
        }
    }

    public void g2_serieN10() {
        int total = 1;
        System.out.print("\n- Serie N010.\n");
        for (int i = 0; i < terminos; i++) {
            total = total * 3;
            System.out.print(total + " ");
        }
    }

    private void g2_serieN12() {
        int termino = 0,
                patron = 2;
        System.out.print("\n- Serie N012.\n");
        for (int contador = 0; contador < terminos; contador++) {
            termino = termino + patron;
            System.out.print(termino + " ");
            patron = patron + 2;
        }
        System.out.println();
    }
}

