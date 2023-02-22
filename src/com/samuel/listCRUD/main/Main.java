package com.samuel.listCRUD.main;

import java.util.Scanner;

import com.samuel.listCRUD.object.Lista;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Lista lista = new Lista();
		
		System.out.println("Lista");
		System.out.println("-----------");
		lista.exibeItens();
		System.out.println();
		for(boolean flag = true; flag; ) {
			System.out.println("-----------");
			System.out.print("Digite a opção desejada: ");
			System.out.println("\n 0 - Encerrar Programa 	| 1 - Adicionar item"
					+ "\n 2 - Alterar item 	| 3 - Deletar item"
					+ "\n 4 - Zerar lista 	| 5 - Mudar titulo");
			int opcao = scan.nextInt();
			
			switch(opcao){
			case 0:
				lista.exibeItens();
				//encerra o programa
				break;
			case 1:
				System.out.println("------------- ");
				String conteudo = scan.next();
				lista.adicionaItens(conteudo);
				break;
			case 2:
				//Altera um item
				break;
			case 3:
				//Deleta um item
				break;
			case 4:
				//Limpa a lista
				break;
			case 5:
				//Muda o titulo da lista
				
			}
		}
		

	}

}
