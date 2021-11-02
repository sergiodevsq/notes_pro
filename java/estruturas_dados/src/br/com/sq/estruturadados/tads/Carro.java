package br.com.sq.estruturadados.tads;

public class Carro {
	
	private long numeroChasi;
	private String nome;
	private String marca;
	
	public Carro(long numeroChasi, String nome, String marca) {
		this.numeroChasi = numeroChasi;
		this.nome = nome;
		this.marca = marca;
	}

	public long getNumeroChasi() {
		return numeroChasi;
	}

	public void setNumeroChasi(long numeroChasi) {
		this.numeroChasi = numeroChasi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
