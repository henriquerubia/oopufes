/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.imoveis;

public class Velho extends Imovel {
    
    static private float desconto = 10000;

    static public float getValor() {
        return valor - desconto;
    }

    public void imprimeValor() {
        System.out.println("Valor do Imovel Velho: R$ " + getValor());
    }
}