package sistemacalificaciones;
public class SistemaCalificaciones{
    public static void main(String[] args){
        //Arreglo de calificaciones de 5 estudiantes
        double[] calif= new double[5];
        int cont=1;
        double prom=0,sum=0;
        //Llenado de arreglos
        calif[0]=8.0;
        calif[1]=9.0;
        calif[2]=7.5;
        calif[3]=9.0;
        calif[4]=9.0;
        
        for(int j=0;j<calif.length;j++){
            sum+=calif[j];
        }
        double prom2=sum/calif.length;
        System.out.println("===Sistema de Calificaciones===");
        System.out.println("Total de estudiantes: "+calif.length);
        System.out.println("Promedio final del grupo BMP:"+prom2);
        
        System.out.println("Sus calificaciones son:");
        for(int i=0;i<5;i++){
            System.out.println(cont+"°:  "+calif[i]);
            cont++;
            prom+=calif[i];
        }
        prom=prom/5;
        System.out.println("Su promedio final es de: "+prom);
    }
    
}
