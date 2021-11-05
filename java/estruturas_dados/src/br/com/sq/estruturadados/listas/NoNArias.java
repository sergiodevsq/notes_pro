package br.com.sq.estruturadados.listas;

import br.com.sq.estruturadados.tads.Aluno;

public class NoNArias {
	
		private Aluno aluno;
		private NoNArias primFilho;
		private NoNArias proxIrmao;
		
		
		
		
		public NoNArias(Aluno aluno) {
			this.aluno = aluno;
			this.primFilho = null;
			this.proxIrmao = null;
		}




		public Aluno getAluno() {
			return aluno;
		}
		public void setAluno(Aluno aluno) {
			this.aluno = aluno;
		}

		public NoNArias getPrimFilho() {
			return primFilho;
		}
		public void setPrimFilho(NoNArias primFilho) {
			this.primFilho = primFilho;
		}

		public NoNArias getProxIrmao() {
			return proxIrmao;
		}
		public void setProxIrmao(NoNArias proxIrmao) {
			this.proxIrmao = proxIrmao;
		}
		
		
	
}
