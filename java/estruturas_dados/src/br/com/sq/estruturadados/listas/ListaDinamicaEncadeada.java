package br.com.sq.estruturadados.listas;

import br.com.sq.estruturadados.listas.NoAluno;

public class ListaDinamicaEncadeada {
	
	private NoAluno noInicio;
	private int tamanho = 0;
	private boolean vazia = true;
	
	
	
	//Criar uma lista vazia
	public ListaDinamicaEncadeada() {}
	
	//Criar uma lista com um nó inicial
	public ListaDinamicaEncadeada(NoAluno alunoInicio) {
		this.noInicio = alunoInicio;
		this.tamanho = 1;
		this.vazia = false;
	}
	
	public void finalize() {
		this.liberarLista();
		System.out.println("Lista dinâmica liberada.");
	}
	
	public int getTamanho() {
		if (noInicio == null)
			return 0;
		
		int cont = 0;
		NoAluno no = noInicio;
		while(no != null) {
			no = no.getProxNo();
			cont++;
		}
		return cont;
	}
	
	public boolean estaVazia() {
		return (tamanho > 0 ? false : true);
	}
	
	public int liberarLista() {
		if(noInicio == null)
			return 0;
		
		NoAluno no;
		while(this.noInicio != null) {
			no = noInicio;
			noInicio = noInicio.getProxNo();
			no = null;
		}	
		return 1;
	}
	
	
	public int adicionarInicio(NoAluno noAluno) {
		NoAluno no = noInicio;
		noInicio = noAluno;
		noInicio.setProxNo(no);
		return 1;
	}
	
	public int adicionarMeio(NoAluno noAluno) {
		if(this.estaVazia()) {
			noAluno.setProxNo(null);
			noInicio = noAluno;
			tamanho++;
			return 1;
		}
		
		NoAluno anterior = null, atual = noInicio;
		
		while(atual != null && atual.getAluno().getMatricula() < noAluno.getAluno().getMatricula()) {
			anterior = atual;
			atual = atual.getProxNo();
		}
		
		if(atual == noInicio) {
			noAluno.setProxNo(noInicio);
			noInicio = noAluno;
			tamanho++;
		}
		else {
			noAluno.setProxNo(anterior.getProxNo());
			anterior.setProxNo(noAluno);
			tamanho++;
		}
		
		return 1;
	}
	
	
	public int adicionarFinal(NoAluno noAluno) {
		noAluno.setProxNo(null);
		if(this.estaVazia()) {
			noInicio = noAluno;
			return 1;
		}
		
		NoAluno no = noInicio;
		while(no.getProxNo() != null) {
			no = no.getProxNo();
		}
		no.setProxNo(noAluno);
		return 1;
	}
	
	
	public void mostrarLista() {
		if(this.estaVazia()) {
			System.out.println("Lista vazia");
		}
		else {
			NoAluno relatorio = noInicio;
			while(relatorio != null){
				System.out.println(relatorio.getAluno().getNome());
				relatorio = relatorio.getProxNo();
			}
		}
	}
	
	public NoAluno getNoInicio() {
		return this.noInicio;
	}
	
	public void setNoInicio(NoAluno no) {
		this.noInicio = no;
	}
	
}
