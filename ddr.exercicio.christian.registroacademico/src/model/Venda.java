package model;

import java.util.ArrayList;
import java.util.Date;

public class Venda extends Entidade implements Totalizavel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int numero = 0;
	private Date data;
	private Cliente cliente;
	private ArrayList<ItemVenda> itens;

	@SuppressWarnings("static-access")
	public Venda() {
		this.numero++;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}

	@Override
	public float total() {
		// TODO Auto-generated method stub
		float sum = 0;

		for (ItemVenda iv : itens) {
			sum += iv.total();
		}

		return sum;
	}

	@Override
	public String toString() {
		return "Venda [numero=" + numero + ", data=" + data + ", cliente=" + cliente + ", valor_total=" + total() + "]";
	}

}
