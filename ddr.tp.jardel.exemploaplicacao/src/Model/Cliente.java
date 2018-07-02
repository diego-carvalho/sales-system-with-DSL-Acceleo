package Model;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Pessoa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4061306069965064384L;
	private String rg;
	private Date data_de_nascimento;
	
	@Override
	public String toString() {
		return "Cliente [rg=" + rg + ", data_de_nascimento=" + data_de_nascimento +", "+ super.toString() +"]";
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(Date data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	
	

}
