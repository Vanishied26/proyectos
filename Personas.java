package clase;
public class Personas
{
    private String nom;
    private  int ed;

    public Personas(String nom, int ed)
    {
        this.nom = nom;
        this.ed = ed;
    }

    public String getNom()
    {
        return nom;
    }

    public int getEd()
    {
        return ed;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setEd(int ed)
    {
        this.ed = ed;
    }
    
    
     public void mostrarinfo(){
         System.out.println("Nombre: "+nom+"\nEdad: "+ed);
     }
     public static void main(String [] args){
         Personas p1=new Personas("Rafa",20);
         Personas p2=new Personas("Nicolas",19);
         Personas p3=new Personas("Esteban",21);
         p1.mostrarinfo();
         p2.mostrarinfo();
         p3.mostrarinfo();
     }
}
