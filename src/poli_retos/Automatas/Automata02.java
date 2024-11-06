package poli_retos.Automatas;

import java.util.Scanner;

public class Automata02 {

    final int er = -1, 
              e0 = 0,  
              e1 = 1,
              e2 = 2,
              e3 = 3,
              e4 = 4;  
              
    final int[][] mt = {
        {e1, er, er, er},  
        {er, e2, er, er},  
        {er, e2, e3, er},  
        {e4, er, er, er},  
        {er, er, er, er}
    };
    public Automata02() {
        validar();
    }
    
    private int clavef(char clave) {
        if (clave == 'a') {
            return 0; 
        } else if (clave == 'b') {
            return 1; 
        } else if (clave == 'c') {
            return 2; 
        }
        return -1;  
    }

    public void validar() {
        System.out.print("\n- Automata 02.");
        System.out.println("\nIngrese una cadena en el formato ab+ca:");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();

        int q = e0; 
        for (char c : cadena.toCharArray()) {
            int tipo = clavef(c);
            if (tipo == -1 || mt[q][tipo] == er) {
                q = er; 
                break;
            }
            q = mt[q][tipo];
        }

        if (q == e4) {
            System.out.println("La cadena ingresada es válida.");
        } else {
            System.out.println("La cadena ingresada no es válida.");
        }
    }
}

