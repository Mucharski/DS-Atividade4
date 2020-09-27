import java.io.IOException;

import br.edu.up.si.ds.at4.controller.MenuEPedido;
import br.edu.up.si.ds.at4.util.*;

public class ProgramaAT4 {

	public static void main(String[] args) throws IOException, InterruptedException {

		ProcessaListas.lerArquivoPrato(
				"C:\\Users\\igorm\\Documents\\FACULDADE\\2semestre\\Desenvolvimento de Software l\\Atividade4\\pratos.csv");

		ProcessaListas.lerArquivoBebida(
				"C:\\Users\\igorm\\Documents\\FACULDADE\\2semestre\\Desenvolvimento de Software l\\Atividade4\\bebidas-tabuladas.txt");

		ProcessaListas.lerArquivoVinhos(
				"C:\\Users\\igorm\\Documents\\FACULDADE\\2semestre\\Desenvolvimento de Software l\\Atividade4\\vinhos-tabulados.txt");

		System.out.println("=====BEM-VINDO AO RESTAURANTE POSITIVO=====");
		MenuEPedido.menuPrincipal();

		Impressora.imprimir();
		Impressora.imprimirNovasListas();

	}
}
