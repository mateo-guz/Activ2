import java.util.Scanner;
public class cap4_ejer10 {
    public static void main(String[] args){

        System.out.println("Numero de inscripcion: ");
        Scanner entrada = new Scanner(System.in);
        int ni = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Patrimonio: ");
        int pat = entrada.nextInt();

        int pagmat = 50000;

        System.out.println("Estrato: ");
        int est = entrada.nextInt();

        if ((pat>2000000)&&(est>3)){
            pagmat =(int) (pagmat + 0.03*pat);
        }

        System.out.println("El estudiante con numero de inscripcion "+ni+" y Nombre "+nombre+" debe pagar $"+pagmat);

        entrada.close();
    }
}