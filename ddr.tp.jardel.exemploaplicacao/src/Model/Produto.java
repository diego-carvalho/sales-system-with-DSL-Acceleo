package Model;

import java.io.Serializable;

public class Produto extends Entidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -130819686340199241L;
	private Integer codigo;
	private String nome;
	private Float valor;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto = [codigo: "+ getCodigo() +", nome: "+ getNome() +", valor: "+ getValor() +"]";
	}

}
