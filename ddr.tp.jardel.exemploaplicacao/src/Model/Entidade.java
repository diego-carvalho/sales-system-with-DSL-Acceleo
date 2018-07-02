package Model;

import java.io.Serializable;

public abstract class Entidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4242712996313911806L;
	private boolean persistido;

	
	public boolean isPersistido() {
		return persistido;
	}
	public void setPersistido(boolean persistido) {
		this.persistido = persistido;
	}
	
	public abstract String toString();

}
