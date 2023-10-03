/* uso de while
 * Erick Hernandez
 * 19/09/23 */

 public class UsoWhile{
    public static void main (String[] args){
        int i = 3;
        while (Math.pow (i,3) <=100){
            i++;
        }
        System.out.printf("%d^3 es %.1f y sobrepasa a 100",i,Math.pow(i,3));
    }
 }
