package view;

import controller.ClientsList;
import framework_menu.AcaoGenerica;

public class AcaoListarClientes extends AcaoGenerica {

	public AcaoListarClientes(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void tarefa() {
		ClientsList.showClients();
	}
}
