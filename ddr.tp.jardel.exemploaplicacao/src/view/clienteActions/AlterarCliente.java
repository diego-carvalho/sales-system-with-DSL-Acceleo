package view.clienteActions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Controller.ClienteController;
import Model.Cliente;
import framework.Action;

public class AlterarCliente implements Action{
	
	Scanner scan = new Scanner(System.in);
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	ClienteController clienteController = ClienteController.getInstance();
	Integer pos = -1;

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Alterar um cliente";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		Cliente cliente = showEdita();
		if (cliente != null && pos != -1) {
			clienteController.editarCliente(pos, cliente);
			pos = -1;
		}
		return 0;
	}
	
	public Cliente showEdita() {
		Cliente cliente = new Cliente();
		System.out.println("Digite o rg do cliente que deseja editar:");
		String rg = (scan.nextLine());
		pos = clienteController.findByRg(rg);
		if (pos == -1) {
			System.out.println("Cliente não encontrado, por favor tente novamente.");
			return null;
		}
		System.out.println("Informe o nome:");
		cliente.setNome(scan.nextLine());
		System.out.println("Informe o endereco:");
		cliente.setEndereco(scan.nextLine());
		boolean verificaFormat = true;
		while(verificaFormat) {
			System.out.println("Informe o rg:");
			rg = scan.nextLine();
			if (clienteController.findByRg(rg) == -1) {
				System.out.println("Erro ao inserir o formato da data, tente novamente.");
				verificaFormat = true;
			}else {
				cliente.setRg(rg);
				verificaFormat = false;
			}
		}
		verificaFormat = true;
		while(verificaFormat) {
			try {
				System.out.println("Informe a data de nascimento no formato ##/##/####:");
				data = formato.parse(scan.nextLine());
				verificaFormat = false;
			} catch (ParseException e) {
				System.out.println("Erro ao inserir o formato da data, tente novamente.");
				verificaFormat = true;
			}
		}
		cliente.setData_de_nascimento(data);
		return cliente;
	}

}
