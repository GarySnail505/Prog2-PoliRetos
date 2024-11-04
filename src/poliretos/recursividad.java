package poliretos;

public class recursividad{
    public float numero1;
    public float numero2;

    public recursividad(float numero1,float numero2){
this.numero1=5.5f;
this.numero2=4;
System.out.println(multiplicacion(this.numero1,this.numero2));
    }
    private float multiplicacion(float numero1,float numero2){
        if (numero2<=0){
            return 0;
        }
        numero2--;
        numero1=numero1+multiplicacion(numero1,numero2);
        return numero1;
    }
}