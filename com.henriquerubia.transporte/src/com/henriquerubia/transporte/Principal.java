/**
 * Exercício simples demonstrando utilização de polimorfismo em programação
 *   orientada a objetos.
 * 
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.transporte;

public class Principal {
    
    /**
     * Método principal
     */
    public static void main(String[] args) {
        Transporte t = new Transporte();
        Carro c = new Carro();
        Veiculo v = new Veiculo();

        moverTransporte(t);
        moverTransporte(v);
        moverTransporte(c);
    }

    /**
     * Imprime retorno do objeto passado como parâmetro.
     * 
     * Uma vez que todas os objetos herdam de Transporte, pelo princípio de
     *  polimorfismo, é possível utilizar a classe pai como tipo do parÂmetro.
     */
    static void moverTransporte(Transporte trans) {
        System.out.println(trans.mover());
    }
}