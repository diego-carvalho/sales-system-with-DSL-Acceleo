package view.produtoActions;

import java.util.Scanner;

import Controller.ProdutoController;
import Model.Produto;
import framework.Action;

public class AlterarProduto implements Action{
	
	ProdutoController produtoController = ProdutoController.getInstance();
	Scanner scan = new Scanner(System.in);
	Integer pos = -1;

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Alterar um Produto";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		Produto produto = showEdita();
		if (produto != null && pos != -1) {
			produtoController.editarProduto(pos, produto);
			pos = -1;
		}
		return 0;
	}
	
	public Produto showEdita() {
		Produto produto = new Produto();
		boolean verificaFormat = true;
		Integer codigo = null;
		while(verificaFormat) {
			try {
				System.out.println("Digite o codigo do produto que deseja editar:");
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
			return null;
		}
		System.out.println("Informe o nome:");
		produto.setNome(scan.nextLine());
		verificaFormat = true;
		while(verificaFormat) {
			try {
				System.out.println("Informe o valor: 10.50");
				produto.setValor(Float.parseFloat(scan.nextLine()));
				verificaFormat = false;
			} catch (Exception e) {
				System.out.println("Erro ao inserir o formato do valor, tente novamente.");
				verificaFormat = true;
			}
		}
		return produto;
	}

}
