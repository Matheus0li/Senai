package com.company.orientacao_a_objetos._6_topcos_avancados._6_14_ordenado_objetos;

import java.util.Comparator;

public class IdadeCompararator  implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        if (pessoa1.getIdade() < pessoa2.getIdade()) {
            return -1;
        } else if (pessoa1.getIdade() > pessoa2.getIdade()) {
            return 1;
        }
        return 0;
    }
}
