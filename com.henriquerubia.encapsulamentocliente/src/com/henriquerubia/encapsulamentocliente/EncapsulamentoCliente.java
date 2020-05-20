/**
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.encapsulamentocliente;

import java.util.Date;

public class EncapsulamentoCliente {
    public static void main(String[] args) {

        /**
         * Mostra a hora atual.
         */
        Date dataAtual = new Date();
        System.out.println("A data atual é: " + dataAtual.toString());

        /**
         * Instancia um novo objeto da classe Cliente.
         */
        Cliente cliente = new Cliente();

        /**
         * Configura os atributos de classe da instância cliente.  Com o 
         * encapsulamento visto na aula, usa-se setters e getters, e não
         * configura-se os atributos da classe diretamente.
         */
        cliente.setNome("Fulano Ciclano");
        cliente.setCPF("123.YYY.YYY-01");
        cliente.setRua("Rua Portuguesa");
        cliente.setBairro("Bairro XYZ");
        cliente.setCidade("Municipio Capixaba");
        cliente.setUF("ES");
        cliente.setRG("1.234.567");

        cliente.efetuarPedidoCompra();

        System.out.println("Cliente: " + cliente.toString());
    }
}