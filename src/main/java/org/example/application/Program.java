package org.example.application;

import org.example.entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Diga se você está correndo");
        String correndo = sc.nextLine();

        Pessoa pessoa;
        pessoa = new Pessoa(idade, nome);

        System.out.println(pessoa);


        sc.close();
    }
}