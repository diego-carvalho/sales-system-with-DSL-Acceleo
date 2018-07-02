package view;

import framework.Action;
import framework.Menu;
import view.produtoActions.AlterarProduto;
import view.produtoActions.ImprimirProduto;
import view.produtoActions.IncluirProduto;
import view.produtoActions.RemoverProduto;

public class ProdutoView implements Action{
	
	Menu produtoMenu = new Menu("Menu Produto");
	Action imprimirProduto = new ImprimirProduto();
	Action incluirProduto = new IncluirProduto();
	Action alterarProduto = new AlterarProduto();
	Action removerProduto = new RemoverProduto();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Menu Produto";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		produtoMenu.addAction(imprimirProduto);
		produtoMenu.addAction(incluirProduto);
		produtoMenu.addAction(alterarProduto);
		produtoMenu.addAction(removerProduto);
		
		produtoMenu.runAction();
		return 0;
	}
}
