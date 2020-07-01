/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.livrosdvd;

public class Livro extends Midia {
    
    private static int paginas;
    private static int capitulos;
    private static String autor;

    public void setValores(String new_nome, float new_valor, int new_paginas, int new_capitulos, String new_autor) {
        super.setValores(new_nome, new_valor);
        paginas = new_paginas;
        capitulos = new_capitulos;
        autor = new_autor;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Paginas: \t : " + paginas);
        System.out.println("Capitulos: \t : " + capitulos);
        System.out.println("Autor: \t\t : " + autor);
    }


}