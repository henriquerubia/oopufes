/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.livrosdvd;

public class DVD extends Midia {
    
    private static int duracao;
    private static String diretor;
    private static String atores;

    public void setValores(String new_nome, float new_valor, int new_duracao, String new_diretor, String new_atores) {
        super.setValores(new_nome, new_valor);
        duracao = new_duracao;
        diretor = new_diretor;
        atores = new_atores;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Duração: \t : " + duracao);
        System.out.println("Diretor: \t : " + diretor);
        System.out.println("Atores: \t : " + atores);
    }
}