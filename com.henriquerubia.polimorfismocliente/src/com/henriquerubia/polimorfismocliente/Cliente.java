/**
 * Copyright (C) 2020, Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.polimorfismocliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private String rg;

    private int quantidadeCompras;

    /**
     * Contabiliza nova compra realizada pelo cliente instanciado.
     */
    public void efetuarPedidoCompra() {
        System.out.println("Efetuando pedido de compra...");
        quantidadeCompras++;
    }

    /**
     * Retorna o nome do cliente.
     * 
     * @return String Nome do cliente.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Retorna o CPF do cliente.
     * 
     * @return String CPF do cliente.
     */
    public String getCPF() {
        return this.cpf;
    }

    /**
     * Retorna a rua do cliente.
     * 
     * @return String Rua do cliente.
     */
    public String getRua() {
        return this.rua;
    }

    /**
     * Retorna o bairro do cliente.
     * 
     * @return String Bairro do cliente.
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     * Retorna a cidade do cliente.
     * 
     * @return String Cidade do cliente.
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     * Retorna o UF do cliente.
     * 
     * @return String Unidade Federativa do cliente.
     */
    public String getUF() {
        return this.uf;
    }

    /**
     * Retorna o Registro Geral do cliente.
     * 
     * @return String RG do cliente.
     */
    public String getRG() {
        return this.rg;
    }

    /**
     * Retorna quantidade de compras realizadas pelo cliente.
     * 
     * @return int Quantidade compras realizadas.
     */
    public int getQuantidade() {
        return this.quantidadeCompras;
    }


    /**
     * Configura nome do cliente.
     * 
     * @param valor String Novo nome do cliente.
     */
    public void setNome(String valor) {
        this.nome = valor;
    }

    /**
     * Configura CPF do cliente.
     * 
     * @param valor String Novo CPF do cliente.
     */
    public void setCPF(String valor) {
        this.cpf = valor;
    }

    /**
     * Configura rua do cliente.
     * 
     * @param valor String Nova rua do cliente.
     */
    public void setRua(String valor) {
        this.rua = valor;
    }

    /**
     * Configura bairro do cliente.
     * 
     * @param valor String Novo bairro do cliente.
     */
    public void setBairro(String valor) {
        this.bairro = valor;
    }

    /**
     * Configura cidade do cliente.
     * 
     * @param valor String Nova cidade do cliente.
     */
    public void setCidade(String valor) {
        this.cidade = valor;
    }

    /**
     * Configura unidade federativa do cliente.
     * 
     * @param valor String Nova unidade federativa do cliente.
     */
    public void setUF(String valor) {
        this.uf = valor;
    }

    /**
     * Configura registro geral do cliente.
     * 
     * @param valor String Novo RG do cliente.
     */
    public void setRG(String valor) {
        this.rg = valor;
    }

    /**
     * Altera o número base para o contador de compras.
     * 
     * @param valor int Novo número para usar como base do contador.
     */
    public void setQuantidade(int valor) {
        this.quantidadeCompras = valor;
    }

    /**
     * Retorna string contendo informações importantes sobre o cliente
     * instanciado.
     * 
     * @return String String contendo informações do cliente para printar.
     */
    @Override
    public String toString() {
        String atributosClasse = "Nome: " + getNome() + ", CPF: " + getCPF() +
                                 ", Quantidade de compras: " + getQuantidade();
        return atributosClasse;
    }
}