package view.vendaActions;

import Controller.VendaController;
import framework.Action;

public class ImprimirVenda implements Action {
	
	VendaController vendaController = VendaController.getInstance();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Imprimir Vendas";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		vendaController.imprimirVenda();
		return 0;
	}

}
