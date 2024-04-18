
package Model;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    
    public Pessoa(){
        this("", 0);
    }
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void printDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
    
    public abstract String getNomeFormatado();
    
}
