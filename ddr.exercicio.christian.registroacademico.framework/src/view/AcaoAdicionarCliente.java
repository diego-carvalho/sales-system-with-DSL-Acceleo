package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import controller.ClientsList;
import framework_menu.AcaoGenerica;
import model.Cliente;

public class AcaoAdicionarCliente extends AcaoGenerica {

	public AcaoAdicionarCliente(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void tarefa() {
		Cliente c = new Cliente();

		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Nome: ");
			c.setNome(sc.nextLine());

			System.out.print("Endereco: ");
			c.setEndereco(sc.nextLine());

			System.out.print("RG: ");
			c.setRg(sc.nextLine());

			System.out.print("Data de nascimento (dd-MM-yyyy): ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			String dateInString = sc.nextLine();
			
			try {
				Date date = formatter.parse(dateInString);
				c.setData_nascimento(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			c.setPersistido(false);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		// System.out.println(c);
		ClientsList.addClient(c);
		System.out.println("Cliente cadastrado com sucesso.");
	}

}
