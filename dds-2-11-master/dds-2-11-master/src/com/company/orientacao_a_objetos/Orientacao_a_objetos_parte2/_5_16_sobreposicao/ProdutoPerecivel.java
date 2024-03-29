package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_16_sobreposicao;
import java.util.Date;
public class ProdutoPerecivel extends Produto {
    protected Date dataValidade;
    public void identificar(){
        super.identificar();
        System.out.println("Minha data de validade é: " + dataValidade);
    }

}
