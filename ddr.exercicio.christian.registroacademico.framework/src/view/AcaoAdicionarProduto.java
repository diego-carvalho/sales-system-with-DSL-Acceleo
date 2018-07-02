package view;

import java.util.Scanner;

import controller.ProductsList;
import framework_menu.AcaoGenerica;
import model.Produto;

public class AcaoAdicionarProduto extends AcaoGenerica {

	public AcaoAdicionarProduto(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void tarefa() {
		Produto p = new Produto();

		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.print("Codigo: ");
			p.setCodigo(sc.nextInt());
			sc.nextLine();

			System.out.print("Nome: ");
			p.setNome(sc.nextLine());

			System.out.print("Valor: ");
			p.setValor(sc.nextFloat());

			p.setPersistido(false);

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		// System.out.println(p);
		ProductsList.add_product(p);
		System.out.println("Produto cadastrado com sucesso.");
	}
}
