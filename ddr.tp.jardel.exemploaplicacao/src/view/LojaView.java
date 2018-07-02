package view;

import framework.Action;
import framework.Menu;
import view.lojaActions.SalvarDados;

public class LojaView {
	
	Menu lojaMenu;
	Action clienteAction = new ClienteView();
	Action produtoAction = new ProdutoView();
	Action vendaAction = new VendaView();
    Action locacaoAction = new LocacaoView();
	Action salvaAction = new SalvarDados();
	
	public void show() {
		lojaMenu = new Menu("Menu Principal");
		
		lojaMenu.addAction(clienteAction);
		lojaMenu.addAction(produtoAction);
		lojaMenu.addAction(vendaAction);
        lojaMenu.addAction(locacaoAction);
		lojaMenu.addAction(salvaAction);
		lojaMenu.runAction();
		
	}

}
