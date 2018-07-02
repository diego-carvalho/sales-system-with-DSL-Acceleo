package view;

import controller.ClientsList;
import controller.ProductsList;
import controller.VendaList;
import framework_menu.AcaoGenerica;
import model.Arquivo;

public class AcaoSalvarArquivo extends AcaoGenerica {

	public AcaoSalvarArquivo(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tarefa() {
		Arquivo.saveEntityALToFile("Clientes", ClientsList.getClients(), "clients.tmp");
		ClientsList.clearClientes();

		Arquivo.saveEntityALToFile("Produtos", ProductsList.getProducts(), "products.tmp");
		ProductsList.clearProdutos();

		Arquivo.saveEntityALToFile("Vendas", VendaList.getVendas(), "vendas.tmp");
		VendaList.clearVendas();
	}
}
