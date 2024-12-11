import java.util.Scanner;
public class cap3_ejer21 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuales son sus valores: ");  
        double lado1 = entrada.nextDouble();
        double lado2 = entrada.nextDouble();
        double lado3 = entrada.nextDouble();

        double p = lado1+lado2+lado3;                   
        double s = p/2;                                 
        double area = (Math.sqrt((s*(s-lado1)*(s-lado2)*(s-lado3))));

        System.out.println("Sus valores son: Perimetro = "+p+", Semiperimetro = "+s+", Area = "+area);
        entrada.close();
    }
}