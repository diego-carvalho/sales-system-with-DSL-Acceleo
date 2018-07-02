package view.clienteActions;

import java.util.Scanner;

import Controller.ClienteController;
import framework.Action;

public class RemoverCliente implements Action{

	Scanner scan = new Scanner(System.in);
	ClienteController clienteController = ClienteController.getInstance();
	Integer pos = -1;
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Remover um cliente";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		showRemove();
		if (pos != -1) {
			clienteController.removeCliente(pos);
			pos = -1;
		}
		return 0;
	}
	
	public void showRemove() {
		System.out.println("Digite o rg do cliente que deseja excluir:");
		String rg = (scan.nextLine());
		pos = clienteController.findByRg(rg);
		if (pos == -1) {
			System.out.println("Cliente não encontrado, por favor tente novamente.");
		}
	}

}
