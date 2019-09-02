package br.edu.opet.model;

public class caixa {
	
	private int idConteudo;
	private double Largura;
	private double Altura;
	private double Comprimento;
	
	public caixa ( int pidConteudo,double plargura,
			double paltura,double pComprimento){
		
		this.idConteudo = pIdConteudo;
		this.altura = paltura;
		this.comprimento = pComprimento
		this.largura = pLargura
	}
	
	public int getIdConteudo() {
		return idConteudo;
	}
	public void setIdConteudo(int idConteudo) {
		this.idConteudo = idConteudo;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getVolume() {
		return this.altura * this.largura * this.comprimento;
	}

}
