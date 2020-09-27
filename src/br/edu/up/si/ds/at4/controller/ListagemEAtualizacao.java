package br.edu.up.si.ds.at4.controller;

import java.io.IOException;
import java.util.Scanner;

import br.edu.up.si.ds.at4.util.ListaItens;
import br.edu.up.si.ds.at4.util.ProcessaListas;

public class ListagemEAtualizacao {

	public static void listarCardapio() throws InterruptedException {
	
		int escolha = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("O que voc� deseja listar?");
		ListaItens.pratoBebidaVinho();
		
		escolha = sc.nextInt();
	
		ListaItens.listaItens(escolha);
	
	}

	public static void atualizarItem() throws IOException, InterruptedException {
	
		System.out.println("Deseja atualizar qual lista?");
		ListaItens.pratoBebidaVinho();
	
		Scanner sc = new Scanner(System.in);
		int escolha = sc.nextInt();
	
		if (escolha == 1) {
	
			ListaItens.listaItens(escolha);
	
			System.out.println("Digite o c�digo do prato que deseja alterar");
			int pratoAlterar = sc.nextInt();
			System.out.println("Prato: " + ProcessaListas.getListaPratos().get(pratoAlterar - 1).getPrato());
			System.out.println("Pre�o: " + ProcessaListas.getListaPratos().get(pratoAlterar - 1).getPreco());
			System.out.println("C�digo: " + ProcessaListas.getListaPratos().get(pratoAlterar - 1).getCodigo());
			System.out.println("Deseja alterar o nome ou o pre�o?");
			System.out.println("1. Nome");
			System.out.println("2. Pre�o");
			escolha = sc.nextInt();
	
			if (escolha == 1) {
	
				System.out.println("Digite o novo nome: ");
				sc.nextLine();
				String novoNome = sc.nextLine();
	
				ProcessaListas.getListaPratos().get(pratoAlterar - 1).setPrato(novoNome);
				MenuEPedido.menuPrincipal();
	
			} else if (escolha == 2) {
	
				System.out.println("Digite o novo pre�o: ");
				double novoPreco = sc.nextDouble();
				ProcessaListas.getListaPratos().get(pratoAlterar - 1).setPreco(novoPreco);
				MenuEPedido.menuPrincipal();
	
			} else {
	
				System.out.println("N�mero inv�lido");
				MenuEPedido.menuPrincipal();
	
			}
	
		} else if (escolha == 2) {
	
			ListaItens.listaItens(escolha);
	
			System.out.println("Digite o c�digo da bebida que deseja alterar");
			int bebidaAlterar = sc.nextInt();
			System.out.println("\nBebida: " + ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).getBebida());
			System.out.println("Pre�o: " + ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).getPreco());
			System.out.println("C�digo: " + ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).getCodigo());
	
			System.out.println("Deseja alterar o nome ou o pre�o?");
			System.out.println("1. Nome");
			System.out.println("2. Pre�o");
			escolha = sc.nextInt();
	
			if (escolha == 1) {
	
				System.out.println("Digite o novo nome: ");
				sc.nextLine();
				String novoNome = sc.nextLine();
	
				ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).setBebida(novoNome);
				MenuEPedido.menuPrincipal();
	
			} else if (escolha == 2) {
	
				System.out.println("Digite o novo pre�o: ");
				double novoPreco = sc.nextDouble();
				ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).setPreco(novoPreco);
				MenuEPedido.menuPrincipal();
	
			} else {
	
				System.out.println("N�mero inv�lido");
				MenuEPedido.menuPrincipal();
	
			}
	
		} else if (escolha == 3) {
	
			ListaItens.listaItens(escolha);
	
			System.out.println("Digite o c�digo do vinho que deseja alterar");
			int vinhoAlterar = sc.nextInt();
			System.out.println("\nBebida: " + ProcessaListas.getListaVinhos().get(vinhoAlterar - 1).getVinho());
			System.out.println("Pre�o: " + ProcessaListas.getListaVinhos().get(vinhoAlterar - 1).getPreco());
			System.out.println("C�digo: " + ProcessaListas.getListaVinhos().get(vinhoAlterar - 1).getCodigo());
	
			System.out.println("Deseja alterar o nome ou o pre�o?");
			System.out.println("1. Nome");
			System.out.println("2. Pre�o");
			escolha = sc.nextInt();
	
			if (escolha == 1) {
	
				System.out.println("Digite o novo nome: ");
				sc.nextLine();
				String novoNome = sc.nextLine();
				ProcessaListas.getListaVinhos().get(vinhoAlterar - 1).setVinho(novoNome);
				MenuEPedido.menuPrincipal();
	
			} else if (escolha == 2) {
	
				System.out.println("Digite o novo pre�o: ");
				double novoPreco = sc.nextDouble();
				ProcessaListas.getListaVinhos().get(vinhoAlterar - 1).setPreco(novoPreco);
				MenuEPedido.menuPrincipal();
	
			} else {
	
				System.out.println("N�mero inv�lido");
				MenuEPedido.menuPrincipal();
	
			}
	
		}
	
	} // fim do atualizarItem();

}
