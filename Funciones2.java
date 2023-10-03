import java.util.Scanner;

public class Funciones2{
    static double fnFuncion01(double x, double y) {
        return ((x-y)/(Math.sqrt(x) + Math.sqrt(y)));
    }

    public static void main (String[] args){
        System.out.println("Dame el valor de x: ");
        Scanner ent = new Scanner (System.in);
        double x = ent.nextDouble();
        System.out.println("Dame el valor de y: ");
        Scanner ent2 = new Scanner (System.in);
        double y = ent2.nextDouble();
        double fx = fnFuncion01(x, y);
        System.out.printf("Cuando x es %.1f, y cuando Y es %.1f, fx es %.1f",x, y, fx);
    }
}