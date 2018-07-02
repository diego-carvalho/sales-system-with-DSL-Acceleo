package framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Action{
	
	Scanner scan = new Scanner(System.in);
	Action exitOption = new ExitOption();
	private ArrayList<Action> actions = new ArrayList<>();
	private String title = "MENU";
	private String msgChoice = "Escolha umas das opcoes acima";
	private String msgChoiceNotExist = "Opcao escolhida incorreta, somente numeros validos.";
	private String msgChoiceInvalide = "Opcao escolhida incorreta, use apenas numeros.";
	
	public Menu(){
		actions.add(exitOption);
	}
	
	public Menu(String title){
		actions.add(exitOption);
		this.title = title;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public Integer runAction() {
		// TODO Auto-generated method stub
		Integer choice = 0;
		
		while(choice != -1) {
			int cont = 0;
			System.out.println("\n");
			System.out.println("-------------------------------------------");
			System.out.println(title);
			for (Action action : actions) {
				System.out.println(cont++ + "- " + action.getTitle());
			}
			try{
				System.out.println(msgChoice);
				choice = Integer.parseInt(scan.nextLine());
				if (!(choice >= 0 && choice < actions.size())) {
					System.out.println(msgChoiceNotExist);
					choice = 0;
				}else {
					if(!(actions.get(choice) instanceof Menu)) {
						if(actions.get(choice).getTitle() != null) {
							System.out.println(actions.get(choice).getTitle());
						}
					}
					choice = actions.get(choice).runAction();
				}
			}
			catch (Exception e) {
				System.out.println(msgChoiceInvalide);
				choice = 0;
			}
		}
		
		return 0;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addAction(Action action) {
		actions.add(action);
	}
	
	public void setmsgChoice(String msgChoice) {
		this.msgChoice = msgChoice;
	}
	
	public void setmsgChoiceNotExist(String msgChoiceNotExist) {
		this.msgChoiceNotExist = msgChoiceNotExist;
	}
	
	public void setmsgChoiceInvalide(String msgChoiceInvalide) {
		this.msgChoiceInvalide = msgChoiceInvalide;
	}
	
	

}
