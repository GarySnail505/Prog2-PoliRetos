package poli_retos;


import java.util.Random;
public class Loadings {
    public String frase;
    public float carga_actual = 0.00f;
    public Loadings(String frase){
        this.frase=frase;
        g2_loading01();
        g2_loading02();
        g2_loading03();
        g2_loading04();
        g2_loading05();
        g2_loading06();
        g2_loading07();
        System.out.println();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        g2_loading12(100);
    }
    public Loadings(String frase,int i){
        this.frase=frase;
        g2_loading08();
        g2_loading09();
    }
    public Loadings(int i,String frase){
        this.frase=frase;
        g2_loading10();
    }
    public Loadings(int base, int altura){
        g2_loading11(base, altura);
    }
    public void g2_loading01() {
        char[] simbolos = { '\\', '|', '/', '|' };
        System.out.print("\n- Serie l01.\n");
        for (int i = 0; i < 100; i++) {
            char simbolo = simbolos[i % simbolos.length];
            System.out.print("\r" + simbolo + "Cargando..." + i + "%");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\rCarga completa: 100%\n");
    }

    public void g2_loading02() {
        System.out.print("\n- Serie l02.\n");
        String lectura = frase;
        char s = lectura.charAt(0);
        char[] simbolos = { '[', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ']' };

        for (int i = 1; i < simbolos.length - 2; i++) {
            simbolos[i] = s;

            StringBuilder barra = new StringBuilder();
            for (char simbolo : simbolos) {
                barra.append(simbolo);
            }
            System.out.print("\r" + barra + " " + (float) (i * 5.56) + "%");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\rCarga completa: 100%             ");
    }

    public void g2_loading03() {
        System.out.print("\n- Serie l03.\n");
        String lectura = frase;
        char s = lectura.charAt(0);
        char[] simbolos = { '[', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ']' };

        for (int i = 1; i < simbolos.length - 2; i++) {
            if(i>1){
                simbolos[i-1]=' ';
                }
            simbolos[i] = s;

            StringBuilder barra = new StringBuilder();
            for (char simbolo : simbolos) {
                barra.append(simbolo);
            }
            System.out.print("\r" + barra + " " + (float) (i * 5.56) + "%");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\rCarga completa: 100%             ");
    }

    public void g2_loading04() {
        System.out.print("\n- Serie l04.\n");
        String[] signos = {"0oo", "o0o", "oo0"};
        int total = 20;
        System.out.println("Cargando...");
        for (int i = 0; i <= total; i++) {
            System.out.print(signos[i % signos.length] + " " + (i * 5) + "%\r");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.println(signos[1] + " 100%");
    }

    public void g2_loading05(){
        System.out.print("\n- Serie l05.\n");
        int total = 20;
        System.out.println("Cargando...");
        for (int i = 0; i <= total; i++) {
            int progress = (i * 100) / total;
            StringBuilder barra = new StringBuilder();
            for (int j = 0; j < total; j++) {
                if (j < i) {
                    barra.append("=");
                } else if (j == i) {
                    barra.append(i % 2 == 0 ? ">" : "-");
                } else {
                    barra.append(" ");
                }
            }
            System.out.print("[" + barra + "] " + progress + "%\r");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.println("[====================] 100%");
    }

    public void g2_loading06() {
        System.out.print("\n- Serie l06.\n");
        int total = 20;
        int barLength = 5; // Length of "<=>"
        int progress = 0;

        for (int i = 0; i <= total - barLength; i++) {
            System.out.print("[");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("<=>");

            for (int j = 0; j < total - i - barLength; j++) {
                System.out.print(" ");
            }

            progress = (i * 100) / (total - barLength);
            System.out.print("] " + progress + "%\r");
            try {
            Thread.sleep(300);
            } catch (Exception e) {
            }
        }
        System.out.print("[====================] 100%");
    }

    public void g2_loading07() {
        System.out.print("\n- Serie l07.\n");
        int total = 20;
        int progreso = 0;
        String[] puntas = { "\\", "|", "/", "-", "|" };
        for (int i = 0; i <= total; i++) {
            System.out.print("[");
            for (int j = 0; j < i; j++){
                System.out.print("=");
            }
            if (i < total){
                System.out.print(puntas[i % puntas.length]);
            }
            for (int j = 0; j < total - i - 1; j++){
                System.out.print(" ");
            }
            progreso = (i * 100) / total;
            System.out.print("]" + progreso + "%\r");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(" ");
            }
        }
            System.out.println("[====================] 100%");
    }

    public void g2_loading08() {
      int total = frase.length();
      System.out.println("\nCargando...");

      for(int i = 0; i < total; i++) {
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            System.out.print(" ");
         }
         System.out.print("\r[");
         for (int j = 0; j <= i; j++){
            System.out.print(frase.charAt(j));
         }
         for(int j = i + 1; j < total; j++){
            System.out.print(" ");
         }
         int porcentaje = (i + 1) * 100 / total;
         System.out.print("] " + porcentaje + "%");
        }
        System.out.print("\r[");
        System.out.print(frase);
        System.out.println("] 100%");
   }
        
    private void g2_loading09() {
        char[] frase = this.frase.toCharArray();
        System.out.println("Carga 09");
        for (int carga = 0; carga < this.frase.length(); carga++) {
            for (int espacio = 0; espacio < carga; espacio++) {
                System.out.print(" ");
            }
            System.out.print(frase[carga]);
            for (int espacio = this.frase.length()-carga; espacio >0; espacio--) {
                System.out.print(" ");
            }
            System.out.print(((carga + 1) * 100) / this.frase.length() + "%");
            try {
                Thread.sleep(1000);
                System.out.print("\r");
                System.out.print("                         ");
                System.out.print("\r");               
                
            } catch (InterruptedException e) {
                System.err.println("Interrupción durante la carga: " + e.getMessage());
            }
        }       
        System.out.println("[ "+this.frase+" 100%"+" ]");

    }
    private void g2_loading10() {
        double numero_random = Math.floor(((Math.random() * 990) + 10)) / 10;
        float carga_maxima = (float) numero_random;
        int minimo = 0;
        System.out.println("Downloading " + frase + " (" + numero_random + " kB)");
        for(int porcentaje_barra=1;porcentaje_barra<=10;porcentaje_barra++){
            for (int barra = 0; barra < porcentaje_barra; barra++) {
            System.out.print("\033[33m"+"▄");
            }
            for (int espacios = 0; espacios < 12-porcentaje_barra; espacios++) {
                System.out.print(" ");
            }
            carga_actual=carga_maxima*0.1f+carga_actual;
            System.out.print(carga_actual+" / "+carga_maxima);
            try {
                Thread.sleep(1000);
                System.out.print("\r");
                System.out.print("                             ");
                System.out.print("\r");
            } catch (Exception e) {
                System.err.println("Interrupción durante la carga: " + e.getMessage());
            }
        }
        System.out.println("Descarga completada correctamente");
    }

    public void g2_loading11(int numBarras, int alturaMaxima) {
        Random random = new Random();
        int[] alturas = new int[numBarras];

        for (int i = 0; i < numBarras; i++) {
            alturas[i] = random.nextInt(alturaMaxima + 1);
        }

        for (int nivel = alturaMaxima; nivel >= 0; nivel--) {
            for (int i = 0; i < numBarras; i++) {
                if (alturas[i] > nivel) {
                    System.out.print("= ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            delay(200); // Pausa entre cada línea de la animación
        }
    }

    private void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void g2_loading12(int anchoPantalla) {
        int delayTime = 100;
        for (int i = 0; i < anchoPantalla; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            imprimirFigura(i);
            delay(delayTime);
        }

        for (int i = anchoPantalla; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            imprimirFigura(i);
            delay(delayTime);
        }
    }

    private static void imprimirFigura(int espacios) {
        System.out.println();
        String figura[] = {
                "   \\\\| | |//   ",
                "    ( > < )    ",
                " ooO-(_)-Ooo "
        };

        for (String linea : figura) {
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println(linea);
        }
    }
}
