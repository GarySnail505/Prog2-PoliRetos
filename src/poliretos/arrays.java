package poliretos;

public class arrays{
    public int tamanio;
    public char caracter;
    public char letra1;
    public char letra2;
    public String frase;
    private char[][][] matriz_letras;

    public arrays(int tamanio,String frase,char caracter){
        this.frase=frase.toLowerCase();
        this.tamanio=tamanio;
        this.caracter=caracter;
        letra1=this.frase.charAt(0);
        letra2=this.frase.charAt(frase.indexOf(' ')+1);
        letras Generador = new letras(tamanio,letra1,letra2,caracter);
        matriz_letras=Generador.matriz();
        imprimir();
    }
    private void imprimir(){
            for (int filas = 0; filas < tamanio; filas++) {
                for (int columnas = 0; columnas < tamanio; columnas++) {
                    System.out.print(matriz_letras[0][filas][columnas]);
                }
                System.out.print("        ");
                for (int columnas = 0; columnas < tamanio; columnas++) {
                    System.out.print(matriz_letras[1][filas][columnas]);
                }
                System.out.println();
            }
    }
}