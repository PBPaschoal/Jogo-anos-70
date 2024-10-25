package jogador;

import java.util.Scanner;

public class Raca {
	//Raça do personagem:
	private String raca;
	private int idRaca;
	
	public Raca() {
	}
	
	public Raca(String raca, int idRaca) {
		this.raca = raca;
		this.idRaca = idRaca;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public int getIdRaca() {
		return idRaca;
	}
	
	public void setIdRaca(int idRaca) {
		this.idRaca = idRaca;
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
			setIdRaca(1);
			break;
		case 2:
			setRaca("Orc");
			setIdRaca(2);
			break;
		case 3:
			setRaca("Zumbi");
			setIdRaca(3);
			break;
		case 4:
			setRaca("Elfo");
			setIdRaca(4);
			break;
		default:
			System.out.println("Opção invalida! Tente novamente!");
			tiposDeRaca(keyboard);
		}
		
		return getRaca();
	}
	
	
}
