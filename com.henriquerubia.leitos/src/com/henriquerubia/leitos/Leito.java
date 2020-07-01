/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.leitos;

public class Leito {
    static protected int numero;
    static protected String status;
    static protected String setor;
    static protected String responsavel;

    static public void setNumero(int valor) {
        numero = valor;
    }

    static public void setStatus(String valor) {
        status = valor;
    }

    static public void setSetor(String valor) {
        setor = valor;
    }

    static public void setResponsavel(String valor) {
        responsavel = valor;
    }

    public void imprimir() {
        System.out.println("Número:      " + numero);
        System.out.println("Status:      " + status);
        System.out.println("Setor:       " + setor);
        System.out.println("Responsavel: " + responsavel);
    }

}