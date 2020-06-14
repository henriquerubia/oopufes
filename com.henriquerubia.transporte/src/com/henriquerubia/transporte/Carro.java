/**
 * Exercício simples demonstrando utilização de polimorfismo em programação
 *   orientada a objetos.
 * 
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.transporte;

public class Carro extends Veiculo {

    /**
     * Método para demonstração da classe Carro
     * 
     * @return String mensagem
     */
    String mover() {
        return "Sou Carro. Herdo de Veiculo.";
    }
}