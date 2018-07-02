package view.vendaActions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import Controller.ClienteController;
import Controller.ProdutoController;
import Controller.VendaController;
import Model.Cliente;
import Model.Item;
import Model.Produto;
import Model.Venda;
import Model.Debito;
import Model.Credito;
import framework.Action;

public class IncluirVenda implements Action {
	
	VendaController vendaController = VendaController.getInstance();
	ClienteController clienteController = ClienteController.getInstance();
	ProdutoController produtoController = ProdutoController.getInstance();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	Scanner scan = new Scanner(System.in);
	Integer pos = -1;

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Realizar uma Venda";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		Venda venda = showAdiciona();
		if (venda != null) {
			vendaController.adicionarVenda(venda);
		}
		return 0;
	}
	
	public Venda showAdiciona() {
		Venda venda = new Venda();
		boolean verificaFormat = true;
		String rg = null;
		Cliente cliente = null;
		while(verificaFormat) {
			try {
				System.out.println("Digite o RG do cliente que deseja adicionar:");
				rg = scan.nextLine();
				pos = clienteController.findByRg(rg);
				if (pos == -1) {
					System.out.println("Cliente com rg "+ rg +" não encontrado");
					break;
				}else {
					cliente = clienteController.getCliente(pos);
				}
				pos = -1;
				verificaFormat = false;
			} catch (Exception e) {
				verificaFormat = true;
			}
		}
		if(cliente != null) {
			venda.setCliente(cliente);
		}else {
			return null;
		}
		verificaFormat = true;
		Item itemVenda = null;
		while(verificaFormat) {
			System.out.println("Adicionar um item de venda");
			itemVenda = showAdicionaItemVenda();
			if (itemVenda != null) {
				venda.setItem(itemVenda);
			}
			System.out.println("Deseja adicionar mais um item de venda? Sim - 1, Não - 0");
			Integer resp = 1;
			try {
				resp = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("Erro na escolha, escolhe entre 0 ou 1.");
				resp = 1;
			}
			if (resp == 0) {
				verificaFormat = false;
			}else {
				verificaFormat = true;
			}
		}
                verificaFormat = true;
                Integer forma = 0;
                while(verificaFormat) {
                        verificaFormat = false;
			System.out.println("Forma de pagamento");
			System.out.println("Selecione a forma de pagamento? Crédito - 1, Debito - 0");
			forma = 1;
			try {
				forma = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("Erro na escolha, escolhe entre 0 ou 1.");
				forma = 1;
                                verificaFormat = true;
			}
		}
		venda.setFormaPagamento(forma == 1 ? new Credito() : new Debito());
		venda.setData(Calendar.getInstance().getTime());
		
		return venda;
	}
	
	public Item showAdicionaItemVenda() {
		Item item = new Item();
		boolean verificaFormat = true;
		Integer codigo = null;
		Produto produto = null;
		while(verificaFormat) {
			try {
				System.out.println("Digite o codigo do produto que deseja adicionar:");
				codigo = (Integer.parseInt(scan.nextLine()));
				pos = produtoController.findByCodigo(codigo);
				if (pos == -1) {
					System.out.println("Produto com codigo "+ codigo +" não encontrado");
					return null;
				}else {
					produto = produtoController.getProduto(pos);
				}
				pos = -1;
				verificaFormat = false;
			} catch (Exception e) {
				System.out.println("Codigo do produto são apenas numeros, tente novamente.");
				verificaFormat = true;
			}
		}
		item.setProduto(produto);
		verificaFormat = true;
		while(verificaFormat) {
			try {
				System.out.println("Informe a quantidade:");
				item.setQuantidade(Integer.parseInt(scan.nextLine()));
				verificaFormat = false;
			} catch (Exception e) {
				System.out.println("Quantidade precisa ser em numeros, tente novamente.");
				verificaFormat = true;
			}
		}
		item.setValor(item.total());
		return item;
	}

}
