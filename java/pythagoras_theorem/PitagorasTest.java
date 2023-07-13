public class PitagorasTest{
    public static void main(String[] args) {
        Pitagoras pitagoras = new Pitagoras();

        int catetoA = 17, catetoB = 22;
        
        System.out.printf("EL valor de la hipotenusa es %f.\n", pitagoras.calcularHipotenusa(catetoA, catetoB));        
    }
}