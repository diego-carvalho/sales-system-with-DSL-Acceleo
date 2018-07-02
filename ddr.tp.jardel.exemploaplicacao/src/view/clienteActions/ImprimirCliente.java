package view.clienteActions;

import Controller.ClienteController;
import framework.Action;

public class ImprimirCliente implements Action{
	
	ClienteController clienteController = ClienteController.getInstance();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Imprimir clientes";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		clienteController.imprimirCliente();
		return 0;
	}

}
