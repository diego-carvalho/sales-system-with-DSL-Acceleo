package Model;

import java.io.Serializable;

public class Pessoa extends Entidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2599259812938637819L;
	private String nome;
	private String endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pessoa = [nome: "+ getNome() +", endereco: "+ getEndereco() +"]";
	}

}
