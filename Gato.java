package mascotas;
public class Gato extends Mascota{
    public boolean esCallejero;
    public Gato(String nom,int ed,boolean esCallejero){
        super(nom,"Gato",ed);
        this.esCallejero=esCallejero;
    }   
    public void maullar(){
         System.out.println("miau miau ");
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
         System.out.println("¿Es callejero? "+(esCallejero ? "Si" : "No"));
    }
}
