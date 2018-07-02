package view;

import framework.Action;
import framework.Menu;
import view.locacaoActions.ImprimirLocacao;
import view.locacaoActions.IncluirLocacao;
import view.locacaoActions.RemoverLocacao;
import view.locacaoActions.DevolverLocacao;

public class LocacaoView implements Action{
	
	Menu locacaoMenu = new Menu("Menu Locação");
	Action imprimirLocacao = new ImprimirLocacao();
	Action incluirLocacao = new IncluirLocacao();
	Action removerLocacao = new RemoverLocacao();
        Action devolverLocacao = new DevolverLocacao();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Menu Locação";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		locacaoMenu.addAction(imprimirLocacao);
		locacaoMenu.addAction(incluirLocacao);
		locacaoMenu.addAction(removerLocacao);
		locacaoMenu.addAction(devolverLocacao);
		locacaoMenu.runAction();
		return 0;
	}
}
