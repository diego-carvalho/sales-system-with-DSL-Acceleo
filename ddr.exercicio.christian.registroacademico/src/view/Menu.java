package view;

import java.util.Scanner;

import controller.ClientsList;
import controller.ItemVendaList;
import controller.ProductsList;
import controller.VendaList;

public class Menu {
	public static void main(String[] args) {
		int principal_option = 0;
		do {
			principal_option = MenuOptions.menu_principal();

			switch (principal_option) {
			// Client Menu
			case 1:
				int client_option = 0;
				do {
					client_option = MenuOptions.menu_client_option();

					switch (client_option) {
					// Listar clientes
					case 1:
						ClientsList.showClients();
						break;

					// Adicionar cliente
					case 2:
						MenuOptions.add_client();
						break;

					// Remover cliente
					case 3:
						Scanner sc = new Scanner(System.in);
						System.out.print("Informe o RG do cliente que deseja remover: ");
						ClientsList.removeClient(sc.next());
						break;

					// Voltar ao menu principal
					case 0:
						System.out.println("Saindo do menu de clientes...");
						break;

					default:
						break;
					}
				} while (client_option != 0);
				break;
				
			// Product Menu
			case 2:
				int product_option = 0;
				do {
					product_option = MenuOptions.menu_product_options();

					switch (product_option) {
					// Listar produtos
					case 1:
						ProductsList.showProducts();
						break;

					// Adicionar produto
					case 2:
						MenuOptions.add_product();
						break;

					// Remover produto
					case 3:
						Scanner sc = new Scanner(System.in);
						System.out.print("Informe o codigo do produto que deseja remover: ");
						ProductsList.remove_product(sc.nextInt());
						break;

					// Voltar ao menu principal
					case 0:
						System.out.println("Saindo do menu de clientes...");
						break;

					default:
						break;
					}
				} while (product_option != 0);
				break;

			// Realizar Venda
			case 3:
				Scanner sc = new Scanner(System.in);
				
				int sale_option = 0;
				int prod_code;
				int qtd;
				do {
					sale_option = MenuOptions.menu_sale();
					
					switch (sale_option) {
					// Listar itens
					case 1:
						ItemVendaList.showItemVenda();
						break;
					
					// Adicionar item na venda
					case 2:
						System.out.print("Informe o codigo do produto: ");
						prod_code = sc.nextInt();
						System.out.print("Informe a quantidade do produto desejada: ");
						qtd = sc.nextInt();
						ItemVendaList.addItemVenda(prod_code, qtd);
						break;
					
					// Remover item da venda
					case 3:
						System.out.print("Informe o codigo do produto que deseja remover da venda: ");
						prod_code = sc.nextInt();
						ItemVendaList.removeItemVenda(prod_code);
						break;
					
					// Finalizar venda
					case 4:
						MenuOptions.finalizar_venda();
						break;
					
					// Voltar ao menu principal
					case 0:
						System.out.println("Saindo do menu de vendas...");
						break;
						
					default:
						break;
					}
				} while (sale_option != 0);
				break;
			
			// Listar vendas realizadas
			case 4:
				VendaList.showVendas();
				break;
			// Carregar Arquivo
			// Le todos os arquivos necessarios.
			case 5:
				MenuOptions.loadListsFromFile();
				break;

			case 6:
				// Salvar Arquivo
				// Quando um arquivo eh salvo os valores de persistido sao setados para true e todas
				// as listas sao esvaziadas com o metodo clear.
				MenuOptions.saveListsToFile();
				break;

			// Sair do programa
			case 0:
				System.out.println("Saindo do sistema...");
				break;

			default:
				break;
			}
		} while (principal_option != 0);

	}
}
