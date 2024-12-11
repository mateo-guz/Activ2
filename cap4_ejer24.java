import java.util.*;
public class cap4_ejer24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int A, B, C;
    
        System.out.println("Ingrese el peso de A: ");
        A= sc.nextInt();
        System.out.println("Ingrese el peso de B: ");
        B= sc.nextInt();
        System.out.println("Ingrese el peso de C: ");
        C= sc.nextInt();
        
        if (A>B && A>C){
            System.out.println("la mayor es A");
        }
        else{
            if (B>A && B>C){
                System.out.println("la mayor es B");
            }
            else {
                if (C>A && C>B){
                    System.out.println("la mayor es C");
                }
                else {
                    System.out.println("Tienen el mismo peso");
                }
            }
        }
        sc.close();
    }
}