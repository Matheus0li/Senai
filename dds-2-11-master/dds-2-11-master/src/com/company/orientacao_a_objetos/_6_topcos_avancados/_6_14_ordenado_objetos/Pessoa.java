package com.company.orientacao_a_objetos._6_topcos_avancados._6_14_ordenado_objetos;

public class Pessoa implements  Comparable<Pessoa>{
    private String nome;
    private  int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());

    }
}
