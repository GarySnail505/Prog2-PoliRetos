package poli_retos.Automatas;
import java.util.Scanner;

public class Automata06 {
        final String alfabeto = "a-c-e-f-h-i-l-o-r-s- -(-)- ";
        final int er = -1,          
                  e1 = 100, // if()
                  e2 = 200, // ifelse()
                  e3 = 300, // else()
                  e4 = 400, // for()
                  e5 = 500, // foreache()
                mt[][] ={//  a     c     e     f     h     i     l      o    r     s    " "    (     )    enter  esp.
                            {er   ,er   ,13   ,30   ,er   ,1    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q0
                           ,{er   ,er   ,er   ,2    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q1
                           ,{er   ,er   ,6    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,3    ,4    ,er   ,er   ,er}//q2
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,4    ,er   ,er   ,er}//q3
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,5    ,er   ,er}//q4
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e1   ,e1}//q5
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,7    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q6
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,8    ,er   ,er   ,er   ,er   ,er}//q7
                           ,{er   ,er   ,9    ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q8
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,10   ,11   ,er   ,er   ,er}//q9
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,11   ,er   ,er   ,er}//q10
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,12   ,er   ,er}//q11
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e2   ,e2}//q12
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,14   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q13
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,15   ,er   ,er   ,er   ,er   ,er}//q14
                           ,{er   ,er   ,16   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q15
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,17   ,18   ,er   ,er   ,er}//q16
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,18   ,er   ,er   ,er}//q17
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,19   ,er   ,er}//q18
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e3   ,e3}//q19
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,21   ,er   ,er   ,er   ,er   ,24   ,er   ,er}//q20
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,22   ,er   ,er   ,er   ,er   ,er   ,er}//q21
                           ,{er   ,er   ,26   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,23   ,24   ,er   ,er   ,er}//q22
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,24   ,er   ,er   ,er}//q23
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,25   ,er   ,er}//q24
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,e4   ,e4}//q25
                           ,{27   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,28   ,27   ,er   ,er   ,er}//q26
                           ,{er   ,28   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q27
                           ,{er   ,er   ,er   ,er   ,29   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er}//q28
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,30   ,31   ,er   ,er   ,er}//q29
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,31   ,er   ,er   ,er}//q30
                           ,{er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,er   ,32   ,er   ,er}//q31
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
        public void g2_automata6() {
            System.out.print("\n- Automata A07.\n");
            System.out.println("Ingrese el nombre de un bucle con sus () (utilizando el - para separar decimales): ");
            Scanner sc = new Scanner(System.in);
            String lectura = sc.nextLine();
            int q = 0;
            Scanner w = new Scanner(lectura).useDelimiter("-");
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

