package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Venda extends Entidade implements Totalizavel, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3989685991026425710L;
	private Integer numero;
	private Date data;
	private Cliente cliente;
	private ArrayList<Item> itens = new ArrayList<>();
        private FormaPagamento formaPagamento;

	@Override
	public Float total() {
		// TODO Auto-generated method stub
		Float valor = (float) 0.0;
		for (Item itemVenda : itens) {
			valor += itemVenda.total();
		}
		return valor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Venda = [numero: "+ getNumero() +", data: "+ getData() +", cliente: "+ getCliente() +", itens: ("+ itensStr() +"), Pagamento: " + formaPagamento.getForma() + "]";
	}
        
        public void setFormaPagamento(FormaPagamento formaPagamento) {
            this.formaPagamento = formaPagamento;
        }
        
        public FormaPagamento getFormaPagamento() {
            return formaPagamento;
        }
        
        private String itensStr() {
            String str = " ";
            for(Item item : getItens()) {
                str += item.getProduto().getNome() + " ";
            }
            return str;
        }
	
	public void setItem(Item item) {
		itens.add(item);
	}

	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
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
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
}
