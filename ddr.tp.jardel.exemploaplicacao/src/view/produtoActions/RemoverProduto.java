package view.produtoActions;

import java.util.Scanner;

import Controller.ProdutoController;
import framework.Action;

public class RemoverProduto implements Action{
	
	ProdutoController produtoController = ProdutoController.getInstance();
	Scanner scan = new Scanner(System.in);
	Integer pos = -1;

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Remover um Produto";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		showRemove();
		if (pos != -1) {
			produtoController.removeProduto(pos);
			pos = -1;
		}
		return 0;
	}
	
	public void showRemove() {
		Integer codigo = null;
		boolean verificaFormat = true;
		while(verificaFormat) {
			try {
				System.out.println("Digite o codigo do produto que deseja remover:");
				codigo = (Integer.parseInt(scan.nextLine()));
				verificaFormat = false;
			} catch (Exception e) {
				System.out.println("Codigo do produto são apenas numeros, tente novamente.");
				verificaFormat = true;
			}
		}
		pos = produtoController.findByCodigo(codigo);
		if (pos == -1) {
			System.out.println("Produto não encontrado, por favor tente novamente.");
		}
	}

}
