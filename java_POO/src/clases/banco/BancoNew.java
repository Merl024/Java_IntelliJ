package clases.banco;

public class BancoNew {
    public static void main(String[] args) {
        Cliente1 Melisa = new Cliente1("Melisa", "Rivas", "00000000-0");
        System.out.println(Melisa);

        Cuenta1 cuentaMelisa = new Cuenta1(2102931, Melisa, "Corriente");
        System.out.println(cuentaMelisa);
    }
}
