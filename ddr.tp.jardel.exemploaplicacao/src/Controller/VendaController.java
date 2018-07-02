package Controller;

import java.util.ArrayList;

import Model.Venda;

public class VendaController {
	
	private ArrayList<Venda> vendas = new ArrayList<>();
	private static Integer quantidadeVendas = 0;
	private static VendaController instance = null;
	
	private VendaController() {
		restaurar();
	}
	
	public static VendaController getInstance() {
		if (instance == null) {
			instance = new VendaController();
		}
		return instance;
	}
	
	public void imprimirVenda () {
		System.out.println("\n");
		if (getVendas().isEmpty()) {
			System.out.println("Nenhuma venda realizada.");
		}else {
			for (Venda venda: getVendas()) {
				System.out.println(venda);
			}
		}
		System.out.println("\n");
	}
	
	public void adicionarVenda(Venda venda) {
		quantidadeVendas++;
		venda.setNumero(quantidadeVendas);
		getVendas().add(venda);
		System.out.println("venda realizada com sucesso.");
	}
	
	public void removeVenda(Integer pos) {
		Venda venda= getVendas().get(pos);
		getVendas().remove(venda);
		System.out.println("Venda removida com sucesso.");
	}
	
	@SuppressWarnings("unchecked")
	public void restaurar() {
		Arquivo arq = Arquivo.getInstace();
		try {
			setVendas((ArrayList<Venda>) arq.restaurar("src/Data/vendas.txt"));
		} catch (Exception e) {
			System.out.println("arquivo vendas não encontrado.");
		}
	}
	
	public Integer findByNumero(Integer numero) {
		Integer cont = 0;
		for (Venda venda : getVendas()) {
			if (venda.getNumero().equals(numero)) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}
	
}
