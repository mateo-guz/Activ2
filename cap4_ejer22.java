import java.util.*;
public class cap4_ejer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nombre;
        int salario, horas, smensual;
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese el salario basico por hora del empleado: ");
        salario = sc.nextInt();

        System.out.println("Ingrese el numero de horas trabajadas en el mes del empleado: ");
        horas = sc.nextInt();
        
        smensual=horas*salario;
        if (smensual>450000){
            System.out.println(nombre+" "+smensual);
        }
        else{
            System.out.println(nombre);
        }
        sc.close();
    }
}