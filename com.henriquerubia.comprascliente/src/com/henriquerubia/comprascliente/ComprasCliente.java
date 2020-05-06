/**
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.comprascliente;

import java.util.Date;

public class ComprasCliente {
    public static void main(String[] args) {

        Date dataAtual = new Date();
        System.out.println("A data atual é: " + dataAtual.toString());

        Cliente cliente1 = new Cliente();

        cliente1.nome = "Fulano Ciclano";
        cliente1.cpf = "123.YYY.YYY-01";
        cliente1.rua = "Rua Portuguesa";
        cliente1.bairro = "Bairro XYZ";
        cliente1.cidade = "Municipio Capixaba";
        cliente1.uf = "ES";
        cliente1.rg = "1.234.567";

        System.out.println("Cliente1: " + cliente1.toString());

        Cliente cliente2 = new Cliente();

        cliente2.nome = "Maria Ciclana";
        cliente2.cpf = "123.XXX.XXX-02";
        cliente2.rua = "Rua Portuguesa";
        cliente2.bairro = "Bairro XYZ";
        cliente2.cidade = "Municipio Capixaba";
        cliente2.uf = "ES";
        cliente2.rg = "1.234.567";

        cliente2.efetuarPedidoCompra();

        System.out.println("Cliente2: " + cliente2.toString());
    }
}