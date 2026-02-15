package com.mycompany.personas;
import java.util.*;
public class Estudiantes extends Personas {
    double calif1,calif2,calif3;
    String carr;

    public Estudiantes(double calif1, double calif2, double calif3, String carr, String nom, int ed) {
        super(nom, ed);
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
        this.carr = carr;
    }
    
       boolean apro(){
       double prom=0;
       boolean aprob;
       prom=(calif1+calif2+calif3)/3;
       if(prom>=7)
            aprob=true;
       else
           aprob=false;
        return aprob;   
    }
       public void mos(){
           mostrarinfo();
           System.out.println("Aprobado: "+apro()+"\nCarrera: "+carr);
       }
    public static void main (String[] args){
       Estudiantes E1=new Estudiantes(9.0,8.0,7.0,"Ingeneria en sistemas","Nicolas",19);
       Estudiantes E2=new Estudiantes(6.0,9.0,6.0,"Administracion en Empresas","Rafa",20);
       Estudiantes E3=new Estudiantes(7.0,10.0,9.0,"Contabilidad","Esteban",21);
       E1.mos();
       E2.mos();
       E3.mos();
    }
}
