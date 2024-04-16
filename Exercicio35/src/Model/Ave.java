
package Model;

public class Ave implements IAnimal{
    private String raca;
    private int idade;
    
    @Override
    public void mover(){
        System.out.println("Voa");
    }
    
    @Override
    public void produzirSom(){
        System.out.println("Cantar");
    }
}
