package br.edu.up.si.ds.at4.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.edu.up.si.ds.at4.objs.Bebida;
import br.edu.up.si.ds.at4.objs.Prato;
import br.edu.up.si.ds.at4.objs.Vinho;

public class Impressora {

	public static void imprimir() throws IOException {
		FileWriter arquivoSaida = new FileWriter(
				"C:\\Users\\igorm\\Documents\\FACULDADE\\2semestre\\Desenvolvimento de Software l\\Atividade4\\relatorio-pedidos.txt");
		PrintWriter gravador = new PrintWriter(arquivoSaida);

		for (int i = 0; i < ProcessaListas.getListaPedidos().size(); i++) {

			gravador.println("\nPrato: " + ProcessaListas.getListaPedidos().get(i).getPrato());
			gravador.println("Bebida: " + ProcessaListas.getListaPedidos().get(i).getBebida());
			gravador.println("Vinho: " + ProcessaListas.getListaPedidos().get(i).getVinho());
			gravador.println("Total do pedido: " + ProcessaListas.getListaPedidos().get(i).getTotalPedido());
			gravador.println("Observação: " + ProcessaListas.getListaPedidos().get(i).getObservacao());

		}

		gravador.close();
		arquivoSaida.close();

	}

	public static void imprimirNovasListas() throws IOException {

		int i = 0;

		FileWriter arquivoSaidaPratos = new FileWriter(
				"C:\\Users\\igorm\\Documents\\FACULDADE\\2semestre\\Desenvolvimento de Software l\\Atividade4\\pratos.csv");
		FileWriter arquivoSaidaBebidas = new FileWriter(
				"C:\\Users\\igorm\\Documents\\FACULDADE\\2semestre\\Desenvolvimento de Software l\\Atividade4\\bebidas-tabuladas.txt");
		FileWriter arquivoSaidaVinhos = new FileWriter(
				"C:\\Users\\igorm\\Documents\\FACULDADE\\2semestre\\Desenvolvimento de Software l\\Atividade4\\vinhos-tabulados.txt");

		PrintWriter gravadorPratos = new PrintWriter(arquivoSaidaPratos);
		PrintWriter gravadorBebidas = new PrintWriter(arquivoSaidaBebidas);
		PrintWriter gravadorVinhos = new PrintWriter(arquivoSaidaVinhos);

		gravadorPratos.println("Prato;Preco");
		gravadorBebidas.println("PRECO\tBEBIDA");
		gravadorVinhos.println("PRECO\tVINHO");

		for (Prato prato : ProcessaListas.getListaPratos()) {

			gravadorPratos.println(ProcessaListas.getListaPratos().get(i).getPrato() + ";"
					+ ProcessaListas.getListaPratos().get(i).getPreco());
			i++;
		}

		System.out.println("Pratos gravados!");
		i = 0;

		for (Bebida bebida : ProcessaListas.getListaBebidas()) {

			gravadorBebidas.println(ProcessaListas.getListaBebidas().get(i).getPreco() + "\t"
					+ ProcessaListas.getListaBebidas().get(i).getBebida());
			i++;
		}

		System.out.println("Bebidas gravadas!");
		i = 0;

		for (Vinho vinho : ProcessaListas.getListaVinhos()) {

			gravadorVinhos.println(ProcessaListas.getListaVinhos().get(i).getPreco() + "\t"
					+ ProcessaListas.getListaVinhos().get(i).getVinho());
			i++;
		}
		System.out.println("Vinhos gravados!");

		gravadorPratos.close();
		gravadorBebidas.close();
		gravadorVinhos.close();
		arquivoSaidaPratos.close();
		arquivoSaidaBebidas.close();
		arquivoSaidaVinhos.close();

	}

}
