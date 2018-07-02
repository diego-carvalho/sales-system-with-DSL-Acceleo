package view.produtoActions;

import Controller.ProdutoController;
import framework.Action;

public class ImprimirProduto implements Action{
	
	ProdutoController produtoController = ProdutoController.getInstance();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Imprimir Produto";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		produtoController.imprimirProduto();
		return 0;
	}

}
