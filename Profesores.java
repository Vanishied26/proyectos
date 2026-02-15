package com.mycompany.personas;
import java.util.*;

public class Profesores extends Personas {
    String depar[];
    int grup[][];

    public Profesores(String nom, int ed, int numgrup, int numdepar) {
        super(nom, ed);

        depar = new String[numdepar];
        grup = new int[numdepar][numgrup];
    }

    public void departamentos(){
        Scanner tecla = new Scanner(System.in);
        for (int i = 0; i < depar.length; i++) {
            System.out.print("Nombre del departamento "+(i + 1)+": ");
            depar[i] = tecla.nextLine();
            tecla.nextLine();
        }
    }

    public void mos(){
        mostrarinfo();
        for(int i=0;i<depar.length;i++){
            System.out.println("Grupos:"+(i+1)+grup[i]);
            for(int j=0;j<grup.length;j++){
                System.out.println("Departamento: "+depar[j]+grup[i][j]);
            }
        }
    }

    public static void main(String[] args){
        Profesores P1=new Profesores("ana",10,3,2);
        Profesores P2=new Profesores("Angelica",25,4,5);
        P1.departamentos();
        P1.mos();
        P2.departamentos();
        P2.mos();
    }
}
