package framework_menu;

public class AcaoGenerica implements Tarefa {
	private int cod_opcao;
	private String titulo;

	public AcaoGenerica(int cod_opcao, String titulo) {
		this.titulo = titulo;
		this.cod_opcao = cod_opcao;
	}

	public int getCod_opcao() {
		return cod_opcao;
	}

	public void setCod_opcao(int cod_opcao) {
		this.cod_opcao = cod_opcao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public void tarefa() {
		// TODO Auto-generated method stub
		System.out.println("Tarefa default, especificar uma tarefa.");
	}

	@Override
	public String toString() {
		return Integer.toString(cod_opcao) + " - " + titulo + ";";
	}

}
