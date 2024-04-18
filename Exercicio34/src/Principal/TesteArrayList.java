
package Principal;

import Model.*;
import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Aluno> listasimples = new ArrayList<>();
        
        Aluno aluno1 = new Aluno(2, "Jorge", 15);
        Aluno aluno2 = new Aluno(1, "Cleiton", 18);
        
        listasimples.add(aluno1);
        listasimples.add(aluno2);
        System.out.println("TESTE1");
        System.out.println(listasimples.toString());
        
        System.out.println("TESTE2");
        listasimples.remove(0);
        System.out.println(listasimples.toString());
        
        Aluno aluno2Alterado = new Aluno(3, "Carla", 21);
        listasimples.set(0, aluno2Alterado);
        
        Aluno aluno3 = new Aluno(2, "Matheus", 19);
        Aluno aluno4 = new Aluno(1, "Alex", 19);
        listasimples.add(aluno3);
        listasimples.add(aluno4);
        
        System.out.println("TESTE3");
        int tamanhoLista = listasimples.size();
        for(int i = 0; i < tamanhoLista; i++){
            System.out.println("Nome: "+listasimples.get(i).getNome());
        }
        
        
    }
}
