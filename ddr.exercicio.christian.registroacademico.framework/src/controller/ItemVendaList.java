package controller;

import java.util.ArrayList;

import model.ItemVenda;
import model.Produto;

public abstract class ItemVendaList {
	private static ArrayList<ItemVenda> itens_venda = new ArrayList<>();

	public static void showItemVenda() {
		for (ItemVenda iv : itens_venda)
			System.out.println(iv);
	}

	public static ItemVenda getItemVenda(int product_code) {
		for (ItemVenda iv : itens_venda) {
			if (iv.getProduto() != null && iv.getProduto().getCodigo() == product_code)
				return iv;
		}

		System.out.println("Cliente nao encontrado.");
		return null;
	}
	
	public static ArrayList<ItemVenda> getItensVenda(){
		return itens_venda;
	}
	
	public static void clearItensVenda() {
		itens_venda.clear();
	}

	public static void addItemVenda(int prod_code, int quantidade) {
		Produto p = ProductsList.get_product(prod_code);
		
		ItemVenda iv = new ItemVenda();
		iv.setPersistido(false);
		iv.setProduto(p);
		iv.setQuantidade(quantidade);
		iv.setValor(p.getValor());
		
		itens_venda.add(iv);
	}

	public static void removeItemVenda(int product_code) {
		itens_venda.removeIf(iv -> iv.getProduto().getCodigo() == product_code);
	}

}
