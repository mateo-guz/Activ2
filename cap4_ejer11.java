import java.util.Scanner;
public class cap4_ejer11 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int n3 = entrada.nextInt();

        int mayor = 0;

        if ((n1>n2)&&(n1>n3)){
            mayor = n1;
        }
        else if ((n2>n1)&&(n2>n3)){
            mayor = n2;
        }
        else{
            mayor = n3;
        }
        System.out.println("El valor mayor entre: "+n1+", "+n2+" y "+n3+" es "+mayor);
        entrada.close();
    }
}