
package Model;

public class ContaPoupanca extends Conta{
    private double juros;

    public ContaPoupanca(){
        this(0);
    }
    public ContaPoupanca(double juros){
        this.juros = juros;
    }
    public ContaPoupanca(double juros, double saldo, String nomeConta){
        super(nomeConta, saldo);
        this.juros = juros;
    }
   
    
    @Override
    public double getSaldo() {
        return saldo+getJuros();
    }

    @Override
    public void setDeposito(double deposito) {
        saldo += deposito;
    }

    /**
     * @return the juros
     */
    public double getJuros() {
        return juros;
    }

    /**
     * @param juros the juros to set
     */
    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    
    
    
    
}
