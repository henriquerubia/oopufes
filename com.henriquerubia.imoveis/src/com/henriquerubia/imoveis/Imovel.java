/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.imoveis;

public class Imovel {
    
    static protected String rua;
    static protected String bairro;
    static protected String cidade;
    static protected String estado;
    static protected String cep;

    static protected float valor = 100000;

    public static void main(String[] args) {
        Novo novo = new Novo();
        novo.imprimeValor();

        Velho velho = new Velho();
        velho.imprimeValor();
    }

}