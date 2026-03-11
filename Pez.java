package mascotas;
public class Pez extends Mascota{
    private String TipoAgua;

    public Pez(String nom,int ed,String TipoAgua){
        super(nom,"pez",ed);
        this.TipoAgua=TipoAgua;
    }
    public void nadar(){
        System.out.println("El pez esta nadando");
        
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El tipo de agua es: "+TipoAgua);
    }
}
