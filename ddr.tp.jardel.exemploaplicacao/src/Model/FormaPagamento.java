/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author jardel
 */
public abstract class FormaPagamento implements Serializable {
     private String nome;
    
    public void setForma(String nome) {
        this.nome = nome;
    }
    
    public String getForma() {
        return nome;
    }
}
