package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.impressao.impressoras;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;
import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.impressao.Impressora;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Compra c) {
        System.out.println("Enviando o comando para a impressora HP -> " + c);
    }
}
