package view.produtoActions;

import java.util.Scanner;

import Controller.ProdutoController;
import Model.Produto;
import framework.Action;

public class IncluirProduto implements Action{
	
	ProdutoController produtoController = ProdutoController.getInstance();
	Scanner scan = new Scanner(System.in);

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Incluir um Produto";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		Produto produto = showAdiciona();
		produtoController.adicionarProduto(produto);
		return 0;
	}
	
	public Produto showAdiciona() {
		Produto produto = new Produto();
		System.out.println("Informe o nome:");
		produto.setNome(scan.nextLine());
		boolean verificaFormat = true;
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
