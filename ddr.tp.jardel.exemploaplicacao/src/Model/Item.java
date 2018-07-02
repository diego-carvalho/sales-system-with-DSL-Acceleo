package Model;

import java.io.Serializable;

public class Item extends Entidade implements Totalizavel, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2090719161192715458L;
	private Produto produto;
	private Float valor;
	private Integer quantidade;
	
	
	@Override
	public Float total() {
		// TODO Auto-generated method stub
		return (float) produto.getValor() * this.quantidade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ItemVenda = [valor: "+ getValor() +", quantidade: "+ getQuantidade() +", produto: "+ getProduto() +"]";
	}
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
