/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.ingressos;

public class VIP extends Ingresso {
    
    static protected int adicional = 60;

    public void imprimeValor() {
        System.out.println("Valor VIP: R$ " + (adicional + valor));
    }
}
