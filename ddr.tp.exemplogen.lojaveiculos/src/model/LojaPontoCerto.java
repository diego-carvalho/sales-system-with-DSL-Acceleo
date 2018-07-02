package model;

public class LojaPontoCerto {
	private AluguelVeiculo transacao;
	
	public LojaPontoCerto(AluguelVeiculo transacao) {
		this.transacao = transacao;
	}

	public AluguelVeiculo getTransacao() {
		return this.transacao;
	}
	
	public void setTransacao(AluguelVeiculo transacao) {
		this.transacao = transacao;
	}
}
