package com.company.logica.estrutura_de_decisao;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        boolean pesoLeve = (peso <= 60) && (peso > 0);
        boolean pesoMedio = (peso > 60) && (peso <= 90);
        boolean pesoPesado = peso > 90;

        if (pesoLeve) {
            System.out.println("O lutador [e peso l[eve");
        } else if (pesoMedio) {
            System.out.println("O lutador [e peso m[edio");
        } else if (pesoPesado) {
            System.out.println("O lutador [e peso pesado");
        } else {
            System.out.println("O lutador n'ao se encaixa em categoria alguma");
        }

        scanner.close();
    }
}
