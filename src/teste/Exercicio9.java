package teste;

import teste.interfaces.ValorQuadrado;

/**
 *
 * @author Guilherme Gomes
 */
public class Exercicio9 {

    public static void main(String[] args) {
        ValorQuadrado vq = e -> e * e;
        
        System.out.println(vq.aplicaPotenciaDois(7));
    }
}
