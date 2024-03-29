package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_16_sobreposicao;

import java.util.Date;

public class  TesteSobreposicao {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "Carne";
        pp.dataValidade = new Date();
        pp.identificar();
    }
}
