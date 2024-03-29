package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.teste;

import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.caixa.Checkout;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.caixa.Compra;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.impressao.Impressora;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.impressao.impressoras.ImpressoraHP;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.Cartao;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.Operadora;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.operadoras.Redecard;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Redecard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(500);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}
