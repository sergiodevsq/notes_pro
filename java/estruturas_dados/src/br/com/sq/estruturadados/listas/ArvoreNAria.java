package br.com.sq.estruturadados.listas;

public class ArvoreNAria {
	
	private NoNArias noRaiz;
	
	
	public  ArvoreNAria() {}
	
	public ArvoreNAria(NoNArias no) {
		this.noRaiz = no;
	}
	
	public void finalize() {
		this.liberarArvore();
		System.out.println("Arvore binária dinâmica liberada.");
	}
	
	public void liberarArvore() {
		
		if(noRaiz == null)
			return;	
	}
	
	
	public int inserirNo(NoNArias no, NoNArias noPai, NoNArias noRaiz) {
		NoNArias pai = buscarPai(noPai, noRaiz);
		if (pai == null)
			return -1;
		
		if (pai.getPrimFilho() == null)
			pai.setPrimFilho(no);
		else {
			//NoNArias p = pai.getPrimFilho().getProxIrmao();
			NoNArias p = pai.getPrimFilho();
			NoNArias p2 = null;
			while( p != null ) {
				if(p.getProxIrmao() == null)
					p2 = p;
				
				p = p.getProxIrmao();
			}	
			
			p2.setProxIrmao(no);	
		}
		return 1;
	}
	
	
	public void exibirArvore(NoNArias no) {	
		if(no == null)
			return;
		
		System.out.println(no.getAluno().getNome());
		NoNArias p = no.getPrimFilho();
		while(p != null) {
			exibirArvore(p);
			p = p.getProxIrmao();
		}
	}
	
	
	public NoNArias buscarPai(NoNArias noPai, NoNArias noRaiz) {
		if(noRaiz == null)
			return null;
		
		if(noRaiz.getAluno().getMatricula() == noPai.getAluno().getMatricula() )
			return noRaiz;
		
		NoNArias p = noRaiz.getPrimFilho();
		
		while(p != null) {
			NoNArias resp = buscarPai(noPai, p);
			if(resp != null)
				return resp;
			p = p.getProxIrmao();
		}
		return null;
	}
	
	public NoNArias getNoRaiz() {
		return noRaiz;
	}
	public void setNoRaiz(NoNArias noRaiz) {
		this.noRaiz = noRaiz;
	}
	
	
	
	
	
}
