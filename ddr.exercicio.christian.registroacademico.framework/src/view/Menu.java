package view;

import framework_menu.MenuPrincipal;

public class Menu {
	public static void main(String[] args) {
		MenuPrincipal menu_principal = MenuPrincipal.getInstance(-1, "Menu Principal");

		// Menu clientes
		MenuClientes menu_clientes = new MenuClientes(1, "Menu clientes");
		menu_principal.addAcao(menu_clientes);

		AcaoListarClientes listar_clientes = new AcaoListarClientes(1, "Listar clientes");
		menu_clientes.addAcao(listar_clientes);

		AcaoAdicionarCliente adicionar_cliente = new AcaoAdicionarCliente(2, "Adicionar cliente");
		menu_clientes.addAcao(adicionar_cliente);

		AcaoRemoverCliente remover_cliente = new AcaoRemoverCliente(3, "Remover cliente");
		menu_clientes.addAcao(remover_cliente);

		// Menu produtos
		MenuProdutos menu_produtos = new MenuProdutos(2, "Menu produtos");
		menu_principal.addAcao(menu_produtos);

		AcaoListarProdutos listar_produtos = new AcaoListarProdutos(1, "Listar produtos");
		menu_produtos.addAcao(listar_produtos);

		AcaoAdicionarProduto adicionar_produto = new AcaoAdicionarProduto(2, "Adicionar produto");
		menu_produtos.addAcao(adicionar_produto);

		AcaoRemoverProduto remover_produto = new AcaoRemoverProduto(3, "Remover produto");
		menu_produtos.addAcao(remover_produto);

		// Menu vendas
		MenuVendas menu_vendas = new MenuVendas(3, "Menu vendas");
		menu_principal.addAcao(menu_vendas);

		AcaoListarVendas listar_vendas = new AcaoListarVendas(1, "Listar vendas");
		menu_vendas.addAcao(listar_vendas);

		MenuRealizarVenda realizar_vendas = new MenuRealizarVenda(2, "Realizar vendas");
		menu_vendas.addAcao(realizar_vendas);

		AcaoListarItensVenda listar_itens_venda = new AcaoListarItensVenda(1, "Listar itens da venda");
		realizar_vendas.addAcao(listar_itens_venda);

		AcaoAdicionarItemVenda adicionar_item_venda = new AcaoAdicionarItemVenda(2, "Adicionar item na venda");
		realizar_vendas.addAcao(adicionar_item_venda);

		AcaoRemoverItemVenda remover_item_venda = new AcaoRemoverItemVenda(3, "Remover item da venda");
		realizar_vendas.addAcao(remover_item_venda);

		AcaoFinalizarVenda finalizar_venda = new AcaoFinalizarVenda(4, "Finalizar venda");
		realizar_vendas.addAcao(finalizar_venda);
		
		// Carregar arquivo de entidades
		AcaoCarregarArquivo carregar_arquivo = new AcaoCarregarArquivo(4, "Carregar arquivo");
		menu_principal.addAcao(carregar_arquivo);
		
		// Salvar arquivo de entidades
		AcaoSalvarArquivo salvar_arquivo = new AcaoSalvarArquivo(5, "Salvar arquivo");
		menu_principal.addAcao(salvar_arquivo);

		menu_principal.tarefa();
	}
}
