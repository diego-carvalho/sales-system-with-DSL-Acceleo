package controller;

import java.util.ArrayList;

import model.Cliente;

public abstract class ClientsList {

	private static ArrayList<Cliente> clients = new ArrayList<>();

	public static ArrayList<Cliente> getClients() {
		return clients;
	}

	public static void setClients(ArrayList<Cliente> clients) {
		ClientsList.clients = clients;
	}

	public static void showClients() {
		for (Cliente c : clients)
			System.out.println(c);
	}

	public static Cliente getClient(String rg) {
		for (Cliente c : clients) {
			if (c.getRg() != null && c.getRg().equals(rg))
				return c;
		}

		System.out.println("Cliente nao encontrado.");
		return null;
	}

	public static void clearClientes() {
		clients.clear();
	}

	public static void addClient(Cliente c) {
		clients.add(c);
	}

	public static void removeClient(String rg) {
		clients.removeIf(c -> c.getRg().equals(rg));
	}
}
