package com.mycompany.superheroe;
import java.util.*;
public class Superheroe {
    
    private String nom,pod,idsec,ciud;
    private int NV;

    public Superheroe(String nom, String pod, String idsec, String ciud, int NV) {
        this.nom = nom;
        this.pod = pod;
        this.idsec = idsec;
        this.ciud = ciud;
        this.NV = NV;
    }
    
    public void MosInfo(){
        System.out.println("Nombre de Superheroe: "+nom);
        System.out.println("Poder del Superheroe: "+pod);
        System.out.println("Identidad secreta : "+idsec);
        System.out.println("Ciudad: "+ciud);
        System.out.println("Nivel Poder: "+NV);
        
    }
    public void UsPod(){
        if(NV>=10){
            NV-=10;
            System.out.println(nom+" uso su poder\n"+
                               "Energia restante:"+NV);
        }else{
            System.out.println("Energia insuficiente");
        }
    }
    public void ReEner(int cant){
        if(cant>0){
            NV+=cant;
            System.out.println("Energia recargada: "+NV);
        }else{
            System.out.println("No se puede recarga energia negativa o nula");
        }
    }

    public static void main(String[] args) {
        int op;
        boolean sal=false;
        Superheroe[] Sp=new Superheroe[0];
        Scanner tecla=new Scanner(System.in);
        while(!sal){
            System.out.println("1.-Agregar Superheroe\n"
                           +"2.-Mostrar superheroes registrados\n"
                           +"3.-Usa poder de un superheroe\n"
                           +"4.-Recargar energia\n"
                           +"5.-Salir del sistema");
        op=tecla.nextInt();
        switch(op){
            case 1:
                System.out.println("Nombre de superheroe");
                String nomb=tecla.nextLine();
                System.out.println("Poder deL superheroe");
                String pode=tecla.nextLine();
                System.out.println("Identidad secreta del superheroe");
                String idsecre=tecla.nextLine();
                System.out.println("Ciudad del superheroe");
                String ciu=tecla.nextLine();
                System.out.println("Nivel del poder ");
                int Nv=tecla.nextInt();
                Superheroe Sp1=new Superheroe(nomb,pode,idsecre,ciu,Nv);
                 Sp = Arrays.copyOf(Sp, Sp.length + 1);
                 Sp[Sp.length - 1] = Sp1;
                break;
            case 2:
                if(Sp.length==0){
                    System.out.println("No hay Superheores");
                }else{
                    for(int i=0;i<Sp.length;i++){
                        Sp[i].MosInfo();
                    }
                }
                break;
            case 3:
                 if (Sp.length == 0) {
                        System.out.println("No hay heroes registrados.");
                    } else {
                        System.out.print("Seleccione numero de heroe: ");
                        int indiceUso = tecla.nextInt();

                        if (indiceUso > 0 && indiceUso <= Sp.length) {
                            Sp[indiceUso - 1].UsPod();
                        } else {
                            System.out.println("Heroe inexistente.");
                        }
                    }
                    break;
            case 4:
                if (Sp.length == 0) {
                        System.out.println("No hay heroes registrados.");
                    } else {
                        System.out.print("Seleccione numero de heroe: ");
                        int Idreca = tecla.nextInt();

                        if (Idreca > 0 && Idreca <= Sp.length) {
                            System.out.print("CAntidad de energia a recargar: ");
                            int canti = tecla.nextInt();
                            Sp[Idreca - 1].ReEner(canti);
                        } else {
                            System.out.println("Heroe inexistente.");
                        }
                    }
                    break;
            case 5:
                sal=true;
                System.out.print("Saliendo del sistema...");
                break;
            default:
                System.out.print("Opcion Invalida");
        }
       }
        tecla.close();
    }
}
