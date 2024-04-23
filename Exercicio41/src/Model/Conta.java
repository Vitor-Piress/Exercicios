
package Model;

public abstract class Conta {
    String nomeConta;
    double saldo;
    
    public Conta(){
        this("", 0);
    }
    
    public Conta(String nomeConta, double saldo){
        this.nomeConta = nomeConta;
        this.saldo = saldo;
    }
    
    public abstract double getSaldo();
    public abstract void setDeposito(double deposito);
}
