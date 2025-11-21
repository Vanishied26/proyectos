public class CopiaArrglo2{
   public static void main(String[] args){
        int[] arre={1,2,3,4,5};
        int[] copia=new int[arre.length];
        
        for(int i=0;i<arre.length;i++){
            copia[i]=arre[i];
            System.out.print(copia[i]+" ");
        }
    }
    
}
