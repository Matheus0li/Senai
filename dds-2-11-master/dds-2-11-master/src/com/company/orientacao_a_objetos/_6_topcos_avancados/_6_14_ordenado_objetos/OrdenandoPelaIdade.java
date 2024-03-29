package com.company.orientacao_a_objetos._6_topcos_avancados._6_14_ordenado_objetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(" João", 22);
        Pessoa pessoa2 = new Pessoa(" Adriana", 23);
        Pessoa pessoa3 = new Pessoa(" Bruno", 21);

        List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3);
        IdadeCompararator idadeCompararator = new IdadeCompararator();

        Collections.sort(pessoas, idadeCompararator);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
