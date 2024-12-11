import java.util.Scanner;
public class cap3_ejer19 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es el valor: ");//preguntamos el valor del lado del triangulo 
        double lado = entrada.nextDouble();

        double perimetro = 3*lado;
        double altura = Math.sqrt(Math.pow(lado, 2)-Math.pow((lado/2), 2));
        double area = (Math.sqrt(3)/4)*Math.pow(lado,2);

        System.out.println("Sus valores son: Perimetro= "+perimetro+", Altura= "+altura+", Area= "+area);
        entrada.close();
    }
}