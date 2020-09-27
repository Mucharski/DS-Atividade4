package br.edu.up.si.ds.at4.controller;

import java.io.IOException;
import java.util.*;

import br.edu.up.si.ds.at4.objs.Pedido;
import br.edu.up.si.ds.at4.util.ListaItens;
import br.edu.up.si.ds.at4.util.ProcessaListas;

public class MenuEPedido {

	static int codigoPrato = 19, codigoBebida = 11, codigoVinho = 14, mudarIndice = 0;;

	public static void menuPrincipal() throws IOException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		int escolha = 0;

		System.out.println("\nDigite o número da operação que deseja realizar");
		System.out.println("1. Incluir");
		System.out.println("2. Listar");
		System.out.println("3. Atualizar");
		System.out.println("4. Excluir");
		System.out.println("5. Fazer pedido");
		System.out.println("0. Sair");

		escolha = sc.nextInt();

		// executa a função correspondente a escolha
		switch (escolha) {

		case 1:

			InclusãoEExclusão.criarNovoObjeto();
			menuPrincipal();
			break;

		case 2:

			ListagemEAtualizacao.listarCardapio();
			menuPrincipal();
			break;

		case 3:

			ListagemEAtualizacao.atualizarItem();
			break;

		case 4:

			InclusãoEExclusão.excluirItem();
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

	public static void fazerPedido() throws InterruptedException, IOException {

		Scanner sc = new Scanner(System.in);
		int pratoDesejado, bebidaDesejada = 0, vinhoDesejado = 0, pausa = 500;
		String observacao;

		System.out.println("Lista de pratos: ");

		ListaItens.listaItens(1);

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

		// se a escolha for bebida
		if (escolha == 1) {

			System.out.println("Lista de bebidas: ");

			ListaItens.listaItens(escolha + 1);

			System.out.println("Digite o código da bebida desejada");
			bebidaDesejada = sc.nextInt();
			System.out.println(
					"Bebida selecionada: " + ProcessaListas.getListaBebidas().get(bebidaDesejada - 1).getBebida());
			pedido.setBebida(ProcessaListas.getListaBebidas().get(bebidaDesejada - 1).getBebida());
			pedido.setVinho("Nenhum");

		
		} else if (escolha == 2) { // se a escolha for vinho

			System.out.println("Lista de vinhos: ");

			ListaItens.listaItens(escolha + 1);

			System.out.println("Digite o código do vinho desejado: ");

			vinhoDesejado = sc.nextInt();

			System.out
					.println("Vinho selecionado: " + ProcessaListas.getListaVinhos().get(vinhoDesejado - 1).getVinho());
			pedido.setVinho(ProcessaListas.getListaVinhos().get(vinhoDesejado - 1).getVinho());
			pedido.setBebida("Nenhum");

		} else { // se não for nenhuma escolha

			pedido.setBebida("Nenhum");
			pedido.setVinho("Nenhum");

		}

		if (bebidaDesejada != 0) { //se foi escolhido bebida
			pedido.setTotalPedido(ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPreco()
					+ ProcessaListas.getListaBebidas().get(bebidaDesejada - 1).getPreco());
		} else if (vinhoDesejado != 0) { // se foi escolhido vinho
			pedido.setTotalPedido(ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPreco()
					+ ProcessaListas.getListaVinhos().get(vinhoDesejado - 1).getPreco());
		} else { // se não foi escolhido nada
			pedido.setTotalPedido(ProcessaListas.getListaPratos().get(pratoDesejado - 1).getPreco());
		}

		System.out.println("Deseja deixar alguma observação sobre o pedido?");
		System.out.println("Caso não queira, digite NÃO");
		sc.nextLine();
		observacao = sc.nextLine();
		pedido.setObservacao(observacao);

		ProcessaListas.getListaPedidos().add(pedido); // pedido adicionado na Lista

		//printa o pedido no console
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

}
