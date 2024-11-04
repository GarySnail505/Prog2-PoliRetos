package poliretos;

public class loading {
    public String frase;
    public float carga_actual = 0.00f;

    public loading(String frase) {
        this.frase = frase;
        carga_documento();
    }

    private void barra_de_nombre() {
        char[] frase = this.frase.toCharArray();
        for (int carga = 0; carga < this.frase.length(); carga++) {
            for (int espacio = 0; espacio < carga; espacio++) {
                System.out.print(" ");
            }
            System.out.print(frase[carga]);
            for (int espacio = 0; espacio < this.frase.length() - carga; espacio++) {
                System.out.print(" ");
            }
            System.out.print(((carga + 1) * 100) / this.frase.length() + "%");
            try {
                Thread.sleep(1000);
                System.out.print("\r");
            } catch (InterruptedException e) {
                System.err.println("Interrupción durante la carga: " + e.getMessage());
            }
        }

    }

    private void carga_documento() {
        double numero_random = Math.floor(((Math.random() * 990) + 10)) / 10;
        float carga_maxima = (float) numero_random;
        int minimo = 0;
        System.out.println("Downloading " + frase + " (" + numero_random + " kB)");
        for(int porcentaje_barra=1;porcentaje_barra<=10;porcentaje_barra++){
            for (int barra = 0; barra < porcentaje_barra; barra++) {
            System.out.print("▄");
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
            }
        }
        System.out.println("Descarga completada correctamente");
    }
}