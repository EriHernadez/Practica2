/*Erick Hernández
29 de agosto
SWITCH
*/

public class Switch{
	public static void main (String[] args){
		char calif = 'a' ;
		switch(calif){
			case 'aplus':
				System.out.println("10");
				break;
			case 'a':
				System.out.println("9");
				break;
			case 'b':
				System.out.println("8");
				break;
			case 'c':
				System.out.println("7");
				break;
			case 'd':
				System.out.println("6");
				break;
			case 'f':
				System.out.println("NA");
				break;
			default:
				System.out.println("Nota no reconocida");
			}
		}
}