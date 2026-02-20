
package vehiculo;

public class Vehiculo {

    // Atributos
    String marca;
    String modelo;
    int año;
    double velocidad;
    boolean encendido;
    double combustible;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, double combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidad = 0;
        this.encendido = false;
        this.combustible = combustible;
    }

    // Métodos
    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Encendido: " + encendido);
        System.out.println("Combustible actual: " + combustible + " litros");
    }

    public void arrancar() {
        if (combustible > 0) {
            encendido = true;
            combustible -= 1;
            System.out.println("El vehiculo ha arrancado.");
            System.out.println("Combustible restante: " + combustible + " litros");
        }
    }

    public void acelerar(double incremento) {
        if (encendido && combustible > 0) {
            velocidad += incremento;
            combustible -= 1;
            System.out.println("Velocidad actualizada: " + velocidad);
            System.out.println("Combustible restante: " + combustible + " litros");
        }
    }

    public void frenar() {
        velocidad = 0;
        System.out.println("El vehiculo ha frenado.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El vehiculo ha sido apagado.");
    }

    public void cargarCombustible(double litros) {
        combustible += litros;
        System.out.println("Combustible cargado correctamente.");
        System.out.println("Combustible actual: " + combustible + " litros");
    }

    
    public static void main(String[] args) {

        System.out.println("run:");

        Vehiculo veh = new Vehiculo("Aston Martin", "Vantage", 2026, 5.0);

        veh.mostrarEstado();

        System.out.println("______________");

        veh.arrancar();
        veh.acelerar(60);
        veh.acelerar(40);
        veh.frenar();
        veh.apagar();
        veh.cargarCombustible(20);

        System.out.println("______________");

        veh.mostrarEstado();

        
    }
}
