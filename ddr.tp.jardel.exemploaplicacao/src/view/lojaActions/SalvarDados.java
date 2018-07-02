package view.lojaActions;

import Controller.Arquivo;
import Controller.ClienteController;
import Controller.ProdutoController;
import Controller.VendaController;
import Controller.LocacaoController;
import framework.Action;

public class SalvarDados implements Action {

	ClienteController clienteController = ClienteController.getInstance();
	ProdutoController produtoController = ProdutoController.getInstance();
	VendaController vendaController = VendaController.getInstance();
        LocacaoController locacaoController = LocacaoController.getInstance();
	Arquivo arq = Arquivo.getInstace();
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Salvar dados";
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		salvaDados();
		return 0;
	}

	public void salvaDados() {
		if (!clienteController.getClientes().isEmpty()) {
			arq.salvar(clienteController.getClientes(), "src/Data/clientes.txt");
		}
		if (!produtoController.getProdutos().isEmpty()) {
			arq.salvar(produtoController.getProdutos(), "src/Data/produtos.txt");
		}
		if (!vendaController.getVendas().isEmpty()) {
			arq.salvar(vendaController.getVendas(), "src/Data/vendas.txt");
		}
                if(!locacaoController.getLocacoes().isEmpty()) {
                    arq.salvar(locacaoController.getLocacoes(), "src/Data/locacoes.txt");
                }
	}
	
}
