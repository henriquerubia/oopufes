/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.funcionario;

public class Administrativo extends Assistente {
    private static String turno = "Noturno";

    public static void exibeDados() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome:      " + nome);
        System.out.println("Turno:     " + turno);
        System.out.println("CPF:       " + cpf);
        System.out.println("Função:    " + funcao);
    }
}