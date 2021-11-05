package br.com.sq.estruturadados;

import br.com.sq.estruturadados.listas.ArvoreNAria;
import br.com.sq.estruturadados.listas.NoNArias;
import br.com.sq.estruturadados.tads.Aluno;

public class TesteArvoreNAria {

	public static void main(String[] args) {
		
		System.out.println("Teste árvore N-Aria");
		
		Aluno al1 = new Aluno(1, "Vanessa Camargo");
		NoNArias no1 = new NoNArias(al1);
		
		Aluno al2 = new Aluno(2, "Renata Ciribeli");
		NoNArias no2 = new NoNArias(al2);
		
		Aluno al3 = new Aluno(3, "Carlos Barcelar");
		NoNArias no3 = new NoNArias(al3);
		
		
		ArvoreNAria tree = new ArvoreNAria(no1);
		
		tree.inserirNo(no2, no1, tree.getNoRaiz());
		tree.inserirNo(no3, no1, tree.getNoRaiz());
		
		tree.exibirArvore(tree.getNoRaiz());
		

	}

}
