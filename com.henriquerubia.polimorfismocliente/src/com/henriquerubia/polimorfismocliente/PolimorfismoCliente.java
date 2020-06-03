/**
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.polimorfismocliente;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class PolimorfismoCliente {
    public static void main(String[] args) {

        /**
         * Cria uma lista ArrayList de Cliente
         */
        ArrayList<Cliente> listaArray = new ArrayList<Cliente>();

        /**
         * Cria uma lista List de Cliente, usando o mesmo construtor
         */
        List<Cliente> listaGenerica = new ArrayList<Cliente>();

        /**
         * Cria lista LinkedList de Cliente
         */
        List<Cliente> listaLinkedList = new LinkedList<Cliente>();

        /**
         * Instancia um novo objeto da classe Cliente e configura os atributos 
         * de classe.
         */
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Harry Potter");
        cliente1.setCPF("123.456.789-01");
        cliente1.efetuarPedidoCompra();

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Hermione Granger");
        cliente2.setCPF("234.567.890-02");
        cliente2.efetuarPedidoCompra();

        Cliente cliente3 = new Cliente();        
        cliente3.setNome("Ronald Weasley");
        cliente3.setCPF("345.678.901-03");
        cliente3.efetuarPedidoCompra();
        

        /**
         * Adiciona o objeto cliente às listas e imprime o resultado de cada.
         */
        listaArray.add(cliente1);
        imprimeLista(listaArray);

        listaGenerica.add(cliente2);
        imprimeLista(listaGenerica);

        listaLinkedList.add(cliente3);
        imprimeLista(listaLinkedList);
    }

    /**
     * Imprime os elementos de uma dada lista.
     */
    static void imprimeLista(final List<Cliente> lista) {
        for (Cliente itemLista: lista) {
            System.out.println(itemLista);
        }
    }
}