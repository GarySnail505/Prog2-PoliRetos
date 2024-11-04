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
        op.lectorDatos();
        op.serieN01();
        op.serieN02();
        op.serieN03();
        
        op.serieN07();
        op.serieN08();
        op.serieN09();
        op.serieN10();

        // 2. Series Caracteres
        pk.lectorDatosC01();
        
        pk.serieC03();
        pk.serieC04();
        pk.serieC05();
        pk.serieC06();
        pk.g2_serieCaracteres07();
        pk.g2_serieCaracteres08();


        // 3. Series Figuras
        fig.lectorF02();
        fig.serieF01();
        fig.serieF02();
        fig.serieF03();
        fig.serieF04();
        
        fig.serieF13();
        fig.serieF14();
        fig.serieF15();
        fig.serieF16();


        // 4. Cadena Caracteres
        
        cc.SerieS07();
        cc.SerieS08();



        // 5. Arrays
        arr.Array04();
        


        // 6. Loadings
        loa.delay11(11,8);
        loa.delay12(20);



        // 7. Recursividad
        System.out.println(rec.recursividad_01(5));
        System.out.println(rec.recursividad_02(2, 5));

        // 8. Autómatas
        System.out.println("Ingrese la secuencia a validar (use '-' como separador entre caracteres): ");
        String input = sc.nextLine();
        Automata06 automata06 = new Automata06();
        automata06.validarSecuencia(input);
        

        // Delay

    }
}
