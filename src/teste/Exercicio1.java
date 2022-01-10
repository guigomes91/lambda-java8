package teste;

import teste.interfaces.Inteiro;

/**
 *
 * @author Guilherme Gomes
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Inteiro i = () -> 72;
        
        System.out.println(i.getValue());
    }
}
