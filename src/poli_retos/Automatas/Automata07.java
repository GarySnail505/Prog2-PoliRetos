package poli_retos.Automatas;

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
}