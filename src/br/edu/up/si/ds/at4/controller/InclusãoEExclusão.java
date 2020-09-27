package br.edu.up.si.ds.at4.controller;

import java.io.IOException;
import java.util.Scanner;

import br.edu.up.si.ds.at4.objs.Bebida;
import br.edu.up.si.ds.at4.objs.Prato;
import br.edu.up.si.ds.at4.objs.Vinho;
import br.edu.up.si.ds.at4.util.ListaItens;
import br.edu.up.si.ds.at4.util.ProcessaListas;

public class InclusãoEExclusão {

	public static void criarNovoObjeto() throws IOException, InterruptedException {
	
		int escolha;
		String pratoAdicionado;
		double precoAdicionado;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("O que você deseja incluir?");
		ListaItens.pratoBebidaVinho();
	
		escolha = sc.nextInt();
	
		sc.nextLine();
	
		if (escolha == 1) {
	
			System.out.println("Digite o nome do prato: ");
			pratoAdicionado = sc.nextLine();
			System.out.println("Digite o preço desejado: ");
			precoAdicionado = sc.nextDouble();
	
			Prato prato = new Prato();
			prato.setPrato(pratoAdicionado);
			prato.setPreco(precoAdicionado);
			prato.setCodigo(MenuEPedido.codigoPrato); // seta o valor que está na variável
			MenuEPedido.codigoPrato++; // após, aumenta em 1
	
			ProcessaListas.getListaPratos().add(prato);
	
			System.out.println("Prato adicionado!");
			Thread.sleep(2000);
			System.out.println("Pressione ENTER para retornar ao menu...");
			System.in.read();
	
		} else if (escolha == 2) {
	
			System.out.println("Digite o nome da bebida: ");
			pratoAdicionado = sc.nextLine();
			System.out.println("Digite o preço desejado: ");
			precoAdicionado = sc.nextDouble();
	
			Bebida bebida = new Bebida();
			bebida.setBebida(pratoAdicionado);
			bebida.setPreco(precoAdicionado);
			bebida.setCodigo(MenuEPedido.codigoBebida);
			MenuEPedido.codigoBebida++;
	
			ProcessaListas.getListaBebidas().add(bebida);
	
			System.out.println("Bebida adicionada!");
			Thread.sleep(2000);
			System.out.println("Pressione ENTER para retornar ao menu...");
			System.in.read();
	
		} else if (escolha == 3) {
	
			System.out.println("Digite o nome do vinho: ");
			pratoAdicionado = sc.nextLine();
			System.out.println("Digite o preço desejado: ");
			precoAdicionado = sc.nextDouble();
	
			Vinho vinho = new Vinho();
			vinho.setVinho(pratoAdicionado);
			vinho.setPreco(precoAdicionado);
			vinho.setCodigo(MenuEPedido.codigoVinho);
			MenuEPedido.codigoVinho++;
	
			ProcessaListas.getListaVinhos().add(vinho);
	
			System.out.println("Vinho adicionado!");
			Thread.sleep(2000);
			System.out.println("Pressione ENTER para retornar ao menu...");
			System.in.read();
	
		}
	
	}

	public static void excluirItem() throws IOException, InterruptedException {
	
		System.out.println("Deseja excluir um item de qual lista?");
		ListaItens.pratoBebidaVinho();
	
		Scanner sc = new Scanner(System.in);
		int escolha = sc.nextInt();
	
		if (escolha == 1) {
			ListaItens.listaItens(escolha);
	
			System.out.println("Digite o código do prato que deseja excluir");
			int pratoExcluido = sc.nextInt();
	
			ProcessaListas.getListaPratos().remove(pratoExcluido - 1);
			System.out.println("Prato removido!");
			MenuEPedido.menuPrincipal();
			
		} else if (escolha == 2) {
			ListaItens.listaItens(escolha);
	
			System.out.println("Digite o código da bebida que deseja excluir");
			int bebidaExcluida = sc.nextInt();
	
			ProcessaListas.getListaBebidas().remove(bebidaExcluida - 1);
			System.out.println("Bebida removida!");
			MenuEPedido.menuPrincipal();
			
		} else if (escolha == 3) {
			ListaItens.listaItens(escolha);
	
			System.out.println("Digite o código do vinho que deseja excluir");
			int vinhoExcluido = sc.nextInt();
	
			ProcessaListas.getListaVinhos().remove(vinhoExcluido - 1);
			System.out.println("Vinho removido!");
			MenuEPedido.menuPrincipal();
		}
	
	}

}
