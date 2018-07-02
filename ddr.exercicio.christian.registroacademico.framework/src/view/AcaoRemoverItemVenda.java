package view;

import java.util.Scanner;

import controller.ItemVendaList;
import framework_menu.AcaoGenerica;

public class AcaoRemoverItemVenda extends AcaoGenerica {

	public AcaoRemoverItemVenda(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tarefa() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o codigo do produto que deseja remover da venda: ");
		int prod_code = sc.nextInt();
		
		ItemVendaList.removeItemVenda(prod_code);
	}
}
