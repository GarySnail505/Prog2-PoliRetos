package poliretos;

public class figuras {
    public int tamanio;
    public int nivel;

    public figuras(int tamanio, int nivel) {
        this.tamanio = tamanio;
        this.nivel = nivel;
        escalera();
        
        escalera_subida();
     
        escalera_completa();
        escalera_guion();
    }

    private void piramide() {
        for (int filas = 0; filas < tamanio; filas++) {
            for (int columnas = 0; columnas < (tamanio * 2) - 1; columnas++) {
                if (columnas == (tamanio - 1)
                        || (columnas <= (tamanio - 1) + filas && columnas >= (tamanio - 1) - filas)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private void piramide_invertida() {
        for (int filas = 1; filas <= tamanio; filas++) {
            for (int columnas = 1; columnas <= (tamanio * 2) - 1; columnas++) {
                String caracter = (filas == 1 || (columnas >= filas && columnas <= (tamanio * 2) - filas)) ? "*" : " ";
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private void escalera() {
        int tamanio = 1;
        int espacios = 1;
        System.out.println("_");
        while (tamanio < this.tamanio) {
            for (int contador = 0; contador < espacios; contador++) {
                System.out.print(" ");
            }
            espacios = espacios + 2;
            System.out.println("|_");
            tamanio = tamanio + 1;
        }
    }

    private void escalera_subida() {
        int espacios = 3;
        for (int filas = 0; filas < tamanio; filas++) {
            for (int columnas = 1; columnas < (tamanio * 2); columnas++) {
                if ((columnas == (tamanio * 2) - 1) && (filas == 0)) {
                    System.out.print("_");
                } else if ((columnas == (tamanio * 2) - espacios) && filas != 0) {
                    System.out.print("_|");
                    espacios = espacios + 2;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void escalera_completa() {
        int columnas_totales = ((tamanio - 1) * 4),
                espacios_externos = (columnas_totales / 2),
                espacios_internos = 1;
        for (int i = -1; i <= espacios_externos; i++) {
            System.out.print(" ");
        }
        System.out.println("_");
        for (int filas = 0; filas < tamanio; filas++) {
            for (int contador = 0; contador < espacios_externos; contador++) {
                System.out.print(" ");
            }
            espacios_externos = espacios_externos - 2;
            System.out.print("_|");
            for (int contador = 0; contador < espacios_internos; contador++) {
                System.out.print(" ");
            }
            System.out.print("|_");
            espacios_internos = espacios_internos + 4;
            System.out.println();
        }
        System.out.println();
    }
    private void escalera_guion(){
        int espacios=0;
        for (int filas = 1; filas <= tamanio; filas++) {
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            espacios=1+filas+espacios;
            System.out.print("|");
            for (int guiones = 0; guiones < filas; guiones++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }

}