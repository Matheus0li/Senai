package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_4_construtores;
public class TesteConstrutores {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        System.out.println("Nome: " + p1.nome + " tem " + p1.idade + " anos.");
        Pessoa p2 = new Pessoa("maria", 22);
        System.out.println("Nome: " + p2.nome + " tem " + p2.idade + " anos.");
    }
}
