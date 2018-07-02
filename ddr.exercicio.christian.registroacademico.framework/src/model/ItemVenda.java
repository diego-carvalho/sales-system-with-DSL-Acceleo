package model;

public class ItemVenda extends Entidade implements Totalizavel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Produto produto;
	private float valor;
	private int quantidade;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public float total() {
		// TODO Auto-generated method stub
		return valor * quantidade;
	}

	@Override
	public String toString() {
		return "ItemVenda [produto=" + produto + ", valor=" + valor + ", quantidade=" + quantidade + ", valor_total=" + total() +"]";
	}

}
