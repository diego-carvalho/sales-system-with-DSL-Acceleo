package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public abstract class Arquivo {
	
	@SuppressWarnings("unchecked")
	public static ArrayList<? extends Entidade> getEntityALFromFile(String tipo_arquivo, String array_file_name) {
		ArrayList<? extends Entidade> array = null;
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream(array_file_name);
			ois = new ObjectInputStream(fis);
			array = (ArrayList<? extends Entidade>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Arquivo de " + tipo_arquivo + " lido com sucesso.");
		
		return array;
	}
	
	public static void saveEntityALToFile(String tipo_arquivo, ArrayList<? extends Entidade> array_generico, String array_file_name) {
		for(Entidade i: array_generico)
			i.setPersistido(true);
		
		try {
			FileOutputStream fos = new FileOutputStream(array_file_name);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(array_generico);
			oos.close();
			
			System.out.println("Arquivo de " + tipo_arquivo + " salvo com sucesso.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
