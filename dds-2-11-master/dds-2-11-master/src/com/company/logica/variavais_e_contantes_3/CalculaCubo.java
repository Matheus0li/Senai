package com.company.logica.variavais_e_contantes_3;

import java.util.Scanner;

public class CalculaCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        Integer numero = scanner.nextInt();

        Integer cubo = numero * numero * numero;

        System.out.println("O cubo de " + numero + " e " + cubo + ".");

        scanner.close();

    }

}
