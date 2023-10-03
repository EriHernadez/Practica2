import java.util.Scanner;

public class Funciones{
    static double fnFuncion01(double x){
        return x/(1+Math.pow(x,2));
    }

    public static void main (String[] args){
        Scanner ent = new Scanner (System.in);
        System.out.print("Dame el valor de x: ");
        double x = ent.nextDouble();
        double fx = fnFuncion01(x);
        System.out.printf("Cuando x es %.1f, fx es %.1f",x, fx);
    }
}