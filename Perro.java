package mascotas;
public class Perro extends Mascota{
    public String raza;
    
    public Perro(String nom,int ed,String raza){
        super(nom,"Perro",ed);
        this.raza=raza;
    }
    
    public void ladrar(){
         System.out.println("Gua gua");
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Raza: "+raza);
    }
}
