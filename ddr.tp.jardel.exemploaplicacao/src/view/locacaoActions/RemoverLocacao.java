package view.locacaoActions;

import java.util.Scanner;

import Controller.LocacaoController;
import framework.Action;

public class RemoverLocacao implements Action{
	
	LocacaoController locacaoController = LocacaoController.getInstance();
	Scanner scan = new Scanner(System.in);
	Integer pos = -1;
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Remover uma locacao";
	}
	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		showRemove();
		if (pos != -1) {
			locacaoController.removeLocacao(pos);
			pos = -1;
		}
		return 0;
	}
	
	public void showRemove() {
		Integer codigo = null;
		boolean verificaFormat = true;
		while(verificaFormat) {
			try {
				System.out.println("Digite o numero da locacao que deseja remover:");
				codigo = (Integer.parseInt(scan.nextLine()));
				verificaFormat = false;
			} catch (Exception e) {
				System.out.println("Numero de locacao permite apenas numeros, tente novamente.");
				verificaFormat = true;
			}
		}
		pos = locacaoController.findByNumero(codigo);
		if (pos == -1) {
			System.out.println("Locacao não encontrada, por favor tente novamente.");
		}
	}

}
