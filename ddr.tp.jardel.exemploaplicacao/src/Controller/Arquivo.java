package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Model.Entidade;

public class Arquivo {
	
	private static Arquivo instance = null;
	
	private Arquivo() {
		// TODO Auto-generated constructor stub
	}
	
	public static Arquivo getInstace() {
		if(instance == null)
			instance = new Arquivo();
		return instance;
		
	}
	
	public void salvar(ArrayList<? extends Entidade> T, String caminho) {
		
		try {
      
			File file = new File(caminho);
                        
                        if(!file.exists()) {
                            file.createNewFile();
                        }
			
			FileOutputStream saveFile = new FileOutputStream(file);
			ObjectOutputStream stream = new ObjectOutputStream(saveFile);
			
			for (Entidade entidade : T) {
				System.out.println(entidade);
				stream.writeObject(entidade);
			}
			
			stream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<? extends Entidade> restaurar(String caminho) {
		ArrayList<Entidade> objeto = new ArrayList<>();
		
		try {
			
			FileInputStream resFile = new FileInputStream(caminho);
			ObjectInputStream stream = new ObjectInputStream(resFile);
			
			//objeto = (ArrayList) stream.readObject();
			try {
				while(true) {
					Entidade o = (Entidade) stream.readObject();
					objeto.add(o);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			stream.close();
			
		} catch (Exception e) {
			
		}
		
		return objeto;
		
	}

}
