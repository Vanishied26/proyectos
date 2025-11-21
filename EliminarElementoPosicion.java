public class EliminarElementoPosicion{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int pos=2;
        for(int i=pos;i<arr.length-1;i++){
            arr[i]= arr[i+1];
        }
        System.out.println("Arreglo despues de eliminar: ");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
