package model;

public class ItemVendaVeiculo {
	private int quantidade;
	private Veiculo produto;
	
	public ItemVendaVeiculo(int quantidade, Veiculo produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Veiculo getProduto() {
		return produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setProduto(Veiculo produto) {
		this.produto = produto;
	}
}
