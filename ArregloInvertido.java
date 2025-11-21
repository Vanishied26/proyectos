public class ArregloInvertido{
    public static void main(String[] args){
      int[]  original={1,2,3,4,5};
      int[] invertido=new int[original.length];
      
      int j=original.length-1;
      for(int i=0;i<original.length;i++){
          invertido[i]=original[j];
          j=j-1;
          
      }
      System.out.println("Arreglo Invertido:");
      for(int i=0;i<invertido.length;i++){
          System.out.print(invertido[i]+" ");
      }
    }
    
}
