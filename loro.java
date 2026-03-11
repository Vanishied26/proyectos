package mascotas;
public class Loro extends Mascota{
    public String color;
    
    public Loro(String nom,int ed,String color){
        super(nom,"Ave",ed);
        this.color=color;
    }
    
    public void hablar(){
         System.out.println("El loro dice: Puto puto");
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
         System.out.println("Color: "+color);
    }
}
