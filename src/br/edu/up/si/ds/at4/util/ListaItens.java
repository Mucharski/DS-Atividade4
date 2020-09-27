package br.edu.up.si.ds.at4.util;

public class ListaItens {
	public static void listaItens(int itemEscolhido) {

		if (itemEscolhido == 1) {

			for (int i = 0; i < ProcessaListas.getListaPratos().size(); i++) {
				System.out.println("\nPrato: " + ProcessaListas.getListaPratos().get(i).getPrato());
				System.out.println("Preço: " + ProcessaListas.getListaPratos().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaPratos().get(i).getCodigo());
			}

		} else if (itemEscolhido == 2) {

			for (int i = 0; i < ProcessaListas.getListaBebidas().size(); i++) {
				System.out.println("\nBebida: " + ProcessaListas.getListaBebidas().get(i).getBebida());
				System.out.println("Preço: " + ProcessaListas.getListaBebidas().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaBebidas().get(i).getCodigo());
			}

		} else if (itemEscolhido == 3) {

			for (int i = 0; i < ProcessaListas.getListaVinhos().size(); i++) {
				System.out.println("\nVinho: " + ProcessaListas.getListaVinhos().get(i).getVinho());
				System.out.println("Preço: " + ProcessaListas.getListaVinhos().get(i).getPreco());
				System.out.println("Código: " + ProcessaListas.getListaVinhos().get(i).getCodigo());
			}

		}

	}

	public static void pratoBebidaVinho() {
		
		System.out.println("1. Prato");
		System.out.println("2. Bebida");
		System.out.println("3. Vinho");
		
	}
}
