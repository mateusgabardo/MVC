package br.edu.opet.controller;

import br.edu.opet.view.TelaMenuPrincipal;

public class ControllerPrincipal {
	
	private ControllerCaixa ctrlCaixa = new ControllerCaixa();
	
	public void  executa() throws Exception {
		TelaMenuPrincipal tp = new TelaMenuPrincipal();
		int opc = -1;
		while (opc != 0) {
			switch(opc) {
			case 1://Cadastro
				ctrlCaixa.cadastro();
				break;
			case 2://Resumo
				ctrlCaixa.resumo();
				break;
			case 0:
				System.out.println("Encerrando App!");
				break;
			default : System.out.println("Opção Invalida")
			
			}
		}
	}
	
	
	
}
