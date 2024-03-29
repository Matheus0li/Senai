package com.company.logica.variavais_e_contantes_3;


public class TipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: " + variavelFalsa);

        System.out.println("---------------------------------------");

        Integer idade = 15;

        /*
            8>=8
            8<=8
            9>8
            8<9
            8==8
        */

        Boolean podeTirarCarteira = idade >= 18;

        System.out.println("Pode tirar carteira? " + podeTirarCarteira);

        System.out.println("---------------------------------------");

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar carteira.");
        } else {
            System.out.println("Nao! Ele(a) nao pode tirar carteira");
        }
    }
}
