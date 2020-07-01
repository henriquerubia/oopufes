/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.ingressos;

public class CamaroteSuperior extends VIP {
    
    static protected int subadicional = 40;

    public static float getValor() {
        return (valor + adicional) + subadicional;
    }

    public void imprimeValor() {
        System.out.println("Valor Camarote Superior VIP: R$ " + getValor());
    }
}
