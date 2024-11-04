package poli_retos;
import javax.swing.JOptionPane;

public class SeriesNumericas {
    int a, b, c, repeticiones, tamanio;

    public void lectorDatos() {
        tamanio = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese tamanio para las series numericas..."));
    }

    public void serieN01() {
        b = 1;

        System.out.print("\n- Serie N01.\n");

        while (repeticiones < tamanio) {
            repeticiones = repeticiones + 2;
            System.out.print(a + " ");
            b = b + a;
            a = a + b;
            if (repeticiones <= tamanio) {
                System.out.print(b + " ");
            }
        }
    }

    public void serieN02() {
        a = 1;
        repeticiones = 0;
    
        System.out.print("\n- Serie N02.\n");

        while (repeticiones < tamanio) {
            repeticiones = repeticiones + 2;
            System.out.print(a + " ");
            a = a + 2;
            if (repeticiones <= tamanio) {
                System.out.print("0 ");
            }
        }
    }

    public void serieN03() {
        a = 0;
        b = 1;
        c = 1;
        repeticiones = 0;

        System.out.print("\n- Serie N03.\n");

        while (repeticiones < tamanio) {
            repeticiones = repeticiones + 2;

            System.out.print(a + "/" + c + " ");
            b = b + a;
            a = a + b;
            c = c + 2;
            if (repeticiones <= tamanio) {
                System.out.print(b + "/" + c + " ");
            }
            c = c + 2;
        }
    }
}
