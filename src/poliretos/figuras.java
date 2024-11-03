package poliretos;

public class figuras{
    public int tamanio;
    public int nivel;
    public figuras(int tamanio,int nivel){
        this.tamanio=tamanio;
        this.nivel=nivel;
        piramide();
    }
    private void piramide(){
        for (int filas = 1; filas <= tamanio; filas++) {
            for(int columnas=1;columnas<=(tamanio*2)-1;columnas++){
            String caracter=(filas==1||(columnas>=filas&&columnas<=(tamanio*2)-filas))?"*":" ";
            System.out.print(caracter);}
            System.out.println();
        }
    }
}