package framework_menu;

public class SairPrincipal extends AcaoGenerica implements Tarefa {

	public SairPrincipal(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		// TODO Auto-generated constructor stub
	}
	
	public void tarefa() {
		System.exit(0);
	}
}
