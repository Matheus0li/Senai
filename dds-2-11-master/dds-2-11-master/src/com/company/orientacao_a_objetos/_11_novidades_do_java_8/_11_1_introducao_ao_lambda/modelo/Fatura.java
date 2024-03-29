package com.company.orientacao_a_objetos._11_novidades_do_java_8._11_1_introducao_ao_lambda.modelo;

public class Fatura {

    private String emailDevedor;
    private  double valor;
    private boolean emailEnviado;

    public Fatura(String emailDevedor, double valor) {
        this.emailDevedor = emailDevedor;
        this.valor = valor;
    }

    public String resumo(){
        return "Valor devido: " + valor;
    }

    public boolean ifEmailEnviado(){
        return emailEnviado;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isEmailEnviado() {
        return emailEnviado;
    }

    public void setEmailEnviado(boolean emailEnviado) {
        this.emailEnviado = emailEnviado;
    }
}