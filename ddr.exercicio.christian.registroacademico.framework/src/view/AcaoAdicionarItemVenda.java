package view;

import java.util.Scanner;

import controller.ItemVendaList;
import framework_menu.AcaoGenerica;

public class AcaoAdicionarItemVenda extends AcaoGenerica {

	public AcaoAdicionarItemVenda(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tarefa() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o codigo do produto: ");
		int prod_code = sc.nextInt();
		
		System.out.print("Informe a quantidade do produto desejada: ");
		int qtd = sc.nextInt();
		
		ItemVendaList.addItemVenda(prod_code, qtd);
	}
}
