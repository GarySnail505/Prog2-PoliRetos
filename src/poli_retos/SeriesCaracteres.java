package poli_retos;

public class SeriesCaracteres {
    int a, b, c, i, j, k, l, veces;
    int terminos;
    final String Alfabeto = "a-b-c-d-e-f-g-h-i-j-k-l-m-n-o-p-q-r-s-t-u-v-w-x-y-z";
    String letrasSeparadas[] = Alfabeto.split("-");
    public SeriesCaracteres(int terminos){
        this.terminos=terminos;
        g2_serieC01();
        g2_serieC02();
        g2_serieC03();
        g2_serieC04();
        g2_serieC05();
        g2_serieC06();
        g2_serieCaracteres07();
        g2_serieCaracteres08();
        g2_serieCaracteres09();
    }
    
    // g2_serieC01
    private void g2_serieC01(){
        System.out.println("\nSerie de caracteres (+ -):");
        String caracter;
        for (int i = 0; i < terminos; i++) {
            caracter=(i%2==0)?" + ": " - ";
                System.out.print(caracter);
        }
    }
    
    // g2_seriec02
    private void g2_serieC02() {
        int fib1=1;
        int fib2=1;
        System.out.println("\nSerie de Fibonacci con signos (+):");
        if(terminos>=1){
            System.out.print("+ ");
        }
        for(int i=3; i<=terminos; i++){
            int siguiente=fib1+fib2;
            System.out.print("+".repeat(siguiente)+" ");
            fib1=fib2;
            fib2=siguiente;
        }
    }
    // g2_serieC03
    public void g2_serieC03() {
        k = 0;
        System.out.print("\n\n- serie C03. ++ +++ +++++ +++++++... (Primos):\n  ");

        for (int contador = 0, numero = 2; contador < terminos; numero++) {
            if (esPrimo(numero)) {
                while (k < numero) {
                    k++;
                    System.out.print("+");
                }
                k = 0;
                contador++;
                System.out.print(" ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void g2_serieC04() {
        System.out.print("\n\n- serie C04. + - * / + - * /... (Op. básicas):\n  ");
        char[] glosario = { '+', '-', '*', '/' };
        int termino = 0;
        while (termino < terminos) {
            for (int contador = 0; contador < 4; contador++) {
                if (!(termino < terminos)) {
                    break;
                }
                System.out.print(glosario[contador] + " ");
                termino++;
            }
        }
    }

    public void g2_serieC05() {
        System.out.print("\n\n- serie C05. | \\ | / - | \\ | / -... (Vaivén):\n ");
        char[] glosario = { '\\', '|', '/', '-', '|' };
        int termino = 0;
        while (termino < this.terminos) {
            for (int contador = 0; contador < 5; contador++) {
                if (!(termino < this.terminos)) {
                    break;
                }
                System.out.print(glosario[contador] + " ");
                termino++;
            }
        }
    }

    public void g2_serieC06() {
        char letra = 'a';
        System.out.print("\n\n- serie C06. a b c d e... (Abecedario):\n ");
        for (int i = 0; i < terminos; i++) {
            System.out.print(letra + " ");
            letra++;
            if (letra > 'z') {
                letra = 'a';
            }
        }
    }

    public void g2_serieCaracteres07() {
        int numeroRepeticiones = 2;
        System.out.print("\n\n- serie C07.  aa bbbb cccccc dddddddd ... (Abecedario):\n ");
        for (int i = 0; i < terminos; i++) {
            for (int j = 0; j < numeroRepeticiones; j++) {
                System.out.print(letrasSeparadas[i]);
            }
            System.out.print(" ");
            numeroRepeticiones += 2;
        }
    }

    public void g2_serieCaracteres08() {
        int numeroRepeticiones = 1;
        System.out.print("\n\n- serie C08. a bbb ccccc ddddddd eeeeeeeee... (Abecedario):\n ");
        for (int i = 0; i < terminos; i++) {
            for (int j = 0; j < numeroRepeticiones; j++) {
                System.out.print(letrasSeparadas[i]);
            }
            System.out.print(" ");
            numeroRepeticiones += 2;
        }
    }
    private void g2_serieCaracteres09() {
        char letra = 'c';
        int termino_actual,
                termino_anterior = 1,
                termino_penultimo = 0;
                System.out.print("\n\n- serie C09. a b c dd eee fffff... (Abecedario):\n ");
        System.out.print("a b ");
        for (int contador = 2; contador <= this.terminos; contador++) {
            termino_actual = termino_anterior + termino_penultimo;
            termino_penultimo = termino_anterior;
            termino_anterior = termino_actual;
            for (int i = 0; i < termino_actual; i++) {
                System.out.print(letra);
            }
            letra++;
            System.out.print(" ");
        }
    }
}