import java.util.Scanner;
public class cap4_ejer12 {
    public static void main(String[] arg){

        System.out.println("Nombre del trabajador:");
        Scanner entrada = new Scanner(System.in);
        String NOM = entrada.nextLine();

        System.out.println("Horas trabajadas:");
        int NHT = entrada.nextInt();

        System.out.println("Valor hora normal:");
        int VHN = entrada.nextInt();

        int HET;
        int HEE8;
        int SALARIO;

        if (NHT>40){
            HET = NHT - 40;
            if (HET>8){
                HEE8 = HET - 8;
                SALARIO = ((40*VHN)+(16*VHN)+(HEE8*3*VHN));
            }
            else {
                SALARIO =((40*VHN)+(HET*2*VHN));
            }
        }
        else {
            SALARIO =(NHT*VHN);
        }
        System.out.println("EL TRABAJADOR "+NOM+", DEVENGO: $"+SALARIO);
        entrada.close();
    }    
}