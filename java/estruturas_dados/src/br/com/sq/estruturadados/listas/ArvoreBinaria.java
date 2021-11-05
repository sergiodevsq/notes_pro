package br.com.sq.estruturadados.listas;

public class ArvoreBinaria {
	
	private NoBinaria noRaiz;
	
	
	
	public ArvoreBinaria(NoBinaria noRaiz) {
		this.noRaiz = noRaiz;
	}
	public ArvoreBinaria() {}
	
	public void finalize() {
		this.liberarArvore();
		System.out.println("Arvore binária dinâmica liberada.");
	}
	
	public void liberarArvore() {
		
		if(noRaiz == null)
			return;	
	}
	
	//Quantidade de nós na árvore binária
	public int calcularQuantidadeNos(NoBinaria no) {
		if(no == null)
			return 0;
		return calcularQuantidadeNos(no.getNoEsquerda()) + calcularQuantidadeNos(no.getNoDireita()) + 1;
	}
	
	// Calcula altura de um nó específico
	public int calcularAlturaNo(NoBinaria no) {
		int u, v;
		if(no == null)
			return -1;
		
		u = calcularAlturaNo(no.getNoEsquerda());
		v = calcularAlturaNo(no.getNoDireita());
		
		if(u > v) 
			return u+1;
		else
			return v+1;
	}
	
	public void imprimirNo(NoBinaria no) {
		if(no == null)
			return;
		
		System.out.println("Matrícula : "+no.getAluno().getMatricula()+" Nome aluno : "+no.getAluno().getNome());
		imprimirNo(no.getNoEsquerda());
		imprimirNo(no.getNoDireita());
	}
	
	
	//public void traverse (Node root){ // Each child of a tree is a root of its subtree.
	//    if (root.left != null){
	//        traverse (root.left);
	//    }
	//    System.out.println(root.data);
	//    if (root.right != null){
	//        traverse (root.right);
	//    }
	//}
	
	//public int soma(No pointer) {

      //  if(pointer == null)
      //      return 0;
      //  else {
      //      int soma = 0;
      //      soma += soma(pointer.esquerdo);
     //       soma += soma(pointer.direito);
     //       soma += pointer.valor;
     //       return soma;
     //   }
    //}
	
	
	public NoBinaria getNoRaiz() {
		return noRaiz;
	}

	public void setNoRaiz(NoBinaria noRaiz) {
		this.noRaiz = noRaiz;
	}
	
	
	
	
	
	
}
