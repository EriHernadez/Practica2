import java.util.Scanner; 
public class BuscadorMaximo{
    public void determinarMaximo(){

        Scanner entrada = new Scanner (System.in);
        System.out.print("Escriba tres valore de punto flotante, separados por espacios ");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        //determinar el valor maximo
        double res = maximo(n1,n2,n3);
        //muestra el valor maximo
        System.out.println("El maximo es: "+res);
    }
        
    // devuelve el maximo de sus tres parametros double
    public double maximo(double x, double y, double z){
        double valorMaximo = x; //se asume que x es el mayor para empezar
        
        // determinar si y es mayor que el valorMaximo
        if(y>valorMaximo){
            valorMaximo = y;
        }
        //determinar si z es mayor que el valorMaximo
        if(z>valorMaximo){
            valorMaximo = z;
        }
        return valorMaximo;
    }
}