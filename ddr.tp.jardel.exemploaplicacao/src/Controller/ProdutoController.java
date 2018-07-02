package Controller;

import java.util.ArrayList;

import Model.Produto;

public class ProdutoController {
	
	private ArrayList<Produto> produtos = new ArrayList<>();
	private static Integer quantidadeProdutos = 0;
	private static ProdutoController instance = null;
	
	private ProdutoController() {
		restaurar();
	}
	
	public static ProdutoController getInstance() {
		if (instance == null) {
			instance = new ProdutoController();
		}
		return instance;
	}
	
	public void imprimirProduto() {
		System.out.println("\n");
		if (getProdutos().isEmpty()) {
			System.out.println("Nenhum produto adicionado.");
		}else {
			for (Produto produto : getProdutos()) {
				System.out.println(produto);
			}
		}
		System.out.println("\n");
	}
	
	public void adicionarProduto(Produto produto) {
		quantidadeProdutos++;
		produto.setCodigo(quantidadeProdutos);
		getProdutos().add(produto);
		System.out.println("produto adicionado com sucesso.");
	}
	
	public void editarProduto(Integer pos, Produto produto) {
		produto.setCodigo(getProdutos().get(pos).getCodigo());
		getProdutos().set(pos, produto);
		System.out.println("produto editado com sucesso.");
	}
	
	public void removeProduto(Integer pos) {
		Produto produto = getProdutos().get(pos);
		getProdutos().remove(produto);
		System.out.println("produto removido com sucesso.");
	}
	
	@SuppressWarnings("unchecked")
	public void restaurar() {
		Arquivo arq = Arquivo.getInstace();
		try {
			setProdutos((ArrayList<Produto>) arq.restaurar("src/Data/produtos.txt"));
		} catch (Exception e) {
			System.out.println("arquivo produtos não encontrado.");
		}
	}
	
	public Integer findByCodigo(Integer codigo) {
		Integer cont = 0;
		for (Produto produto : getProdutos()) {
			if (produto.getCodigo().equals(codigo)) {
				return cont;
			}
			cont++;
		}
		return -1;
	}
	
	public Produto getProduto(Integer pos) {
		if(pos != -1) {
			return getProdutos().get(pos);
		}
		return null;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
