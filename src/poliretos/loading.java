package poliretos;

public class loading {
    public String frase;
    public float carga_actuar = 0.00f;

    public loading(String frase) {
        this.frase = frase;
        barra_de_nombre();
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
    private void carga_documento(){
        int numero_random;
    }
}