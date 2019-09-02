package br.edu.opet.view;

import com.opet.util.Reader;

public class TelaMenuPrincipal {

	
	public int show  throws Exception() {
		int opc = 0;
		System.out.println ("-------------Menu-----------------");
		System.out.println ("1 - Cadastro de caixa");
		System.out.println ("2-  Resumo");
		opc = Reader.readInt();
		return opc;
	}
}
