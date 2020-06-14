/**
 * Exercício simples demonstrando utilização de polimorfismo em programação
 *   orientada a objetos.
 * 
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.transporte;

public class Veiculo extends Transporte {
    
    /**
     * Método para demonstração da classe Veiculo
     * 
     * @return String mensagem
     */
    String mover() {
        return "Sou Veiculo. Herdo de Transporte.";
    }
}