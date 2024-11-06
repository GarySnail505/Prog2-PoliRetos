package poli_retos.Automatas;

public class Automata05 {
         private char[]  letras_L = {'a','b','c','d','e','f','g','h','i','j','k','l','n','m','o','p','q','r','s','t','u','v','w','x','y','z'} ;
         public int error= -1;         
         public int aceptacion=25;
         public String frase;
         public char[] alfabeto={'$','_',' ',',',';','=','-'};
         public char[] numero={'0','1','2','3','4','5','6','7','8','9'};
         public int [][]matriz_de_transicion=
         {// l n $ _ "" , ; = -
            {1,error,1,1,1,error,error,error,error},//q0
            {2,2,2,2,7,0,5,3,error},//q1
            {2,2,2,2,6,0,5,3,error},//q2
            {4,4,error,error,4,error,error,error,error},//q3
            {4,4,error,error,8,0,5,8,error},//q4
            {error,error,error,error,error,error,aceptacion,error,aceptacion},//q5
            {error,error,error,error,6,0,5,3,error},//q6
            {error,error,error,error,7,0,5,3,error},//q7
            {error,error,error,error,error,0,5,error,error},//q8
        };

    public Automata05(String frase) {
        this.frase=frase+"-";
        g2_compara_alfabeto();
    }
        
        public void g2_compara_alfabeto(){
            int q = 0;
            for (int i = 0; i < frase.length(); i++) {
                for (int j = 0; j < letras_L.length; j++) {
                    if (frase.charAt(i) == letras_L[j]) {
                        q = matriz_de_transicion[q][0];
                    }
                }
                if (q == error) {
                    System.out.println("La variable esta incorrectamente declarada");
                    break;
                }
                for (int j = 0; j < numero.length; j++) {
                    if (frase.charAt(i) == numero[j]) {
                        q = matriz_de_transicion[q][1];
                    }
                }
                if (q == error) {
                    System.out.println("La variable esta incorrectamente declarada");
                    break;
                }
                for (int j = 0; j < alfabeto.length; j++) {
                    if (frase.charAt(i) == alfabeto[j]) {
                        q = matriz_de_transicion[q][j + 2];
                    }
                }
                if (q == error) {
                    System.out.println("La variable esta incorrectamente declarada");
                    break;
                }
            }
            if (q == aceptacion) {
                System.out.println("La variable esta correctamente declarada");
            }
        }         
    }

