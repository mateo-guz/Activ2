import java.util.Scanner;
public class cap4_ejer15 {
    public static void main(String[] args) {
        
        System.out.println("Peso de la esfera A:");
        Scanner entrada = new Scanner(System.in);
        int PESOA = entrada.nextInt();

        System.out.println("Peso de la esfera B:");
        int PESOB = entrada.nextInt();

        System.out.println("Peso de la esfera C:");
        int PESOC = entrada.nextInt();

        System.out.println("Peso de la esfera D:");
        int PESOD = entrada.nextInt();

        if ((PESOA==PESOB)&&(PESOA==PESOC)){
            if (PESOD>PESOA){
                System.out.println("LA ESFERA D ES LA DIFERENTE Y");
            }else{
                System.out.println("LA ESFERA D ES LA DIFERENTE Y");
            }
        }
        else if ((PESOA==PESOB)&&(PESOA==PESOD)){
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (PESOC>PESOA){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
        }
        else if ((PESOA==PESOC)&&(PESOA==PESOD)){
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if ((PESOB>PESOD)){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
        }
        else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if ((PESOA>PESOB)){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
        }

        
        
        entrada.close();
    }
}