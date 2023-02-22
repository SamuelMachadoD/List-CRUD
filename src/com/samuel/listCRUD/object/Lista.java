package com.samuel.listCRUD.object;

public class Lista {
	private String[] itens = new String[10];//Mudar para array infinito;
	private String titulo = "Nova Lista";
	
	public Lista(){
		for(int i = 0 ; i < itens.length; i++) {
			itens[i] = "---";
		}
	}
	
	public void exibeItens(){
		System.out.println(titulo);
		for(int i = 0; i < itens.length; i++) {
			System.out.println(itens[i]);
		}
	}
	public void deletaItens(int indice) {
		itens[indice] = "---";
	}
	public void adicionaItens(String conteudo) {
		for(int i = 0; i < itens.length; i++) {
			if(itens[i].equals("---")){
				itens[i] = conteudo;
			}else {
				System.out.println("ERRO: Sem espaços vazios");
			}
		}
	}
}
