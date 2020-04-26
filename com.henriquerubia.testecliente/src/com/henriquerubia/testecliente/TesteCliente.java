/**
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.testecliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.nome = "Fulano Ciclano";
        cliente1.cpf = "123.456.789-01";
        cliente1.rua = "Rua Portuguesa";
        cliente1.bairro = "Bairro Romano";
        cliente1.cidade = "Municipio Capixaba";
        cliente1.uf = "ES";
        cliente1.rg = "1.234.567";

        System.out.println("Nome: \t\t" + cliente1.nome);
        System.out.println("CPF: \t\t" + cliente1.cpf);
        System.out.println("Rua: \t\t" + cliente1.rua);
        System.out.println("Bairro: \t" + cliente1.bairro);
        System.out.println("Cidade: \t" + cliente1.cidade);
        System.out.println("UF: \t\t" + cliente1.uf);
        System.out.println("RG: \t\t" + cliente1.rg);
    }
}