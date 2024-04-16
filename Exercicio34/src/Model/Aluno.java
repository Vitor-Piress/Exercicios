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
    

    
    @Override
    public void printDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Curso: "+CURSO);
    }
    
    @Override
    public String getNomeFormatado(){
        return nome.toUpperCase();
    }

    
}
