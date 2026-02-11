public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;
 
    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
 
    // Métodos getter y setter
    public String getTitular() {
        return titular;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        }
    }
 
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
 
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 1000);
        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(1500); // Intento de retiro con saldo insuficiente
    }
}
