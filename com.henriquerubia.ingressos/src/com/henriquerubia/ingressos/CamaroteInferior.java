/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.ingressos;

public class CamaroteInferior extends VIP {
    
    static private String local;

    public static String getLocal() {
        return local;
    }

    public void imprimeLocal() {
        System.out.println("Localização Camarote Inferior: " + getLocal());
    }
}