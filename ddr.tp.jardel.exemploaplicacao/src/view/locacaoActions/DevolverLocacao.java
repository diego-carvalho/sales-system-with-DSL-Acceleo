package view.locacaoActions;

import java.util.Calendar;
import java.util.Scanner;

import Controller.LocacaoController;
import Model.Locacao;
import framework.Action;

public class DevolverLocacao implements Action{
	
	LocacaoController locacaoController = LocacaoController.getInstance();
	Scanner scan = new Scanner(System.in);
	Integer pos = -1;
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Devolver uma locacao";
	}
	@Override
	public Integer runAction() {
        Integer resp = 1;
		// TODO Auto-generated method stub
		showDevolve();
		if (pos != -1) {
                       
            boolean verificaFormat = true;
            while(verificaFormat) {
                verificaFormat = false;
				System.out.println("Deseja continuar? Sim - 1, Não - 0");
				resp = 1;
				try {
					resp = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("Erro na escolha, escolhe entre 0 ou 1.");
					verificaFormat = true;
				}
                        
            }
            if(resp == 0) {
                return 0;
            }
            locacaoController.devolveLocacao(pos);
            locacaoController.getLocacoes().get(pos).setDataEntrega(Calendar.getInstance().getTime());
            pos = -1;
		}
		return 0;
	}
        
        public void showDevolve() {
		Integer codigo = null;
		boolean verificaFormat = true;
		while(verificaFormat) {
			try {
				System.out.println("Digite o numero da locacao que deseja devolver:");
				codigo = (Integer.parseInt(scan.nextLine()));
				verificaFormat = false;
			} catch (Exception e) {
				System.out.println("Numero de locacao permite apenas numeros, tente novamente.");
				verificaFormat = true;
			}
		}
		pos = locacaoController.findByNumero(codigo);
		if (pos == -1) {
			System.out.println("Locacao nao encontrada, por favor tente novamente.");
		}else {
			System.out.println(locacaoController.getLocacoes().get(pos));
		}
	}

}
