package org.example.entities;

public class Pessoa {
    private int idade;
    private String nome;
    private String correndo;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCorrendo() {
        return correndo;
    }
    public void setCorrendo(String correndo) {
        this.correndo = correndo;
    }


    public void correr(String correndo){
        if (correndo.equalsIgnoreCase("y") || correndo.equalsIgnoreCase( "s")) {
            System.out.println("Correndo");
        } else {
            System.out.println("Erro! A Pessoa está parada!!");
        }
    }

    public String toString() {
        return "Nome: " + nome + "\nidade: " + idade + " \nEstá correndo?  %s" + correr(correndo);
    }

}