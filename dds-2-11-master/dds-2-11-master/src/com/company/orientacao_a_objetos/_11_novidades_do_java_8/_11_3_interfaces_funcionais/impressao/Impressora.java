package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.impressao;

import com.company.orientacao_a_objetos._11_novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;

@FunctionalInterface
public interface Impressora {

    public void imprimir(Compra c);
}
