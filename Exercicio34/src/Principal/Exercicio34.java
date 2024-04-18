
package Principal;

import Model.*;

public class Exercicio34 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        

        
        System.out.println("ALUNO:");
        aluno.printDados();
        aluno.setNome("Jorge");
        aluno.setIdade(18);
        System.out.println("Nome em CAPS: "+aluno.getNomeFormatado());
        System.out.print("\n");
        
        System.out.println("PROFESSOR:");
        professor.printDados();
    }
    
}
