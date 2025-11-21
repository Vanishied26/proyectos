package arrejer1;
import java.util.*;
public class ArrEjer1{
    public static void main(String[] args){
        Scanner tecla=new Scanner(System.in);
        int num1;
        int[] num= new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        System.out.println("Que numero desea buscar");
        num1=tecla.nextInt();
        for(int i=0;i<num.length;i++){
            if(num.length==num1)   {
               System.out.println("El numero esta en el arreglo");
            break;}
            else {
                System.out.println("El numero no  esta en el arreglo");
            break;
            }
        }
    }
    
}
