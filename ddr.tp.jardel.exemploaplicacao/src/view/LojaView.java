package view;

import framework.Action;
import framework.Menu;
import view.lojaActions.SalvarDados;

public class LojaView {
	
	Menu lojaMenu = new Menu("Menu Principal");
	Action clienteAction = new ClienteView();
	Action produtoAction = new ProdutoView();
	Action vendaAction = new VendaView();
        Action locacaoAction = new LocacaoView();
	Action salvaAction = new SalvarDados();
	
	public void show() {
		
		lojaMenu.addAction(clienteAction);
		lojaMenu.addAction(produtoAction);
		lojaMenu.addAction(vendaAction);
                lojaMenu.addAction(locacaoAction);
		lojaMenu.addAction(salvaAction);
		lojaMenu.runAction();
		
	}

}
