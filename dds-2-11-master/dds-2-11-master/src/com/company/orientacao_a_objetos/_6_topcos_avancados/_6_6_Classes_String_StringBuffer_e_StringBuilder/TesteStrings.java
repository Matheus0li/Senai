package com.company.orientacao_a_objetos._6_topcos_avancados._6_6_Classes_String_StringBuffer_e_StringBuilder;

public class TesteStrings {

    public static void main(String[] args) {

        String s = "Olá";
        s = s + " Pessoal!";

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Olá");
        sb.append(" Pessoal!");

        String resultado = sb.toString();
        System.out.println("Com StringBuilder: " + resultado);

    }
}
