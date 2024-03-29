package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces;
public class NotaFiscal implements Imprimivel, EnviavelPorEmail {
    private int numero;
    public NotaFiscal(int numero) {
        this.numero = numero;
    }
    public void adicionarPedido(String produto){
    }
    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de numero: " + numero);
    }
    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número: " + numero + " para o email: " + email);
    }
}
