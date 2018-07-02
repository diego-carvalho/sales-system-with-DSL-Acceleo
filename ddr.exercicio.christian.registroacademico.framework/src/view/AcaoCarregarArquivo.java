package view;

import java.util.ArrayList;

import controller.ClientsList;
import controller.ProductsList;
import controller.VendaList;
import framework_menu.AcaoGenerica;
import model.Arquivo;
import model.Cliente;
import model.Produto;
import model.Venda;

public class AcaoCarregarArquivo extends AcaoGenerica {

	public AcaoCarregarArquivo(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public void tarefa() {
		ClientsList.setClients((ArrayList<Cliente>) Arquivo.getEntityALFromFile("Clientes", "clients.tmp"));

		ProductsList.setProducts((ArrayList<Produto>) Arquivo.getEntityALFromFile("Produtos", "products.tmp"));

		VendaList.setVendas((ArrayList<Venda>) Arquivo.getEntityALFromFile("Vendas", "vendas.tmp"));
	}
}
