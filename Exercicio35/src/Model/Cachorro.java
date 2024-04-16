
package Model;

public class Cachorro implements IAnimal{
    private String raca;
    private int idade;
    

    @Override
    public void mover(){
        System.out.println("Anda");
    }
    
    @Override
    public void produzirSom(){
        System.out.println("Latir");
    }
}
