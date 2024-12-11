import java.util.*;
public class cap4_ejer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double a,b,c,d,x1,x2;
        
        System.out.println("Ingrese A: ");
        a=sc.nextDouble();
        System.out.println("Ingrese B: ");
        b=sc.nextDouble();
        System.out.println("Ingrese C: ");
        c=sc.nextDouble();
        
        d=(b*b)-(4*a*c);
        if (d==0){
            x1=(-b)/(2*a);
            System.out.println("La solucion es: " + x1);
        }
        else if(d>0){
            x1=((-b) + (Math.sqrt(d)))/(2*a);
            x2=((-b) - (Math.sqrt(d)))/(2*a);
            System.out.println("Las soluciones son:");
            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }
        else {
            System.out.println("No tiene solucion:");
        }
        sc.close();
    }
}