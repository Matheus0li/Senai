package com.company.orientacao_a_objetos._10_novidades_do_java_7._10_3_diamond;

import java.util.*;

public class ExemploDiamond {

    public static void main(String[] args) {
        List<String> nomeClientes = new ArrayList<>();
        nomeClientes.add("João");
        nomeClientes.add("Maria");

        Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
        carrosPorMontadora.put("Chevrolet", new HashSet<String>());
        carrosPorMontadora.get("Chevrolet").add("Cruze");
    }
}
