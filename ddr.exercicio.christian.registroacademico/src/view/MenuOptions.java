package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ClientsList;
import controller.ItemVendaList;
import controller.ProductsList;
import controller.VendaList;
import model.Arquivo;
import model.Cliente;
import model.Produto;
import model.Venda;

public abstract class MenuOptions {
	public static void add_client() {
		Cliente c = new Cliente();

		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Nome: ");
			c.setNome(sc.nextLine());

			System.out.print("Endereco: ");
			c.setEndereco(sc.nextLine());

			System.out.print("RG: ");
			c.setRg(sc.nextLine());

			System.out.print("Data de nascimento (dd-MM-yyyy): ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			String dateInString = sc.nextLine();
			try {
				Date date = formatter.parse(dateInString);
				c.setData_nascimento(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			c.setPersistido(false);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		// System.out.println(c);
		ClientsList.addClient(c);
		System.out.println("Cliente cadastrado com sucesso.");
	}

	public static void add_product() {
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

	public static void finalizar_venda() {
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

	public static int menu_client_option() {
		int option = 0;
		System.out.println("\n=========================================");
		System.out.println("|     1 - Listar clientes;\t\t|");
		System.out.println("|     2 - Adicionar cliente;\t\t|");
		System.out.println("|     3 - Remover cliente;\t\t|");
		System.out.println("|     0 - Voltar;\t\t\t|");
		System.out.println("=========================================\n");

		try {
			System.out.print("Digite a opcao desejada: ");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Opcao invalida!");
		}

		return option;
	}

	public static int menu_principal() {
		int option = 0;
		System.out.println("\n=========================================");
		System.out.println("|     1 - Menu clientes;\t\t|");
		System.out.println("|     2 - Menu produtos;\t\t|");
		System.out.println("|     3 - Realizar venda;\t\t|");
		System.out.println("|     4 - Listar vendas realizadas;\t|");
		System.out.println("|     5 - Carregar arquivo;\t\t|");
		System.out.println("|     6 - Salvar arquivo;\t\t|");
		System.out.println("|     0 - Sair.\t\t\t\t|");
		System.out.println("=========================================\n");

		try {
			System.out.print("Digite a opcao desejada: ");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Opcao invalida!");
		}

		return option;
	}

	public static int menu_product_options() {
		int option = 0;
		System.out.println("\n=========================================");
		System.out.println("|     1 - Listar produtos;\t\t|");
		System.out.println("|     2 - Adicionar produto;\t\t|");
		System.out.println("|     3 - Remover produto;\t\t|");
		System.out.println("|     0 - Voltar;\t\t\t|");
		System.out.println("=========================================\n");

		try {
			System.out.print("Digite a opcao desejada: ");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Opcao invalida!");
		}

		return option;
	}

	public static int menu_sale() {
		int option = 0;
		System.out.println("\n=========================================");
		System.out.println("|     1 - Listar itens da venda;\t|");
		System.out.println("|     2 - Adicionar item na venda;\t|");
		System.out.println("|     3 - Remover item da venda;\t|");
		System.out.println("|     4 - Finalizar venda;\t\t|");
		System.out.println("|     0 - Voltar;\t\t\t|");
		System.out.println("=========================================\n");

		try {
			System.out.print("Digite a opcao desejada: ");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Opcao invalida!");
		}

		return option;
	}

	// Funcao que salva cada lista em um arquivo e limpa as mesmas
	public static void saveListsToFile() {
		Arquivo.saveEntityALToFile(ClientsList.getClients(), "clients.tmp");
		ClientsList.clearClientes();

		Arquivo.saveEntityALToFile(ProductsList.getProducts(), "products.tmp");
		ProductsList.clearProdutos();

		Arquivo.saveEntityALToFile(VendaList.getVendas(), "vendas.tmp");
		VendaList.clearVendas();
	}

	// Funcao que le cada lista de seu especifico arquivo salvo
	@SuppressWarnings("unchecked")
	public static void loadListsFromFile() {
		ClientsList.setClients((ArrayList<Cliente>) Arquivo.getEntityALFromFile("clients.tmp"));

		ProductsList.setProducts((ArrayList<Produto>) Arquivo.getEntityALFromFile("products.tmp"));

		VendaList.setVendas((ArrayList<Venda>) Arquivo.getEntityALFromFile("vendas.tmp"));
	}
}
