package Controller;

import java.util.ArrayList;

import Model.Locacao;

public class LocacaoController {
	
	private ArrayList<Locacao> locacoes = new ArrayList<>();
	private static Integer quantidadeLocacoes = 0;
	private static LocacaoController instance = null;
	
	private LocacaoController() {
            restaurar();
	}
	
	public static LocacaoController getInstance() {
            if (instance == null) {
                    instance = new LocacaoController();
            }
            return instance;
	}
	
	public void imprimirLocacao () {
            System.out.println("\n");
            if (getLocacoes().isEmpty()) {
                    System.out.println("Nenhuma locacao realizada.");
            }else {
                    for (Locacao locacao: getLocacoes()) {
                            System.out.println(locacao);
                    }
            }
            System.out.println("\n");
	}
	
	public void adicionarLocacao(Locacao locacao) {
		quantidadeLocacoes++;
		locacao.setNumero(quantidadeLocacoes);
		getLocacoes().add(locacao);
		System.out.println("locacao realizada com sucesso.");
	}
	
	public void removeLocacao(Integer pos) {
		Locacao locacao = getLocacoes().get(pos);
		getLocacoes().remove(locacao);
		System.out.println("Locacao removida com sucesso.");
	}
        
    public void devolveLocacao(Integer pos) {
        Locacao locacao = getLocacoes().get(pos);
        locacao.setEstado(false); //Estado de emprestado falso
        System.out.println("Locacao devolvida com sucesso.");
    }
	
	@SuppressWarnings("unchecked")
	public void restaurar() {
		Arquivo arq = Arquivo.getInstace();
		try {
			setLocacoes((ArrayList<Locacao>) arq.restaurar("src/Data/locacoes.txt"));
		} catch (Exception e) {
			System.out.println("arquivo locacoes não encontrado.");
		}
	}
	
	public Integer findByNumero(Integer numero) {
		Integer cont = 0;
		for (Locacao locacao : getLocacoes()) {
			if (locacao.getNumero().equals(numero)) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(ArrayList<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
}
