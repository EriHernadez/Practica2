import java.util.Scanner;
public class Pruebabuleano{
	public static void main(String[] args){
		Scanner buleano = new Scanner(System.in);
			boolean p = buleano.nextBoolean();
			boolean q = buleano.nextBoolean();
		if ((!p||q)&&q)
			System.out.println("Verdadero");
		else
			System.out.println ("Falso");
		
	}
}