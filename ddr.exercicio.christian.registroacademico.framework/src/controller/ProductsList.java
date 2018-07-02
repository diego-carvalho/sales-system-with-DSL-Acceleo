package controller;

import java.util.ArrayList;

import model.Produto;

public abstract class ProductsList {
	private static ArrayList<Produto> products = new ArrayList<>();

	public static ArrayList<Produto> getProducts() {
		return products;
	}

	public static void setProducts(ArrayList<Produto> products) {
		ProductsList.products = products;
	}

	public static void showProducts() {
		for (Produto p : products)
			System.out.println(p);
	}

	public static Produto get_product(int code) {
		for (Produto p : products) {
			if (p.getCodigo() == code)
				return p;
		}

		System.out.println("Produto nao encontrado.");
		return null;
	}

	public static void clearProdutos() {
		products.clear();
	}

	public static void add_product(Produto p) {
		products.add(p);
	}

	public static void remove_product(int codigo) {
		products.removeIf(p -> p.getCodigo() == codigo);
	}
}
