package teste;

import teste.interfaces.ValorQuadrado;

/**
 *
 * @author Guilherme Gomes
 */
public class Exercicio10 {

    public static void main(String[] args) {
        
        ValorQuadrado vq = e -> {
            return e * e;
        };
        
        System.out.println(vq.aplicaPotenciaDois(7));
    }
}
