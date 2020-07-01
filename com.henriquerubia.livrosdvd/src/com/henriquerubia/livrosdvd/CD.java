/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.livrosdvd;

public class CD extends Midia {
    
    private static int faixas;
    private static int capacidade;

    public void setValores(String new_nome, float new_valor, int new_faixas, int new_capacidade) {
        super.setValores(new_nome, new_valor);
        faixas = new_faixas;
        capacidade = new_capacidade;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Faixas: \t : " + faixas);
        System.out.println("Capacidade: \t : " + capacidade);
    }
}