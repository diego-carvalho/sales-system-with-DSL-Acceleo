/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

public class Credito extends FormaPagamento implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Credito() {
       super.setForma("Credito");
   }
}
