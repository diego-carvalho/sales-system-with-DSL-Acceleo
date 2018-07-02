package view.vendaActions;

import java.util.Scanner;

import Controller.VendaController;
import framework.Action;

public class RemoverVenda implements Action{
	
	VendaController vendaController = VendaController.getInstance();
	Scanner scan = new Scanner(System.in);
	Integer pos = -1;
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Remover uma Venda";
	}
	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		showRemove();
		if (pos != -1) {
			vendaController.removeVenda(pos);
			pos = -1;
		}
		return 0;
	}
	
	public void showRemove() {
		Integer codigo = null;
		boolean verificaFormat = true;
		while(verificaFormat) {
			try {
				System.out.println("Digite o numero da venda que deseja remover:");
				codigo = (Integer.parseInt(scan.nextLine()));
				verificaFormat = false;
			} catch (Exception e) {
				System.out.println("Numero de venda permite apenas numeros, tente novamente.");
				verificaFormat = true;
			}
		}
		pos = vendaController.findByNumero(codigo);
		if (pos == -1) {
			System.out.println("Venda não encontrada, por favor tente novamente.");
		}
	}

}
