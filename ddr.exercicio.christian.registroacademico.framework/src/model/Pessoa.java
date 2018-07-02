package model;

public class Pessoa extends Entidade {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		return super.toString() + "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}

}
