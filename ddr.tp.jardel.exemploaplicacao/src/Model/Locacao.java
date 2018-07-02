package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Locacao extends Entidade implements Totalizavel, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3989685991026425710L;
	private Integer numero;
	private Date data; //Data de efetivação
    private Date dataEntrega; //Data de entrega
    private boolean estado;
	private Cliente cliente;
        private FormaPagamento formaPagamento;
	private ArrayList<Item> itens = new ArrayList<>();

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
		return "Locacao = [numero: "+ getNumero() +", data: "+ getData() + " ,dataEntrega: " + getDataEntrega() + ", cliente: "+ getCliente() +", itens: ("+ itensStr() + ")Estado: " + (getEstado() ? "Pendende" : "Entregue") + ", Pagamento: " + formaPagamento.getForma() + "]";
	}
        
        public void setFormaPagamento(FormaPagamento formaPagamento) {
            this.formaPagamento = formaPagamento;
        }
        
        public FormaPagamento getFormaPagamento() {
            return formaPagamento;
        }
        
        public boolean getEstado() {
            return estado;
        }
        
        private String itensStr() {
            String str = " ";
            for(Item item : getItens()) {
                str += item.getProduto().getNome() + " ";
            }
            return str;
        }
        
        public void setEstado(boolean estado) {
            this.estado = estado;
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
        public Date getDataEntrega() {
            return dataEntrega;
        }
	public void setData(Date data) {
		this.data = data;
	}
        public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
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
