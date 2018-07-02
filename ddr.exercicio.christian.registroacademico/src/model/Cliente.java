package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String rg;
	private Date data_nascimento;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return super.toString() + "Cliente [rg=" + rg + ", data_nascimento=" + dateFormat.format(data_nascimento) + "]";
	}

}
