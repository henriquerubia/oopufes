/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.imoveis;

public class Novo extends Imovel {
    
    static private float adicional = 50000;

    static public float getValor() {
        return valor + adicional;
    }

    public void imprimeValor() {
        System.out.println("Valor do Imovel Novo: R$ " + getValor());
    }
}