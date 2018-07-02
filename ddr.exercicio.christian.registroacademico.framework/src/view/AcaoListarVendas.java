package view;

import controller.VendaList;
import framework_menu.AcaoGenerica;

public class AcaoListarVendas extends AcaoGenerica {

	public AcaoListarVendas(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void tarefa() {
		VendaList.showVendas();
	}
}
