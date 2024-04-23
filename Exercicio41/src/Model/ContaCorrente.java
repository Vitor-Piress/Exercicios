
package Model;

public class ContaCorrente extends Conta{
    private double taxaServico;

    public ContaCorrente(){
        this(0);
    }
    public ContaCorrente(double taxaServico){
        this.taxaServico = taxaServico;
    }
    public ContaCorrente(double taxaServico, double saldo, String nomeConta){
        super(nomeConta, saldo);
        this.taxaServico = taxaServico;
    }
    
    
    @Override
    public double getSaldo() {
        return saldo - getTaxaServico();
    }

    @Override
    public void setDeposito(double deposito) {
        saldo += deposito;
    }

    /**
     * @return the taxaServico
     */
    public double getTaxaServico() {
        return taxaServico;
    }

    /**
     * @param taxaServico the taxaServico to set
     */
    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
    
    
    
    
    
    
}
