package poli_retos;

public class Recursividad {
    public int g2_recursividad_01(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*g2_recursividad_01(n-1);
    }

    public int g2_recursividad_02(int a, int b){
        if(b==0)
            return a+0;
        else
            return g2_recursividad_02(a+1, b-1);
    }

    public static void g2_recursividad_06(int numero){
        if (numero < 0) {
            System.out.println("No válido");
        } else {
            System.out.println(numero);
            if (numero > 0) {
                g2_recursividad_06(numero - 1);
            }
        }
    }

}
