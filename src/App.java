import java.util.Scanner;
import poliretos.cadena_caracteres;

public class App {
    public static void main(String[] args) throws Exception {
        int longitud=5;
        int nivel=4;
        String palabra="BALLENA HOLA COMO";
        String eliminacion;
            /* Series_numericas test= new Series_numericas(longitud,nivel); */
            Scanner teclado = new Scanner(System.in);
            palabra=teclado.nextLine();
            eliminacion=teclado.next();
            cadena_caracteres test2= new cadena_caracteres(palabra,nivel);
    }
}
