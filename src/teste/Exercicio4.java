package teste;

import teste.interfaces.Inteiro;

/**
 *
 * @author Guilherme Gomes
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Inteiro i1 = () -> 5;
        
        System.out.println(i1.getValue());
        System.out.println(multiplica(i1, () -> 40));
    }

    public static int multiplica(Inteiro primeiro, Inteiro segundo) {
        return primeiro.getValue() * segundo.getValue();
    }
}
