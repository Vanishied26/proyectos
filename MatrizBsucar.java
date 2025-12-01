package buscarelemento;
public class BuscarElemento{
    public static void main(String[] args){
       int[][]numeros={{1,2,3},{4,5,6},{7,8,9}};
       int bus=5;
       boolean encontrado=false;
       int fila=-5, colum=-1;
       for(int i=0;i<numeros.length;i++){
           for(int j=0;j<numeros.length;j++){
               if(numeros[i][j]==bus){
                   encontrado=true;
                   fila=i;
                   colum=j;
                   System.out.println("Numero encontrado en fila "+fila+" y en columna "+colum);
                   break;
               }
           }
       }
    }
    }
    

