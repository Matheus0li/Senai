package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_9_modificador_de_acesso_default;
public class Cachorro {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void sentar(){
        System.out.println("Eu, " + nome + ", vou sentar!");
    }
}
