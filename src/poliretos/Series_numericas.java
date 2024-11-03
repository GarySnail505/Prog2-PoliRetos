package poliretos;

public class Series_numericas {
    public int longitud_serie;
    public int nivel;

    public Series_numericas(int longitud, int nivel) {
        this.longitud_serie = longitud;
        this.nivel = nivel;
        serie_1_fibonacci();
        serie_2();
        serie_3();
        serie_4();
        serie_10();
        serie_12();
    }

    private int serie_1_fibonacci() {
        int termino_anterior = 1,
                termino_penultimo = 0,
                termino_actual = 0;
        System.out.print("0 1 ");
        for (int contador = 0; contador < longitud_serie; contador++) {
            termino_actual = termino_anterior + termino_penultimo;
            termino_penultimo = termino_anterior;
            termino_anterior = termino_actual;
            System.out.print(termino_actual + " ");
        }
        System.out.println();
        return 0;
    }

    private void serie_2() {
        int termino = 0;
        for (int contador = 1; contador <= longitud_serie; contador++) {
            termino = (contador % 2 != 0) ? contador : 0;
            System.out.print(termino + " ");
        }
        System.out.println();
    }

    private void serie_3() {
        int termino_actual_serie1,
                termino_anterior_serie1 = 1,
                termino_serie2 = 3,
                termino_penultimo_serie1 = 0;
        System.out.print("0/1 1/3 ");
        for (int contador = 0; contador < longitud_serie; contador++) {
            termino_serie2 = termino_serie2 + 2;
            termino_actual_serie1 = termino_anterior_serie1 + termino_penultimo_serie1;
            termino_penultimo_serie1 = termino_anterior_serie1;
            termino_anterior_serie1 = termino_actual_serie1;
            System.out.print(termino_actual_serie1 + "/" + termino_serie2 + " ");
        }
        System.out.println();
    }

    private void serie_4() {
        int termino_actual_serie1,
                termino_anterior_serie1 = 1,
                termino_serie2 = 4,
                termino_penultimo_serie1 = 0;
        System.out.print("0/2 1/4 ");
        for (int contador = 0; contador < longitud_serie; contador++) {
            termino_serie2 = termino_serie2 + 2;
            termino_actual_serie1 = termino_anterior_serie1 + termino_penultimo_serie1;
            termino_penultimo_serie1 = termino_anterior_serie1;
            termino_anterior_serie1 = termino_actual_serie1;
            System.out.print(termino_actual_serie1 + "/" + termino_serie2 + " ");
        }
        System.out.println();
    }

    private void serie_10() {
        int termino = 1;
        for (int contador = 0; contador < longitud_serie; contador++) {
            termino = termino * 3;
            System.out.print(termino + " ");
        }
        System.out.println();
    }

    private void serie_12() {
        int termino = 0,
         patron=2;
        for (int contador = 0; contador < longitud_serie; contador++) {
            termino = termino+patron;
            System.out.print(termino + " ");
            patron=patron+2;
        }
        System.out.println();
    }
}