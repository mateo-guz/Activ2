import java.util.Scanner;
public class cap4_ejer13 {
    public static void main(String[] args){

        System.out.println("¿Valor de la compra?:");
        Scanner entrada = new Scanner(System.in);
        int VALCOMP = entrada.nextInt();

        entrada.nextLine();
        System.out.println("¿Color de la bolita?:");
        String COLOR = entrada.nextLine();

        int VALPAG;
        int PDES;

        if (COLOR.equals("BLANCO")){
            PDES = 0;
        }
        else if (COLOR.equals("VERDE")){
            PDES = 10;
        }
        else if (COLOR.equals("AMARILLO")){
            PDES = 25;
        }
        else if (COLOR.equals("AZUL")){
            PDES = 50;
        }  
        else {
            PDES = 100;       
        }        
                                 
        VALPAG = (VALCOMP-(PDES*VALCOMP/100));
        System.out.println("El cliente debe pagar: $"+VALPAG);

        entrada.close();
    }
    
}