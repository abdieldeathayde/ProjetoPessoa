package org.example.entities;

public class Pessoa {
    private int idade;
    private String nome;
    private String correndo;

    String resultado;

    public Pessoa(int idade, String nome, String correndo) {
        this.idade = idade;
        this.nome = nome;
        this.correndo = correndo;
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


    public String correr(String correndo){
        if (correndo.equalsIgnoreCase("yes") || correndo.equalsIgnoreCase( "sim")) {
            resultado = "correndo";
        } else {
            resultado = "Erro! Pessoa esta parada";
        }
        return resultado;
    }

    public String toString() {
        return "Nome: " + nome + "\nidade: " + idade + " \nEstá correndo? " + String.format("\n%s", correr(correndo));
    }

}