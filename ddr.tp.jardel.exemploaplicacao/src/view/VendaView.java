package view;

import framework.Action;
import framework.Menu;
import view.vendaActions.ImprimirVenda;
import view.vendaActions.IncluirVenda;
import view.vendaActions.RemoverVenda;

public class VendaView implements Action{
	
	Menu vendaMenu = new Menu("Menu Cliente");
	Action imprimirVenda = new ImprimirVenda();
	Action incluirVenda = new IncluirVenda();
	Action removerVenda = new RemoverVenda();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Menu Venda";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		vendaMenu.addAction(imprimirVenda);
		vendaMenu.addAction(incluirVenda);
		vendaMenu.addAction(removerVenda);
		
		vendaMenu.runAction();
		return 0;
	}
}
