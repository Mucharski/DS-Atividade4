package br.edu.up.si.ds.at4.util;

import java.util.*;

import br.edu.up.si.ds.at4.objs.Bebida;
import br.edu.up.si.ds.at4.objs.Pedido;
import br.edu.up.si.ds.at4.objs.Prato;
import br.edu.up.si.ds.at4.objs.Vinho;

import java.io.*;

public class ProcessaListas {

	private static List<Prato> listaPratos = new ArrayList<>(); // cria a lista como um objeto

	public static List<Prato> getListaPratos() {
		return listaPratos; // pega a lista para adicionar ou listar dados
	}

	public static List<Prato> lerArquivoPrato(String nomeArquivo) throws FileNotFoundException {

		File arquivo = new File(nomeArquivo);
		Scanner leitorPratos = new Scanner(arquivo);
		String linhaPratos = leitorPratos.nextLine();
		int codigoPrato = 1;

		while (leitorPratos.hasNext()) {
			linhaPratos = leitorPratos.nextLine();
			String[] partesPrato = linhaPratos.split(";");

			Prato prato = new Prato();
			prato.setPrato(partesPrato[0]);
			prato.setPreco(Double.parseDouble(partesPrato[1]));
			prato.setCodigo(codigoPrato);

			listaPratos.add(prato);

			codigoPrato++;

		}

		leitorPratos.close();
		return listaPratos;

	}

	private static List<Bebida> listaBebidas = new ArrayList<>();

	public static List<Bebida> getListaBebidas() {
		return listaBebidas;
	}

	public static List<Bebida> lerArquivoBebida(String nomeArquivo) throws FileNotFoundException {

		File arquivo = new File(nomeArquivo);
		Scanner leitorBebidas = new Scanner(new FileInputStream(arquivo));
		String linhaBebidas = leitorBebidas.nextLine();
		int codigoBebida = 1;

		while (leitorBebidas.hasNext()) {
			linhaBebidas = leitorBebidas.nextLine();
			String[] partesBebida = linhaBebidas.split("\t");

			Bebida bebida = new Bebida();
			bebida.setPreco(Double.parseDouble(partesBebida[0].replaceAll(",", ".")));
			bebida.setBebida(partesBebida[1]);
			bebida.setCodigo(codigoBebida);

			listaBebidas.add(bebida);

			codigoBebida++;

		}

		leitorBebidas.close();
		return listaBebidas;

	}

	private static List<Vinho> listaVinhos = new ArrayList<>();

	public static List<Vinho> getListaVinhos() {
		return listaVinhos;
	}

	public static List<Vinho> lerArquivoVinhos(String nomeArquivo) throws FileNotFoundException {

		File arquivo = new File(nomeArquivo);
		Scanner leitorVinhos = new Scanner(new FileInputStream(arquivo));
		String linhaVinhos = leitorVinhos.nextLine();
		int codigoVinhos = 1;

		while (leitorVinhos.hasNext()) {
			linhaVinhos = leitorVinhos.nextLine();
			String[] partesVinho = linhaVinhos.split("\t");

			Vinho vinho = new Vinho();
			vinho.setPreco(Double.parseDouble(partesVinho[0].replaceAll(",", ".")));
			vinho.setVinho(partesVinho[1]);
			vinho.setCodigo(codigoVinhos);

			listaVinhos.add(vinho);

			codigoVinhos++;

		}

		leitorVinhos.close();
		return listaVinhos;
	}

	private static List<Pedido> listaPedidos = new ArrayList<>();

	public static List<Pedido> getListaPedidos() {
		return listaPedidos;

	}

}
