package teste;

import teste.interfaces.ValorQuadrado;

/**
 *
 * @author Guilherme Gomes
 */
public class Exercicio11 {

    public static void main(String[] args) {
        ValorQuadrado vq = e -> e * e;
        System.out.println(vq.aplicaPotenciaDois(7));

        int b = (int) Math.sqrt(81);
        System.out.println(vq.aplicaPotenciaDois(b));
    }
}
