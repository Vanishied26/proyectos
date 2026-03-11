package mascotas;
public class Mascota{
    public String nom,esp;
    public int ed;
    public Mascota(String nom,String esp,int ed){
        this.nom=nom;
        this.esp=esp;
        this.ed=ed;
    }
    public void mostrarDatos(){
        System.out.println("Nombre de la mascota "+nom);
        System.out.println("Especia de la mascota "+esp);
        System.out.println("edad de la mascota "+ed+" años");
    }
}
