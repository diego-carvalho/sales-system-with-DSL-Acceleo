package Controller;

import java.util.ArrayList;

import Model.Cliente;

public class ClienteController {
	
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private static ClienteController instance = null;
	
	private ClienteController() {
		restaurar();
	}
	
	public static ClienteController getInstance() {
		if (instance == null) {
			instance = new ClienteController();
		}
		return instance;
	}
	
	public void imprimirCliente() {
		System.out.println("\n");
		if (getClientes().isEmpty()) {
			System.out.println("Nenhum cliente adicionado.");
		}else {
			for (Cliente cliente : getClientes()) {
				System.out.println(cliente);
			}
		}
		System.out.println("\n");
	}
	
	public void adicionarCliente(Cliente cliente) {
		getClientes().add(cliente);
		System.out.println("cliente adicionado com sucesso.");
	}
	
	public void editarCliente(Integer pos, Cliente cliente) {
		getClientes().set(pos, cliente);
		System.out.println("cliente editado com sucesso.");
	}
	
	public void removeCliente(Integer pos) {
		Cliente cliente = getClientes().get(pos);
		getClientes().remove(cliente);
		System.out.println("cliente removido com sucesso.");
	}
	
	@SuppressWarnings("unchecked")
	public void restaurar() {
		Arquivo arq = Arquivo.getInstace();
		try {
			setClientes((ArrayList<Cliente>) arq.restaurar("src/Data/clientes.txt"));
		} catch (Exception e) {
			System.out.println("arquivo clientes não encontrado.");
		}
	}
	
	public Integer findByRg(String rg) {
		Integer cont = 0;
		for (Cliente cliente : getClientes()) {
			if (cliente.getRg().equals(rg)) {
				return cont;
			}
			cont++;
		}
		return -1;
	}
	
	public Cliente getCliente(Integer pos) {
		if (pos != -1) {
			return getClientes().get(pos);
		}
		return null;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
