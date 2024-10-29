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
	
	public int getIdRaca() {
		return idRaca;
	}
	
	//Métodos
	//Apresentando as raças
	public void tiposDeRaca(Scanner keyboard) {
		System.out.println("Escolha uma raça: ");
		System.out.print("[1] Humano - [2] Orc - [3] Zumbi - [4] Elfo: ");
		escolhaRaca(keyboard);
	}
	
	//Escolhendo a raça desejada e inserindo o ID da mesma.
	public String escolhaRaca(Scanner keyboard) {
		int opcao = keyboard.nextInt();
		switch(opcao) {
		case 1:
			this.raca = ("Humano");
			this.idRaca = (1);
			break;
		case 2:
			this.raca = ("Orc");
			this.idRaca = (2);
			break;
		case 3:
			this.raca = ("Zumbi");
			this.idRaca = (3);
			break;
		case 4:
			this.raca = ("Elfo");
			this.idRaca = (4);
			break;
		default:
			System.out.println("Opção invalida! Tente novamente!");
			tiposDeRaca(keyboard);
		}
		
		return getRaca();
	}
	
	
}
