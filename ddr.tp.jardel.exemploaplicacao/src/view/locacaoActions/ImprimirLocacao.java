package view.locacaoActions;

import Controller.LocacaoController;
import framework.Action;

public class ImprimirLocacao implements Action {
	
	LocacaoController locacaoController = LocacaoController.getInstance();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Imprimir locacoes";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		locacaoController.imprimirLocacao();
		return 0;
	}

}
