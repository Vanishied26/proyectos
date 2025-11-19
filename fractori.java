import java.util.Scanner;
public class fractori {
    public static void main(String [] args){
        int resta=1;
        Scanner tecla=new Scanner(System.in);
        System.out.println("Rango de cadena");
        int i, n=tecla.nextInt();
        for( i=1; i<=n; i++){
            resta*=i;
        }
        System.out.println("El resultado es: "+resta);
    }
}
