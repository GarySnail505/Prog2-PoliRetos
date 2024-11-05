package poli_retos.Automatas;
import java.util.Scanner;

public class Automata06 {
        final String alfabeto = "a-c-e-f-h-i-l-o-r-s- -(-)- ";
        final int er = -1,          
                  e1 = 100, // if()
                  e2 = 200, // else()
                  e3 = 300, // ifelse()
                  e4 = 400, // foreach()
                  e5 = 500, // for
                mt[][] ={//  a     c     e     f     h     i     l      o    r     s    " "    (     )    enter  esp.
                            {er   ,er   ,2    ,3    ,er   ,1    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q0
                           ,{er   ,er   ,er   ,4    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q1
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,5    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q2
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,6    ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q3
                           ,{er   ,er   ,7    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,8    ,9    ,er   ,er   ,er}//q4
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,11   ,er   ,er   ,er   ,er   ,er}//q5
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,12   ,er   ,er   ,er   ,er   ,er   ,er}//q6
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,10   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q7
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,9    ,er   ,er   ,er}//q8
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,13   ,er   ,er}//q9
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,14   ,er   ,er   ,er   ,er   ,er}//q10
                           ,{er   ,er   ,15   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q11
                           ,{er   ,er   ,17   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,31   ,30   ,er   ,er   ,er}//q12
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e1   ,e1}//q13
                           ,{er   ,er   ,19   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q14
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,16   ,20   ,er   ,er   ,er}//q15
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,20   ,er   ,er   ,er}//q16
                           ,{18   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q17
                           ,{er   ,21   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q18
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,22   ,23   ,er   ,er   ,er}//q19
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,24   ,er   ,er}//q20
                           ,{er   ,er   ,er   ,er   ,26   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q21
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,23   ,er   ,er   ,er}//q22
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,25   ,er   ,er}//q23
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e2   ,e2}//q24
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e3   ,e3}//q25
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,28   ,27   ,er   ,er   ,er}//q26
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,29   ,er   ,er}//q27
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,27   ,er   ,er}//q28
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e4   ,e4}//q29
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,32   ,er   ,er}//q30
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,30   ,er   ,er   ,er}//q31
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e5   ,e5}//q32
                        };

        @SuppressWarnings("resource")
        private int getIndexAlfabeto(String moneda){
            Scanner scAlfa = new Scanner(alfabeto).useDelimiter("-");
            for (int indexAlfa = 0; scAlfa.hasNext(); indexAlfa++) 
                if(moneda.equals(scAlfa.next()))
                    return indexAlfa;
            return -1;
        }

        @SuppressWarnings("resource")
        public void validarSecuencia(String input) {
            int q = 0;
            Scanner w = new Scanner(input).useDelimiter("-");
            for(int indexAlfa = 0; w.hasNext(); ){
                indexAlfa = getIndexAlfabeto(w.next());
                if(indexAlfa < 0 || mt[q][indexAlfa] == er)
                    break;
                q = mt[q][indexAlfa];
            }
            switch(q){
                case e1: System.out.println("if()"); break;
                case e2: System.out.println("else()"); break;
                case e3: System.out.println("ifelse()"); break;
                case e4: System.out.println("foreach()"); break;
                case e5: System.out.println("for()"); break;
                default: System.out.println("No válido"); break;
            }
        }
    }

public class Automata07 {
    final int er = -1, 
              e1 = 100,
              e2 = 200; 
              
    final int[][] mt = {
        {1, 1, 1, 1},  
        {2, 2, 2, 2},  
        {3, 3, 3, 3},  
        {4, 4, 4, 4},  
        {e1, e1, e1, e1} 
    };

    private int clavef(char clave) {
        if (Character.isUpperCase(clave)) {
            return 0; 
        } else if (Character.isLowerCase(clave)) {
            return 1; 
        } else if (Character.isDigit(clave)) {
            return 2; 
        } else if ("@!#·~$€%¬&/=?¡'.,_-".indexOf(clave) != -1) {
            return 3;  
        }
        return -1;  
    }

    public void validar(String clave) {
        int q = 0; 
        for (char c : clave.toCharArray()) {
            int tipo = clavef(c);
            if (tipo == -1 || mt[q][tipo] == er) {
                q = e2; 
                break;
            }
            q = mt[q][tipo];
        }

        if (clave.length() >= 8 && q == e1) {
            System.out.println("Clave válida");
        } else {
            System.out.println("La clave ingresada no es válida");
        }
    }
