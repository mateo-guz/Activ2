import java.util.Scanner;
public class cap4_ejer14 {
    public static void main(String[] args){

        System.out.println("Venta del apartamento 1:");
        Scanner entrada = new Scanner(System.in);
        int VD1 = entrada.nextInt();

        System.out.println("Venta del apartamento 2:");
        int VD2 = entrada.nextInt();

        System.out.println("Venta del apartamento 3:");
        int VD3 = entrada.nextInt();

        System.out.println("Salario del vendedor:");
        int SALAR = entrada.nextInt();

        double TOTVEN;
        int PORVEN;
        int SALAR1;
        int SALAR2;
        int SALAR3;

        TOTVEN = VD1+VD2+VD3;
        PORVEN = (int) (0.33*TOTVEN);
        if (VD1>PORVEN){
            SALAR1 = (int) (SALAR+(0.2*SALAR));
            }else{
                SALAR1 = SALAR;
            }
        if (VD2>PORVEN){
            SALAR2 = (int) (SALAR+(0.2*SALAR));
            }else{
                SALAR2 = SALAR;
            }
        if (VD3>PORVEN){
            SALAR3 = (int) (SALAR+(0.2*SALAR));
            }else{
                SALAR3 = SALAR;
            }
        
        System.out.println("SALARIO VENDEDORES DEPTO.1: "+SALAR1+", SALARIO VENDEDORES DEPTO.2: "+SALAR2+", SALARIO DEPTO.3: "+SALAR3);

        entrada.close();
    }
}