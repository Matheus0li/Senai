package com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.composicao_de_objetos;
public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "João";
        meuCarro.dono.bairro = "Centro";
    }
}
