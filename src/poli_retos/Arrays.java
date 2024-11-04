package poli_retos;

public class Arrays {

    public static void g2_arrays03(String nombre) {
        System.out.println("\nPlano de coordenadas para la función f(x) = 2x:");
        int ejeY = nombre.length(); 
        for (int y = 0; y <= ejeY; y++) {
            if (y < ejeY) {
                System.out.printf("%3d |", ejeY - y);
            } else {
                System.out.printf("%3d |", 0);
                System.out.print(" _");
            }
            for (int x = 0; x < nombre.length(); x++) {
                if (y == x) { 
                    System.out.print(" " + nombre.charAt(x) + " ");
                } else {
                    System.out.print("   "); 
                }
            }
            System.out.println(); 
        }
        System.out.print("      ");
        for (int x = 0; x < nombre.length(); x++) {
            System.out.printf("%3d", x); 
        }
        System.out.println();
    }
    
    public void Array04(){
        char nombre[] = {'G','A','R','Y'};
        char apellido[] = {'D','E','F','A','S'};

        int max = Math.max(nombre.length, apellido.length);

        for (int f = 0; f < max; f++) {
            for (int c = 0; c < max; c++) {
                if (f < nombre.length && f == c)
                    System.out.print(nombre[c] + " ");
                else
                    System.out.print(" ");

                if (f == max - c - 1 && f < apellido.length)
                    System.out.print(apellido[f] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
