
package Principal;

import Model.*;

public class Exercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Ave ave = new Ave();
        System.out.println("Ave");
        ave.produzirSom();
        ave.mover();
       
        System.out.println("\nCachorro");
        cachorro.produzirSom();
        cachorro.mover();

    
    }
    
}
