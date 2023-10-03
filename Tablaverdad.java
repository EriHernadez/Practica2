/*tabla de verdad
Erick hernandez 
24/08/23
*/
public class TablaVerdad{
	public static void main(String[] args){
		boolean p=false, q=false; //tipo de datos boleano
		if( (p&q) |p ){
			System.out.println ("Verdadero");
		}else{
			System.out.println ("Falso");
		}
	}
}