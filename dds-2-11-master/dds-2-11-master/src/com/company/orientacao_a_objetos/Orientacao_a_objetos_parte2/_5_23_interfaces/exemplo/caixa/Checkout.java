package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.caixa;

import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.impressao.Impressora;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.Cartao;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.Operadora;

public class Checkout {

	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Pagamento foi negado!");
		}
	}
	
}
