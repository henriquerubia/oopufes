/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.leitos;

public class LeitoEnfermaria extends Leito {
    
    static private String gases = "Tipo 42";
    static private String estrutura = "Eletrico";

    public static String getGases() {
        return gases;
    }

    public static String getEstrutura() {
        return estrutura;
    }

    public void imprimir() {
        System.out.println("Leito de Enfermaria");
        System.out.println("==========================");
        System.out.println("Tipo de Gases:     " + getGases());
        System.out.println("Tipo de Estrutura: " + getEstrutura());
    }
}
