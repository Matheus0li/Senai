package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2.Introducao_a_generics;

import java.util.List;

public class RetiraElementos {

    public static <T> T recuperarPrimeiro(List<T> lista){
        return lista.get(0);
    }
}
