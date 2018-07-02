package view;

import controller.ProductsList;
import framework_menu.AcaoGenerica;

public class AcaoListarProdutos extends AcaoGenerica {

	public AcaoListarProdutos(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tarefa() {
		ProductsList.showProducts();
	}
}
