import java.util.Scanner;

public class PedirDatosEsfera{
    public static void PedirDatosEsfera(){
        Scanner ent = new Scanner(System.in);
        System.out.println("Dame el radio de la esfera: ");
        double r = ent.nextDouble();
        double vol = CalcularVolumen (r);
        System.out.printf("El volumen es %.3f", vol);

    }

    public static double  CalcularVolumen(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

}