/**
 * Exercicio de Programação Orientada a Objetos
 * 
 * (This is purely for learning purposes)
 * 
 * Author: Carlos Henrique Rubia Barbosa <carlos.h.barbosa@aluno.ufes.br>
 */

package com.henriquerubia.leitos;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções:");
        System.out.println("  1. Leito de Enfermagem");
        System.out.println("  2. Leito de Pós-Operatório");
        System.out.println("  3. Leito de UTI");
        System.out.print("Opção [1-3]: ");

        int opt = scanner.nextInt();

        switch(opt) {
            case 1:
                LeitoEnfermaria leitoEnfermaria = new LeitoEnfermaria();
                leitoEnfermaria.imprimir();
                break;
            case 2:
                LeitoPosOperatorio leitoPosOperatorio = new LeitoPosOperatorio();
                leitoPosOperatorio.imprimir();
                break;
            case 3:
                LeitoTerapiaIntensiva leitoTerapiaIntensiva = new LeitoTerapiaIntensiva();
                leitoTerapiaIntensiva.imprimir();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
}