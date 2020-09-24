package br.edu.up.si.ds.at4.util;

import java.io.IOException;
import java.util.*;

import br.edu.up.si.ds.at4.objs.Bebida;
import br.edu.up.si.ds.at4.objs.Pedido;
import br.edu.up.si.ds.at4.objs.Prato;
import br.edu.up.si.ds.at4.objs.Vinho;
import br.edu.up.si.ds.at4.util.ProcessaListas;

public class ProcessamentoPrincipal {

	static int codigoPrato = 19, codigoBebida = 11, codigoVinho = 14, mudarIndice = 0;;

	public static void menuPrincipal() throws IOException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		int escolha = 0;

		System.out.println("\nDigite o número da operação que deseja realizar");
		System.out.println("1. Incluir");
		System.out.println("2. Listar");
		System.out.println("3. Atualizar");
		System.out.println("4. Excluur");
		System.out.println("5. Fazer pedido");
		System.out.println("0. Sair");

		escolha = sc.nextInt();

		// executa a função correspondente a escolha
		switch (escolha) {
		case 1:
			criarNovoObjeto();
			menuPrincipal();
			break;
		case 2:
			listarCardapio();
			menuPrincipal();
			break;
		case 3:
			atualizarItem();
			break;
		case 5:
			fazerPedido();
			menuPrincipal();
			break;
		case 0:
			break;
		default:
			System.out.println("Digite um número válido");
			menuPrincipal();
		}

	}

	public static void criarNovoObjeto() throws IOException, InterruptedException {

		int escolha;

		String pratoAdicionado;
		double precoAdicionado;

		Scanner sc = new Scanner(System.in);

		System.out.println("O que você deseja incluir?");
		System.out.println("1. Prato");
		System.out.println("2. Bebida");
		System.out.println("3. Vinho");

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
			prato.setCodigo(codigoPrato); // seta o valor que está na variável
			codigoPrato++; // após, aumenta em 1

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
			bebida.setCodigo(codigoBebida);
			codigoBebida++;

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
			vinho.setCodigo(codigoVinho);
			codigoVinho++;

			ProcessaListas.getListaVinhos().add(vinho);

			System.out.println("Vinho adicionado!");
			Thread.sleep(2000);
			System.out.println("Pressione ENTER para retornar ao menu...");
			System.in.read();

		}

	}

	public static void listarCardapio() throws InterruptedException {
		int escolha = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("O que você deseja listar?");
		System.out.println("1. Prato");
		System.out.println("2. Bebida");
		System.out.println("3. Vinho");
		escolha = sc.nextInt();

		if (escolha == 1) {

			for (int i = 0; i < ProcessaListas.getListaPratos().size(); i++) {
				Thread.sleep(200);
				System.out.println("\nPrato: " + ProcessaListas.getListaPratos().get(i).getPrato());
				System.out.println("Preço: " + ProcessaListas.getListaPratos().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaPratos().get(i).getCodigo());
			}

		} else if (escolha == 2) {

			for (int i = 0; i < ProcessaListas.getListaBebidas().size(); i++) {
				Thread.sleep(200);
				System.out.println("\nBebida: " + ProcessaListas.getListaBebidas().get(i).getBebida());
				System.out.println("Preço: " + ProcessaListas.getListaBebidas().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaBebidas().get(i).getCodigo());
			}

		} else if (escolha == 3) {

			for (int i = 0; i < ProcessaListas.getListaVinhos().size(); i++) {
				Thread.sleep(200);
				System.out.println("\nVinho: " + ProcessaListas.getListaVinhos().get(i).getVinho());
				System.out.println("Preço: " + ProcessaListas.getListaVinhos().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaVinhos().get(i).getCodigo());
			}

		} else {

			System.out.println("Número inválido");

		}
	}

	public static void fazerPedido() throws InterruptedException, IOException {

		Scanner sc = new Scanner(System.in);
		int pratoDesejado, bebidaDesejada = 0, vinhoDesejado = 0, pausa = 500;
		String observacao;

		System.out.println("Lista de pratos: ");

		for (int i = 0; i < ProcessaListas.getListaPratos().size(); i++) {
			Thread.sleep(pausa);
			System.out.println("\nPrato: " + ProcessaListas.getListaPratos().get(i).getPrato());
			System.out.println("Preço: " + ProcessaListas.getListaPratos().get(i).getPreco());
			System.out.println("Código: " + ProcessaListas.getListaPratos().get(i).getCodigo());

		}

		Pedido pedido = new Pedido(); // instancio o objeto pedido

		System.out.println("Digite o código do prato desejado: ");
		pratoDesejado = sc.nextInt();

		System.out.println("Prato selecionado: " + ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPrato());
		pedido.setPrato(ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPrato()); // adiciono o prato no obj
																							// Pedido
		Thread.sleep(pausa);
		System.out.println("Deseja algo para tomar?");
		System.out.println("1. Bebida");
		System.out.println("2. Carta de Vinhos");
		System.out.println("0. Não");
		int escolha = sc.nextInt();

		if (escolha == 1) {

			System.out.println("Lista de bebidas: ");

			for (int i = 0; i < ProcessaListas.getListaBebidas().size(); i++) {
				Thread.sleep(500);
				System.out.println("\nBebida: " + ProcessaListas.getListaBebidas().get(i).getBebida());
				System.out.println("Preço: " + ProcessaListas.getListaBebidas().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaBebidas().get(i).getCodigo());
			}

			System.out.println("Digite o código da bebida desejada");
			bebidaDesejada = sc.nextInt();
			System.out.println(
					"Bebida selecionada: " + ProcessaListas.getListaBebidas().get(bebidaDesejada - 1).getBebida());
			pedido.setBebida(ProcessaListas.getListaBebidas().get(bebidaDesejada - 1).getBebida());
			pedido.setVinho("Nenhum");

		} else if (escolha == 2) {

			System.out.println("Lista de vinhos: ");

			for (int i = 0; i < ProcessaListas.getListaVinhos().size(); i++) {
				Thread.sleep(500);
				System.out.println("\nVinho: " + ProcessaListas.getListaVinhos().get(i).getVinho());
				System.out.println("Preço: " + ProcessaListas.getListaVinhos().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaVinhos().get(i).getCodigo());
			}

			System.out.println("Digite o código do vinho desejado: ");

			vinhoDesejado = sc.nextInt();

			System.out
					.println("Vinho selecionado: " + ProcessaListas.getListaVinhos().get(vinhoDesejado - 1).getVinho());
			pedido.setVinho(ProcessaListas.getListaVinhos().get(vinhoDesejado - 1).getVinho());
			pedido.setBebida("Nenhum");

		} else {

			pedido.setBebida("Nenhum");
			pedido.setVinho("Nenhum");

		}

		if (bebidaDesejada != 0) {
			pedido.setTotalPedido(ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPreco()
					+ ProcessaListas.getListaBebidas().get(bebidaDesejada - 1).getPreco());
		} else if (vinhoDesejado != 0) {
			pedido.setTotalPedido(ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPreco()
					+ ProcessaListas.getListaVinhos().get(vinhoDesejado - 1).getPreco());
		} else {
			pedido.setTotalPedido(ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPreco());
		}

		System.out.println("Deseja deixar alguma observação sobre o pedido?");
		System.out.println("Caso não queira, digite NAO");
		sc.nextLine();
		observacao = sc.nextLine();
		pedido.setObservacao(observacao);

		ProcessaListas.getListaPedidos().add(pedido);

		System.out.println("\nSeu pedido foi: \n");
		System.out.println("Prato: " + ProcessaListas.getListaPedidos().get(mudarIndice).getPrato());
		System.out.println("Bebida: " + ProcessaListas.getListaPedidos().get(mudarIndice).getBebida());
		System.out.println("Vinho: " + ProcessaListas.getListaPedidos().get(mudarIndice).getVinho());
		System.out.println("Preço total: " + ProcessaListas.getListaPedidos().get(mudarIndice).getTotalPedido());
		System.out.println("Observação: " + ProcessaListas.getListaPedidos().get(mudarIndice).getObservacao());
		mudarIndice++;

		System.out.println("\nObrigado por usar nosso sistema!");
		Thread.sleep(2000);

	}

	public static void atualizarItem() throws IOException, InterruptedException {

		System.out.println("Deseja atualizar qual lista?");
		System.out.println("1. Prato");
		System.out.println("2. Bebida");
		System.out.println("3. Vinho");

		Scanner sc = new Scanner(System.in);
		int escolha = sc.nextInt();

		if (escolha == 1) {

			for (int i = 0; i < ProcessaListas.getListaPratos().size(); i++) {
				System.out.println("\nPrato: " + ProcessaListas.getListaPratos().get(i).getPrato());
				System.out.println("Preço: " + ProcessaListas.getListaPratos().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaPratos().get(i).getCodigo());
			}

			System.out.println("Digite o código do prato que deseja alterar");
			int pratoAlterar = sc.nextInt();
			System.out.println("Prato: " + ProcessaListas.getListaPratos().get(pratoAlterar - 1).getPrato());
			System.out.println("Preço: " + ProcessaListas.getListaPratos().get(pratoAlterar - 1).getPreco());
			System.out.println("Código: " + ProcessaListas.getListaPratos().get(pratoAlterar - 1).getCodigo());
			System.out.println("Digite o novo preço: ");
			double novoPreco = sc.nextDouble();
			ProcessaListas.getListaPratos().get(pratoAlterar - 1).setPreco(novoPreco);
			menuPrincipal();
		} else if (escolha == 2) {

			for (int i = 0; i < ProcessaListas.getListaBebidas().size(); i++) {
				System.out.println("\nPrato: " + ProcessaListas.getListaBebidas().get(i).getBebida());
				System.out.println("Preço: " + ProcessaListas.getListaBebidas().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaBebidas().get(i).getCodigo());
			}

			System.out.println("Digite o código da bebida que deseja alterar");
			int bebidaAlterar = sc.nextInt();
			System.out.println("\nBebida: " + ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).getBebida());
			System.out.println("Preço: " + ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).getPreco());
			System.out.println("Código: " + ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).getCodigo());
			System.out.println("Digite o novo preço: ");
			double novoPreco = sc.nextDouble();
			ProcessaListas.getListaBebidas().get(bebidaAlterar - 1).setPreco(novoPreco);

		}
	}

}
