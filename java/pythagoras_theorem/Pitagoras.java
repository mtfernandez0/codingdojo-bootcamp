import java.lang.Math;

public class Pitagoras{

    public double calcularHipotenusa(int catetoA, int catetoB){
        // evaluemos precondiciones
        if(catetoA <= 0 || catetoB <= 0)
            System.err.println("The values are not appropriate!");
        
        return Math.sqrt(catetoA*catetoA + catetoB*catetoB);
    }

}