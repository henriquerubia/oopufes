/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.livrosdvd;

public class Midia {
    protected static String nome;
    protected static float valor;

    public void setValores(String novo_nome, float novo_valor) {
        nome = novo_nome;
        valor = novo_valor;
    }

    public void imprimir() {
        System.out.println("Nome: \t\t : " + nome);
        System.out.println("Preço \t\t : " + valor);
    }
}

