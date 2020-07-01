/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.funcionario;

public class Assistente extends Funcionario {
    static protected int matricula = 13245;

    public static void exibeDados() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome:      " + nome);
        System.out.println("CPF:       " + cpf);
        System.out.println("Função:    " + funcao);
    }
}