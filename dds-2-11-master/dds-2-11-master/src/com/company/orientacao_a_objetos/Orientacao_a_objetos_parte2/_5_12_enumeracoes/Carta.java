package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_12_enumeracoes;
public class Carta {
    private int numero;
    private Naipe naipe;
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta(){
        System.out.println("Sou " + numero + " de " + naipe +
                ". E tenho a cor " + naipe.getCor());
    }
}
