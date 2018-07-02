package view;

import controller.ItemVendaList;
import framework_menu.AcaoGenerica;

public class AcaoListarItensVenda extends AcaoGenerica {

	public AcaoListarItensVenda(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}
	
	public void tarefa() {
		ItemVendaList.showItemVenda();
	}
}
