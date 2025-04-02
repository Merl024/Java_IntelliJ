package clases.banco_comp;

public class Cuenta {

    private int clienteId;
    private double balance = 0;

    public Cuenta(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString(){ return "Cliente: "+clienteId+"\nBalance de la cuenta: "+balance; }

    public int getClienteId(){
        return clienteId;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double nuevoBalance){
        this.balance = nuevoBalance;
    }

}
