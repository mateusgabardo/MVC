package br.edu.opet.model;

public class Elemento {
	public Integer id;
	public String nome;
	
	//Construtor
	public Elemento(int , pId, String pNome) {
		this.nome = pNome;
		this.id = pId;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
