/**
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.comprascliente;

public class Cliente {
    String nome;
    String cpf;
    String rua;
    String bairro;
    String cidade;
    String uf;
    String rg;

    int quantidadeCompras;

    void efetuarPedidoCompra() {
        System.out.println("Efetuando pedido de compra...");
        quantidadeCompras++;
    }

    @Override
    public String toString() {
        String atributosClasse = "Nome: " + nome + ", CPF: " + cpf +
                                 ", Quantidade de compras: " + quantidadeCompras;
        return atributosClasse;
    }
}