package poli_retos;

public class Recursividad {
    public int numero_1,numero_2;
    public Recursividad(int numero_N){
        this.numero_1=numero_N;
        System.out.println("El factorial de:" + numero_1 + "!"+" = "+ g2_recursividad_01(numero_1));
        g2_recursividad_05();
        g2_recursividad_06(numero_1);
    }
    public Recursividad(int numero1,int numero2){
        this.numero_1=numero1;
        this.numero_2=numero2;
        System.out.println("La suma de " + numero1+" + "+numero2+" = "+g2_recursividad_02(this.numero_1,this.numero_2));
        System.out.println("La multiplicacion de " + numero1+" * "+numero2+" = "+g2_recursividad_03(this.numero_1,this.numero_2));
        g2_recursividad04();

    }
    public Recursividad(int numero1,int numero2,int i){
        this.numero_1=numero1;
        this.numero_2=numero2;
        System.out.println("La suma de " + numero1+" + "+numero2+" = "+g2_recursividad_02(this.numero_1,this.numero_2));
        System.out.println("La multiplicacion de " + numero1+" * "+numero2+" = "+g2_recursividad_03(this.numero_1,this.numero_2));
    }
    public int g2_recursividad_01(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * g2_recursividad_01(n - 1);
    }

    public int g2_recursividad_02(int a, int b) {
        if (b == 0)
            return a + 0;
        else
            return g2_recursividad_02(a + 1, b - 1);
    }
    private int g2_recursividad_03(int numero1,int numero2){
        if (numero2<=0){
            return 0;
        }
        numero2--;
        numero1=numero1+g2_recursividad_03(numero1,numero2);
        return numero1;
    }
    public void g2_recursividad04() {
        System.out.print("\n- Serie R04.\n");
        int base = numero_1;
        int exponente = numero_2;
        double resultado = potencia(base, exponente);
        System.out.println(base + "^" + exponente + " = " + resultado);
    }

    public static double potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return 1.0 / potencia(a, -b);
        } else {
            return a * potencia(a, b - 1);
        }
    }

    public void g2_recursividad_05() {
        System.out.print("\n- Serie R05.\n");
        int n = numero_1;
        System.out.println("Conteo progresivo hasta " + n + ":");
        conteoProgresivo(n, 1);
    }

    public void conteoProgresivo(int n, int current) {
        if (current > n) {
            return;
        } else {
            System.out.println(current);
            conteoProgresivo(n, current + 1);
        }
    }

    public void g2_recursividad_06(int numero) {
        if (numero < 0) {
            return;
        } else {
            System.out.println(numero);
            g2_recursividad_06(numero - 1);
        }
    }
}

