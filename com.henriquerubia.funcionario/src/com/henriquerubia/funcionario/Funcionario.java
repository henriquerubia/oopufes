/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.funcionario;

import java.util.Scanner;

public class Funcionario {
    static protected String nome;
    static protected String cpf;
    static protected String funcao;

    public static void leDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome:   ");
        nome = scanner.nextLine();

        System.out.print("CPF:    ");
        cpf = scanner.nextLine();

        System.out.print("Função: ");
        funcao = scanner.nextLine();

        scanner.close();
    }

    public static void exibeDados() {
        System.out.println("Nome:   " + nome);
        System.out.println("CPF:    " + cpf);
        System.out.println("Função: " + funcao);
    }
}