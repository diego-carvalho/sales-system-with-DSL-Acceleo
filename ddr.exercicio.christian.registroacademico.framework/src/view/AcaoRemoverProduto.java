package view;

import java.util.Scanner;

import controller.ProductsList;
import framework_menu.AcaoGenerica;

public class AcaoRemoverProduto extends AcaoGenerica {

	public AcaoRemoverProduto(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tarefa() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o codigo do produto que deseja remover: ");
		ProductsList.remove_product(sc.nextInt());
	}
}
