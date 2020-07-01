/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.funcionario;

public class Gerente extends Funcionario {
    private static int senhaMaster = 123;

    public static void aprovaCrediario(String cpf) {
        System.out.println("CPF: " + cpf);
        System.out.println("MasterPwd: " + senhaMaster);
    }
}