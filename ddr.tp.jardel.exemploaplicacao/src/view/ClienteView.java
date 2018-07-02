package view;

import framework.Action;
import framework.Menu;
import view.clienteActions.AlterarCliente;
import view.clienteActions.ImprimirCliente;
import view.clienteActions.IncluirCliente;
import view.clienteActions.RemoverCliente;

public class ClienteView implements Action {
	
	Menu clienteMenu = new Menu("Menu Cliente");
	Action imprimirCliente = new ImprimirCliente();
	Action incluirCliente = new IncluirCliente();
	Action alterarCliente = new AlterarCliente();
	Action removerCliente = new RemoverCliente();
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Menu Cliente";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		clienteMenu.addAction(imprimirCliente);
		clienteMenu.addAction(incluirCliente);
		clienteMenu.addAction(alterarCliente);
		clienteMenu.addAction(removerCliente);
		
		clienteMenu.runAction();
		return 0;
	}
}
