package br.edu.opet.view;

import com.opet.util.Reader;

import br.edu.opet.model.Elemento;
import br.edu.opet.model.caixa;

public class TelaCaixa {
	
	private HashMap <Integer,String > hMapElemento = new HashMap <Integer,String>();
	
	
	public TelaCaixa (){
		this.hMapElemento = new HashMap <Integer,String>();
		Elemento elTMP = new Elemento("1", "Agua");
		this.hMapElemento.put(Integer.valueOf(elTMP.getId()), elTMP;
		elTMP = new Elemento("1", "Agua");
		this.hMapElemento.put(Integer.valueOf(elTMP.getId()), elTMP;
		Elemento elTMP = new Elemento("1", "Agua");
		this.hMapElemento.put(Integer.valueOf(elTMP.getId()), elTMP;

	
	public caixa show () {
		int opc = 0;
		while () {
		for (Elemento el : this.hMapElemento.values()) {
			System.out.println(el.getId() + " -" + el.getNome());
		}
		System.out.println("Informe o conteudo da Caixa:");	
		opc = Reader.readInt();
	}while (!this.hMapElemento.contaisKey(Integer.valueOf(opc)));

	System.out.println("Altura : ");
	double altura = Reader.readDouble();
	System.out.println("Largura : ");
	double largura = Reader.readDouble();
	System.out.println("Comprimento : ");
	double comprimento = Reader.readDouble();
	
	return new caixa(opc,altura,largura,comprimento);

	
}
