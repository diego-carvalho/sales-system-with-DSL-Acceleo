package view.clienteActions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Controller.ClienteController;
import Model.Cliente;
import framework.Action;

public class IncluirCliente implements Action {
	
	Scanner scan = new Scanner(System.in);
	Date data = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	ClienteController clienteController = ClienteController.getInstance();

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Incluir um cliente";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		Cliente cliente = showAdiciona();
		clienteController.adicionarCliente(cliente);
		return 0;
	}
	
	public Cliente showAdiciona() {
		Cliente cliente = new Cliente();
		System.out.println("Informe o nome:");
		cliente.setNome(scan.nextLine());
		System.out.println("Informe o endereco:");
		cliente.setEndereco(scan.nextLine());
		boolean verificaFormat = true;
		while(verificaFormat) {
			System.out.println("Informe o rg:");
			String rg = scan.nextLine();
			if (clienteController.findByRg(rg) != -1) {
				System.out.println("Ja possuimos clientes com esse RG, tente novamente.");
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
