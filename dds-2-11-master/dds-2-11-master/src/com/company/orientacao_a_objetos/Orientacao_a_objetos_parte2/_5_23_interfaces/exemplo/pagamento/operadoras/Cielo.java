package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.operadoras;

import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.Autorizavel;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.Cartao;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}

}
