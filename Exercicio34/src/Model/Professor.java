/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author T-Gamer
 */
public class Professor extends Pessoa{
    private static final String TITULO = "Doutor";
    private String materia;
    private double salarioHora;
    
    public Professor(){
        this("", 0);
    }
    
    public Professor(String materia, double salarioExtra){
        this.materia = materia;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the salarioHora
     */
    public double getSalarioHora() {
        return salarioHora;
    }

    /**
     * @param salarioHora the salarioHora to set
     */
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    @Override
    public void printDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Curso: "+TITULO);
        System.out.println("Matéria: "+materia);
        System.out.println("Salário por hora: "+salarioHora);
    }
    
    @Override
    public String getNomeFormatado(){
        return nome+TITULO;
    }
}
