package com.company.orientacao_a_objetos._7_mais_detalhes_e_frameworks._7_3_JOptionPane;

import javax.swing.*;

public class ExemploJOptionPane1 {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        //JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
        JOptionPane.showConfirmDialog(null, "Você é homossexual?");
    }
}
