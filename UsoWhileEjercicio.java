 import java.util.Scanner;
 public class UsoWhileEjercicio{
    public static void main (String[] args){
      Scanner ent = new Scanner (System.in);
		  System.out.println("Introduce un numero");
      
      int n = ent.nextInt();
      int i = 1;
      int suma = 0;
      while(i <= n) {
        i++;
        suma = i+n;
      }
		  System.out.printf("El resultado del 1 al %d es %d", n,suma);
    
  }
}      
