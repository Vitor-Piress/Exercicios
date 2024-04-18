/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author T-Gamer
 */
public class Aluno extends Pessoa{
    private static final String CURSO = "Sistemas de Informação";
    private int fase;
    
    public Aluno(){
    }
    
    public Aluno(int fase){
        this.fase = fase;
    }
    
    public Aluno(int fase, String nome, int idade){
        super(nome, idade);
        this.fase = fase;
    }

    
    @Override
    public void printDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Curso: "+getCURSO());
    }
    
    @Override
    public String getNomeFormatado(){
        return nome.toUpperCase();
    }
    
    @Override
    public String toString(){
        return "\n Nome: "+this.getNome()
        +"\n Idade: "+this.getIdade()
        +"\n Curso: "+this.getCURSO()
        +"\n Fase: "+this.getFase()
                +"\n----------";
    }

    /**
     * @return the CURSO
     */
    public static String getCURSO() {
        return CURSO;
    }

    /**
     * @return the fase
     */
    public int getFase() {
        return fase;
    }

    /**
     * @param fase the fase to set
     */
    public void setFase(int fase) {
        this.fase = fase;
    }

    
}
