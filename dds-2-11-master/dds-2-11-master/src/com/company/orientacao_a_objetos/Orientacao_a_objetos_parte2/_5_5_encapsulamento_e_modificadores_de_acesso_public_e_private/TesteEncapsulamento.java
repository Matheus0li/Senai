package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_5_encapsulamento_e_modificadores_de_acesso_public_e_private;
public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");
        ar.trocarTemperatura(10);
        System.out.println("Tempretura do ar: " + ar.obterTemperatura() + "°");
    }
}
