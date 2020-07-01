/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.livrosdvd;

import java.util.Vector;
import java.util.Iterator;

public class Loja {
    
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setValores("Senhor dos Aneis e a Sociedade do Anel", 365, 23, 2, "JRR Tolkien");

        Livro livro2 = new Livro();
        livro2.setValores("Senhor dos Aneis e as Duas Torres", 365, 23, 2, "JRR Tolkien");

        Livro livro3 = new Livro();
        livro3.setValores("Senhor dos Aneis e o Retorno do Rei", 365, 23, 2, "JRR Tolkien");

        CD cd = new CD();
        cd.setValores("Linkin Park", 32, 42, 234);

        DVD dvd = new DVD();
        dvd.setValores("Harry Potter e a Câmara Secreta", 35, 120, "JK Rowling", "Daniel Radcliffe, Emma Watson, Rupert Grint");

        Vector<Midia> midia = new Vector<Midia>();

        midia.add(livro1);
        midia.add(livro2);
        midia.add(livro3);
        midia.add(cd);
        midia.add(dvd);

        Iterator<Midia> itr = midia.iterator();

        while (itr.hasNext()) {
            itr.next().imprimir();
        }
    }
}
