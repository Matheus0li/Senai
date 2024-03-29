package com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.impressao.impressoras;

import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.impressao.Impressora;
import com.company.orientacao_a_objetos.Orientacao_a_objetos_parte2._5_23_interfaces.exemplo.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("==                   EPSON                   ==");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
	}

}
