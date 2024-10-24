package jogador;

import java.util.Scanner;

public class Raca {
	//Raça do personagem:
	private String raca;
	
	public Raca() {
	}
	
	public Raca(String raca) {
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void tiposDeRaca(Scanner keyboard) {
		System.out.println("Escolha uma raça: ");
		System.out.print("[1] Humano - [2] Orc - [3] Zumbi - [4] Elfo: ");
		escolhaRaca(keyboard);
	}
	
	public String escolhaRaca(Scanner keyboard) {
		int opcao = keyboard.nextInt();
		switch(opcao) {
		case 1:
			setRaca("Humano");
			break;
		case 2:
			setRaca("Orc");
			break;
		case 3:
			setRaca("Zumbi");
			break;
		case 4:
			setRaca("Elfo");
			break;
		default:
			System.out.println("Opção invalida! Tente novamente!");
			tiposDeRaca(keyboard);
		}
		
		return getRaca();
	}
	
	
}
