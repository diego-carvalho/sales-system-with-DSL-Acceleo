package controller;

import java.util.ArrayList;

import model.Venda;

public abstract class VendaList {
	private static ArrayList<Venda> vendas = new ArrayList<>();

	public static ArrayList<Venda> getVendas() {
		return vendas;
	}

	public static void setVendas(ArrayList<Venda> vendas) {
		VendaList.vendas = vendas;
	}
	
	public static void addVenda(Venda v) {
		vendas.add(v);
	}
	
	public static void clearVendas() {
		vendas.clear();
	}
	
	public static Venda getVenda(int numero) {
		for (Venda v : vendas) {
			if (v.getNumero() == numero)
				return v;
		}

		System.out.println("Venda nao encontrada.");
		return null;
	}
	
	public static void removeVenda(int numero) {
		vendas.removeIf(v -> v.getNumero() == numero);
	}

	public static void showVendas() {
		for (Venda v : vendas)
			System.out.println(v);
	}

}
