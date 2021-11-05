package br.com.sq.estruturadados.listas;

import br.com.sq.estruturadados.tads.Aluno;

public class NoBinaria {
	
	private Aluno aluno; 
	private NoBinaria noPai;
	private NoBinaria noEsquerda;
	private NoBinaria noDireita;
	
	public NoBinaria(Aluno aluno, NoBinaria noPai) {
		this.aluno = aluno;
		this.noEsquerda = null;
		this.noDireita = null;
		this.noPai = noPai;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public NoBinaria getNoPai() {
		return noPai;
	}

	public void setNoPai(NoBinaria noPai) {
		this.noPai = noPai;
	}

	public NoBinaria getNoEsquerda() {
		return noEsquerda;
	}

	public void setNoEsquerda(NoBinaria noEsquerda) {
		this.noEsquerda = noEsquerda;
	}

	public NoBinaria getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(NoBinaria noDireita) {
		this.noDireita = noDireita;
	}
	
	
	
	
	
}
