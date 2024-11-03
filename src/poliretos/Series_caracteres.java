package poliretos;

public class Series_caracteres {
    public int longitud_serie;
    public int tipo_serie;

    public Series_caracteres(int longitud, int nivel) {
        this.longitud_serie = longitud;
        this.tipo_serie = nivel;
        serie_3();
        serie_9();
    }

    private void serie_1() {
        for (int contador = 0; contador < longitud_serie; contador++) {
            char termino;
            termino = (contador % 2 == 0) ? '+' : '-';
            System.out.print(termino + " ");
        }
    }

    private void serie_3() {
        char[] glosario = { '+', '-', '*', '/' };
        int termino = 0;
        while (termino < longitud_serie) {
            for (int contador = 0; contador < 4; contador++) {
                if (!(termino < longitud_serie)) {
                    break;
                }
                System.out.print(glosario[contador] + " ");
                termino++;
            }
        }
        System.out.println();

    }

    private void serie_4() {
        char[] glosario = { '\\', '|', '/', '-', '|' };
        int terminos = 0;
        while (terminos < longitud_serie) {
            for (int contador = 0; contador < 5; contador++) {
                if (!(terminos < longitud_serie)) {
                    break;
                }
                System.out.print(glosario[contador] + " ");
                terminos++;
            }
        }
    }

    private void serie_9() {
        char[] glosario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int termino_actual,
                termino_anterior = 1,
                termino_penultimo = 0;
        System.out.print("a b ");
        for (int contador = 2; contador <= longitud_serie; contador++) {
            termino_actual = termino_anterior + termino_penultimo;
            termino_penultimo = termino_anterior;
            termino_anterior = termino_actual;
            for (int i = 0; i < termino_actual; i++) {
                System.out.print(glosario[contador]);
            }
            System.out.print(" ");
        }
    }
}