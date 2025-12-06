package com.mycompany.sistemacalificaciones;
import java.util.*;
public class SistemaCalificaciones {
    
    public static void registro(Scanner tecla,String[] nom,double[][] notas){
        System.out.println("===REGISTRO DE ESTUDIANTES Y NOTAS===");
        for(int i=0;i<nom.length;i++){
            System.out.println("Ingrese el nombre del Alumno");
            nom[i]=tecla.nextLine();
            for(int j=0;j<notas[i].length;j++){
                System.out.println("Ingrese las nota  "+(j+1)+ "° de la materia");
                 notas[i][j]=tecla.nextDouble();
                 tecla.nextLine();
            }
        }
    }
    public static void MostrarResultados(String[] nom,double[][] notas){
         System.out.println("\n===RESULTADOS===");    
         for (int i = 0; i < nom.length; i++) {
         System.out.println("Alumno: " + nom[i]);
         double suma = 0;
         for (int j = 0; j < notas[i].length; j++) {
              System.out.println("  Nota " + (j + 1) + ": " + notas[i][j]);
              suma += notas[i][j];
         }

        double prom = suma / notas[i].length;
        System.out.printf("  Promedio: %.2f\n", prom);
        System.out.println("----------------------------------\n");
    }
}

    public static void main(String[] args) {
        Scanner tecla =new Scanner(System.in);
        String[] nom= new String[5];
        double[][] notas=new double[5][3];
        System.out.println("===SISTEMA DE CALIFICAIONES===");
        registro(tecla,nom,notas);
        MostrarResultados(nom,notas);
        
    }
}
