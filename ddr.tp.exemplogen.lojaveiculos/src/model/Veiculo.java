package model;
public class Veiculo {
	private String marca;
	private String modelo;
	private float valor;
	private int ano;

	public Veiculo(String marca, String modelo, float valor, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public float getValor() {
		return valor;
	}

	public int getAno() {
		return ano;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
