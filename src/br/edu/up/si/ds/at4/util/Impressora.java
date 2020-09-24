package br.edu.up.si.ds.at4.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

}
