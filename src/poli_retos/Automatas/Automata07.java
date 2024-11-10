package poli_retos.Automatas;
import java.util.Scanner;

public class Automata07 {
    
    final int er = -1, 
              e0 = 0,
              e1 = 1,
              e2 = 2,
              e3 = 3,
              e4 = 4,
              e5 = 5; 
              
    final int[][] mt = {
        {e1, e2, e3, e4},  
        {e1, e2, e3, e4},  
        {e1, e2, e3, e4},  
        {e1, e2, e3, e4},  
        {e5, e5, e5, e5} 
    };

    public Automata07(){
        validar();
    }

    private int clavef(char clave) {
        if (Character.isLowerCase(clave)) {
            return 0; 
        } else if (Character.isUpperCase(clave)) {
            return 1; 
        } else if (Character.isDigit(clave)) {
            return 2; 
        } else if (!Character.isLetterOrDigit(clave)) {
            return 3;  
        }
        return -1;  
    }

    public void validar() {
        System.out.print("\n- Automata 07.");
        System.out.println("\nIngrese una clave ");
        System.out.println("La clave debe tener mínimo 8 dígitos y por lo menos:");
        System.out.println("- Una letra mayúscula, una letra minúscula, un número y un carácter especial.");
        Scanner scanner = new Scanner(System.in);
        String clave = scanner.nextLine();

        int q = e0; 
        boolean[] requisitosCumplidos={false, false, false, false};
        for (char c : clave.toCharArray()) {
            int tipo = clavef(c);
            if (tipo == -1) {
                System.out.println("Caracter no valido. ");
                return;
            }
            if (mt[q][tipo]==e5){
                requisitosCumplidos[tipo] = true;
            }
        q = mt[q][tipo];
    }
    if (requisitosCumplidos[0] && requisitosCumplidos[1] && requisitosCumplidos[2] && requisitosCumplidos[3]) {
        System.out.println("La cadena no es válida.");
    } else {
        System.out.println("La cadena es válida.");
    }
}
}
