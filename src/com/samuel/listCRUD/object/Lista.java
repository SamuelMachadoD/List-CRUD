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
	public void deletaItem(int indice) {
		itens[indice] = "---";
	}
	
	public void adicionaItem(String conteudo) {
		for(int i = 0; i < itens.length; i++) {
			if(itens[i].equals("---")){
				itens[i] = conteudo;
			}else {
				System.out.println("DESCULPE: Sem espaços vazios");
			}
		}
	}
	
	public void alteraItem(int id, String conteudo) {
		itens[id] = conteudo;
	}
	
	public void limpaLista() {
		for(int i = 0 ; i < itens.length; i++) {
			itens[i] = "---";
		}
	}
}
