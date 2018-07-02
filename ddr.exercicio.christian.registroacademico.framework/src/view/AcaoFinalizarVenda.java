package view;

import java.util.Date;
import java.util.Scanner;

import controller.ClientsList;
import controller.ItemVendaList;
import controller.VendaList;
import framework_menu.AcaoGenerica;
import model.Cliente;
import model.Venda;

public class AcaoFinalizarVenda extends AcaoGenerica {

	public AcaoFinalizarVenda(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tarefa() {
		Cliente c;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o rg do cliente: ");
		c = ClientsList.getClient(sc.next());

		Venda v = new Venda();
		v.setPersistido(false);
		v.setCliente(c);
		v.setItens(ItemVendaList.getItensVenda());
		v.setData(new Date());

		VendaList.addVenda(v);

		System.out.println("Venda realizada com sucesso.");
		System.out.println(v);

		ItemVendaList.clearItensVenda();
	}
}
