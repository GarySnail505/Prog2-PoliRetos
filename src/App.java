//import java.lang.reflect.Array;
import java.util.Scanner;
import poli_retos.SeriesNumericas;
import poli_retos.SeriesCaracteres;
import poli_retos.SeriesFiguras;
import poli_retos.CadenasCaracteres;
import poli_retos.Arrays;
import poli_retos.Loadings;
import poli_retos.Recursividad;
import poli_retos.Automatas.Automata06;

public class App {
    public static void main(String[] args) throws Exception {
        SeriesNumericas op = new SeriesNumericas();
        SeriesCaracteres pk = new SeriesCaracteres();
        SeriesFiguras fig = new SeriesFiguras();
        CadenasCaracteres cc = new CadenasCaracteres();
        Arrays arr = new Arrays();
        Loadings loa = new Loadings();
        Recursividad rec = new Recursividad();
        Scanner sc = new Scanner(System.in);
        
        // 1. Series Numéricas
        op.g2_lectorDatos();
        op.g2_serieN01();
        op.g2_serieN02();
        op.g2_serieN03();
        
        op.g2_serieN07();
        op.g2_serieN08();
        op.g2_serieN09();
        op.g2_serieN10();

        // 2. Series Caracteres
        pk.g2_lectorDatosC01();
        
        pk.g2_serieC03();
        pk.g2_serieC04();
        pk.g2_serieC05();
        pk.g2_serieC06();
        pk.g2_serieCaracteres07();
        pk.g2_serieCaracteres08();


        // 3. Series Figuras
        fig.g2_lectorF02();
        fig.g2_serieF01();
        fig.g2_serieF02();
        fig.g2_serieF03();
        fig.g2_serieF04();
        
        fig.g2_serieF13();
        fig.g2_serieF14();
        fig.g2_serieF15();
        fig.g2_serieF16();
        fig.g2_crearFigura17();
        fig.g2_crearFigura18();
        fig.g2_crearFigura19();

        // 4. Cadena Caracteres
        cc.g2_serieS03();
        cc.g2_serieS04();
        cc.g2_serieS05();
        cc.g2_serieS06();
        cc.g2_serieS07();
        cc.g2_serieS08();
        


        // 5. Arrays
        arr.Array04();
        arr.g2_array05();


        // 6. Loadings
        loa.g2_delay11(11,8);
        loa.g2_delay12(20);



        // 7. Recursividad
        System.out.println(rec.g2_recursividad_01(5));
        System.out.println(rec.g2_recursividad_02(2, 5));

        // 8. Autómatas
        System.out.println("Ingrese la secuencia a validar (use '-' como separador entre caracteres): ");
        String input = sc.nextLine();
        Automata06 automata06 = new Automata06();
        automata06.validarSecuencia(input);
        

        // Delay

    }
}
