package com.company.logica.variavais_e_contantes_3;
import java.util.Scanner;
public class QuadradoDeUmNumero34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        Integer numero = scanner.nextInt();

        Integer quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " e " + quadrado + ".");

        scanner.close();

    }
}
