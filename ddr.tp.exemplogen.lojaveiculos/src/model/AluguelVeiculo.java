package model;

public class AluguelVeiculo {
	private Cliente cliente;
	private ItemVendaVeiculo itemVenda;
	private FormaPagamentoDinheiro dinheiro;
	private FormaPagamentoCartao cartao;
	
	public AluguelVeiculo(Cliente cliente, ItemVendaVeiculo itemVenda, FormaPagamentoDinheiro dinheiro, FormaPagamentoCartao cartao) {
		this.cliente = cliente;
		this.itemVenda = itemVenda;
		this.dinheiro = dinheiro;
		this.cartao = cartao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ItemVendaVeiculo getItemVenda() {
		return itemVenda;
	}

	public FormaPagamentoDinheiro getDinheiro() {
		return dinheiro;
	}

	public FormaPagamentoCartao getCartao() {
		return cartao;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setItemVenda(ItemVendaVeiculo itemVenda) {
		this.itemVenda = itemVenda;
	}

	public void setDinheiro(FormaPagamentoDinheiro dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void setCartao(FormaPagamentoCartao cartao) {
		this.cartao = cartao;
	}
}
