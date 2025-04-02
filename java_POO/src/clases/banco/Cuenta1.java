package clases.banco;

public class Cuenta1 {
    // Atributos de la clase
    private int numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    private Cliente1 owner; // Relación con la clase Cliente

    // Constructor
    public Cuenta1(int numeroCuenta, Cliente1 owner, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.owner = owner;
        this.saldo = 0; // Se inicializa el saldo en 0
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "\nCuenta" +
                "\nNumero de cuenta: " + numeroCuenta +
                "\nDetalles del propietario: " + owner +
                "\nTipo de cuenta: " + tipoCuenta;
    }
}
