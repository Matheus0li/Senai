package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2.Introducao_a_generics;

public class TesteGaveta {
    public static void main(String[] args) {
        Gaveta<String> gaveta = new Gaveta<>();

        gaveta.colocar("Livro de Java");
        System.out.println(gaveta.retirarPrimeiro());
        Gaveta<Integer> gavetaNumeros = new Gaveta<>();
        gavetaNumeros.colocar(4);
        System.out.println(gaveta.retirarPrimeiro() + 2);
    }
}
