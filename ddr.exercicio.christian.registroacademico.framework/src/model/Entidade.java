package model;

import java.io.Serializable;

public abstract class Entidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean persistido;

	public boolean isPersistido() {
		return persistido;
	}

	public void setPersistido(boolean persistido) {
		this.persistido = persistido;
	}

	@Override
	public String toString() {
		return "Entidade [persistido=" + persistido + "]";
	}
}
