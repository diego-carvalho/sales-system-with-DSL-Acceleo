package framework_menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuGenerico extends AcaoGenerica {
	private ArrayList<AcaoGenerica> lista_acoes = new ArrayList<>();
	private String frase_erro = "Opcao invalida!";
	private String opcao_desejada = "Digite a opcao desejada: ";

	public MenuGenerico(int cod_opcao, String titulo) {
		super(cod_opcao, titulo);
		SairGenerico sair = new SairGenerico(0, "Sair");
		lista_acoes.add(0, sair);
	}

	public void tarefa() {
		int opcao_escolhida = -1;

		while (opcao_escolhida != 0) {
			System.out.println("\n\t\t" + getTitulo().toUpperCase() + "\n");
			
			// Lista as acoes
			for (AcaoGenerica acao : lista_acoes) {
				System.out.println(acao);
			}

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\n" + opcao_desejada);
			opcao_escolhida = sc.nextInt();
			System.out.println();

			// Testa se a opcao existe
			try {
				AcaoGenerica acao_escolhida = lista_acoes.get(opcao_escolhida);
				acao_escolhida.tarefa();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(frase_erro);
			}

			System.out.println();
		}
	}

	public void addAcao(AcaoGenerica a) {
		lista_acoes.add(a);
	}

	public int removeAcao(int cod_opcao) {
		boolean b;

		b = lista_acoes.removeIf(a -> a.getCod_opcao() == cod_opcao);

		// Verifica se foi removido uma acao valida
		if (b)
			return 0;
		else
			return -1;
	}
}
