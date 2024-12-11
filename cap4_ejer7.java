import java.util.Scanner;
public class cap4_ejer7 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("INGRESE VALOR A");
        int a = entrada.nextInt();

        System.out.println("INGRESE VALOR B");
        int b = entrada.nextInt();

        if (a>b){
            System.out.println("A ES MAYOR QUE B");
        }
        else if (a==b){
            System.out.println("A ES IGUAL A B");
        }
            
        else{
            System.out.println("A ES MENOR QUE B");
        }

        entrada.close();
    }
}