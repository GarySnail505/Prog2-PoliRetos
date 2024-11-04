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

}
