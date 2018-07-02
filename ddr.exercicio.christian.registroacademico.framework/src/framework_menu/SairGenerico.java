package framework_menu;

public class SairGenerico extends AcaoGenerica {

	public SairGenerico(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}

	public void tarefa() {
		System.out.println("Sair default, especificar uma tarefa.");
	}
}
