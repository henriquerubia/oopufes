/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.ingressos;

public class Main {
    
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        ingresso.imprimeValor();

        Normal normal = new Normal();
        normal.imprimeValor();

        VIP vip = new VIP();
        vip.imprimeValor();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        camaroteSuperior.imprimeValor();

        CamaroteInferior camaroteInferior = new CamaroteInferior();
        camaroteInferior.imprimeLocal();
    }
}
