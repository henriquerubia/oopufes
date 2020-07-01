/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.leitos;

public class LeitoPosOperatorio extends Leito {
    static private String convenio = "SUS";
    static private String medico = "Dr. Drauzio Varella";

    public static String getConvenio() {
        return convenio;
    }

    public static String getMedico() {
        return medico;
    }

    public void imprimir() {
        System.out.println("Leito de Pós-Operatório");
        System.out.println("==========================");
        System.out.println("Tipo de Convênio:   " + getConvenio());
        System.out.println("Medico Responsável: " + getMedico());
    }
}