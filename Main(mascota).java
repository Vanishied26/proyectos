package mascotas;
public class Main{
    public static void main (String []args){
        
        Perro perro=new Perro("Emilio",10,"Snauzer");
        Gato gato=new Gato("Garfield",3,false);
        Loro loro=new Loro("Blue",2,"Azul");
        
        System.out.println("=== SITEMA DE MASCOTAS===");
        System.out.println("Perro:");
        perro.mostrarDatos();
        perro.ladrar();
        System.out.println("Gato:");
        gato.mostrarDatos();
        gato.maullar();
        System.out.println("Loro:");
        loro.mostrarDatos();
        loro.hablar();
    }
}
