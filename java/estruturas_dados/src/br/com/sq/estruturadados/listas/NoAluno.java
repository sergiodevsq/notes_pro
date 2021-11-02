package br.com.sq.estruturadados.listas;

import br.com.sq.estruturadados.tads.Aluno;

public class NoAluno {
	
	private Aluno aluno;
	private NoAluno proxNo;
	
	
	public NoAluno(Aluno aluno) {
		this.aluno = aluno;
		this.proxNo = null;
	}


	
	
	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public NoAluno getProxNo() {
		return proxNo;
	}


	public void setProxNo(NoAluno proxNo) {
		this.proxNo = proxNo;
	}
	
	
	
}
