/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.leitos;

public class LeitoTerapiaIntensiva extends Leito {
    static private String tipoAparelhos = "Monitor multiparamétrico e eletroencefalografia";

    static public String getTipoAparelhos() {
        return tipoAparelhos;
    }

    public void imprimir() {
        System.out.println("Leito de Terapia Intensiva");
        System.out.println("==========================");
        System.out.println("Tipo de Aparelhos: " + getTipoAparelhos());
    }
}