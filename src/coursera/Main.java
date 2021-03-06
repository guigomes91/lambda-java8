package coursera;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        
        lista.add(new Produto("Tenis", 300));
        lista.add(new Produto("Camiseta", 80));
        lista.add(new Produto("Cinto", 50));
        
        Carrinho c = new Carrinho(lista);
        
        c.darDesconto(20, Produto::caro);
        
        c.getLista().forEach(System.out::println);
    }
    
}
