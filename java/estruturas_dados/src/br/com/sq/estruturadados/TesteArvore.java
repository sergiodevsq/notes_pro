package br.com.sq.estruturadados;

import br.com.sq.estruturadados.listas.ArvoreBinaria;
import br.com.sq.estruturadados.listas.NoBinaria;
import br.com.sq.estruturadados.tads.Aluno;

public class TesteArvore {

	public static void main(String[] args) {
		
		System.out.println("Teste estrutura árvore");
		
		Aluno al1 = new Aluno(1, "Fernando");
		NoBinaria no1 = new NoBinaria(al1, null);
		
		ArvoreBinaria tree = new ArvoreBinaria(no1);
		
		
		Aluno al2 = new Aluno(2, "Angela");
		NoBinaria no2 = new NoBinaria(al2, no1);
		
		Aluno al3 = new Aluno(3, "Rafaela");
		NoBinaria no3 = new NoBinaria(al3, no1);
		
		no1.setNoEsquerda(no2);
		no1.setNoDireita(no3);
		
		Aluno al4 = new Aluno(4, "Matheus");
		NoBinaria no4 = new NoBinaria(al4, no2);
		
		Aluno al5 = new Aluno(5, "Alberto");
		NoBinaria no5 = new NoBinaria(al5, no2);
		
		no2.setNoEsquerda(no4);
		no2.setNoDireita(no5);
		
		System.out.println("Árvore binária montada.");
		
		int quantidadeNos = tree.calcularQuantidadeNos(tree.getNoRaiz());
		
		System.out.println(quantidadeNos);
		
		
		Aluno al6 = new Aluno(6, "Alberto");
		NoBinaria no6 = new NoBinaria(al6, no3);
		no3.setNoDireita(no6);
		
		Aluno al7 = new Aluno(7, "Alberto");
		NoBinaria no7 = new NoBinaria(al7, no3);
		no3.setNoEsquerda(no7);
		
		System.out.println(tree.calcularQuantidadeNos(tree.getNoRaiz()));
		
		tree.imprimirNo(tree.getNoRaiz());
		

	}

}
