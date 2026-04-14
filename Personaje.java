package Superheroes;
public abstract class Personaje {
    protected String nombre, identidadSecreta, ciudad,poder;
    protected int  nivelEnergia, tipo;

    public Personaje(String nombre, String identidadSecreta, String ciudad, String poder, int nivelEnergia) {
        this.nombre = nombre;
        this.identidadSecreta = identidadSecreta;
        this.ciudad = ciudad;
        this.poder = poder;

        if(nivelEnergia < 0)
            this.nivelEnergia = 0;
        else
            this.nivelEnergia = nivelEnergia;
    }

    public abstract void usarPoder();
    public abstract void decirFrase();
    public abstract String getNombre();
    public abstract String getTipo();

    public void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Ciudad: " + ciudad);
    }

    public void mostrarIdentidad(){
        System.out.println("Identidad secreta: " + identidadSecreta);
    }

    public void recargarEnergia(int cantidad){
        nivelEnergia += cantidad;
        System.out.println(getNombre() + " se ha recargado de energia");
    }

    public void reducirEnergia(int cantidad){
        nivelEnergia -= cantidad;
        System.out.println(getNombre() + " nivel de energia: " + nivelEnergia);
    }

    public boolean PuedesUsarPoder(int CostoEnergia){
        return nivelEnergia >= CostoEnergia;
    }

    public int getNivelEnergia(){
        return nivelEnergia;
    }

    public String getIdentidadSecreta(){
        return identidadSecreta;
    }
}
