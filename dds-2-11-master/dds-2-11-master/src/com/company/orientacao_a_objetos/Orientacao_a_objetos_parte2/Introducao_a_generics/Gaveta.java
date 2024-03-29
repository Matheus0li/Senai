package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2.Introducao_a_generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> {
    private List<E> colecao = new ArrayList<>();

    public void colocar(E e){
        colecao.add(e);
    }

    public E retirarPrimeiro(){
        return colecao.get(0);
    }

}
