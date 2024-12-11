import java.util.*;
class Cap3_ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        String nombres;
        int codigo;
        double horas,valor,porcentaje,sbruto,sneto;

        System.out.println("Ingrese los nombres del empleado: ");
        nombres = entrada.nextLine();
        
        System.out.println("Ingrese el codigo del empleado: ");
        codigo = entrada.nextInt();

        System.out.println("Ingrese las horas trabajadas: ");
        horas = entrada.nextDouble();

        System.out.println("Ingrese el valor de la hora: ");
        valor = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de retencion en la fuente: ");
        porcentaje = entrada.nextDouble();
        
        sbruto=horas*valor;
        sneto=sbruto-(sbruto*(porcentaje/100));
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombres: "+nombres);
        System.out.println("Salario Bruto: "+sbruto);
        System.out.println("Salario Neto: "+sneto);

        entrada.close();
    }
}