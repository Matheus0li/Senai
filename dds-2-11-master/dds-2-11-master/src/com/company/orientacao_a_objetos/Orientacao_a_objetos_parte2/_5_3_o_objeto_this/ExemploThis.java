package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_3_o_objeto_this;

public class ExemploThis {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";
        System.out.println("Modelo antes: " + carro.modelo);
        carro.alterarModelo("Civic");
        System.out.println("Modelo depois: " + carro.modelo);
    }
}
