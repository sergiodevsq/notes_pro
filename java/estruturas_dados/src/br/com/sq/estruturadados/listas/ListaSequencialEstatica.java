package br.com.sq.estruturadados.listas;



import java.util.Arrays;

import br.com.sq.estruturadados.tads.Aluno;

public class ListaSequencialEstatica {
	
	private Aluno[] alunos;
	private int quantidade;
	private boolean cheia;
	private boolean vazia;
	
	public ListaSequencialEstatica(int tamanho) {
		this.alunos 	= new Aluno[tamanho];
		this.quantidade = 0;
		this.cheia 		= false;
		this.vazia 		= true;
	}
	
	public boolean estaCheia() {
		return (quantidade < alunos.length ? false : true);
	}
	
	public boolean estaVazia() {
		return (quantidade <= 0 ? true : false);
	}
	
	//Adiciona ao final da lista por padrão
	public int adicionar(Aluno aluno) {
		if(aluno == null)
			return 0;	
		if(this.estaCheia())
			return 0;
		this.alunos[this.quantidade] = aluno;
		this.quantidade++;
		return 1;
	}
	
	//Adiciona no início da lista
	public int adicionarInicio(Aluno aluno) {
		if(aluno == null)
			return 0;	
		if(this.estaCheia())
			return 0;
		
		int i;
		for(i = this.quantidade -1; i>=0; i--)
			this.alunos[i + 1] = this.alunos[i];
		
		this.alunos[0] = aluno;
		this.quantidade++;
		return 1;
	}
	
	
	public int adicionarOrdenadoPorMatricula(Aluno aluno) {
		if(aluno == null)
			return 0;	
		if(this.estaCheia())
			return 0;
		
		int k, i = 0;
		while(i < this.quantidade && this.alunos[i].getMatricula() < aluno.getMatricula() )
			i++;
		
		for(k = this.quantidade -1; k >= i; k--)
			this.alunos[k+1] = this.alunos[k];
		
		this.alunos[i] = aluno;
		this.quantidade++;
		return 1;
	}
	
	//Remover no início
		public int removerInicio() {
			if(this.alunos == null)
				return 0;
			if(this.estaVazia())
				return 0;
			
			for(int i = 0; i < this.quantidade -1; i++ )
				this.alunos[i] = this.alunos[i+1];
			
			this.quantidade--;
			return 1;
		}
		
		//Remover no meio
		public int removerMeio(int matricula) {
			if(this.alunos == null)
				return 0;
			if(this.estaVazia())
				return 0;
			
			int k, i = 0;
			while(i < quantidade && alunos[i].getMatricula() != matricula)
				i++;
			
			if(i == quantidade)
				return 0;
			
			for(k=i; k<quantidade-1; k++)
				alunos[k] = alunos[k+1];
			
			quantidade--;
			return 1;
		}
		
		//Remover no final
		public int removerFinal() {
			if(this.alunos == null)
				return 0;
			if(this.estaVazia())
				return 0;
			
			this.quantidade--;
			return 1;
		}
		
		//Consultar pela posição
		public int consultarPorPosicao(Aluno aluno, int pos) {
			if(alunos == null || pos <= 0 || pos > quantidade)
				return 0;
			
			aluno = alunos[pos-1];
			return 1;
		}
		
		public int consultarPorConteudo(Aluno aluno, int pos) {
			if(alunos == null)
				return 0;
			
			int k, i = 0;
			
			while(i < quantidade && alunos[i].getMatricula() != pos)
				i++;
			
			if(i == quantidade)
				return 0;
			
			aluno = alunos[i];
			return 1;
		}
		
		@Override
		public String toString() {
			return "ListaSequencialEstatica [pontos=" + Arrays.toString(alunos) + ", quantidade=" + quantidade + ", cheia="
					+ cheia + ", vazia=" + vazia + "]";
		}
	
	
}
