package view;

import java.util.Scanner;

import controller.ClientsList;
import framework_menu.AcaoGenerica;

public class AcaoRemoverCliente extends AcaoGenerica {

	public AcaoRemoverCliente(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tarefa() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o RG do cliente que deseja remover: ");
		ClientsList.removeClient(sc.next());
	}

}
