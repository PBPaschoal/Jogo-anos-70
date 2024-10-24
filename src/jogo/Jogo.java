package jogo;

import java.util.Locale;
import java.util.Scanner;

import jogador.Personagem;
import jogador.Raca;

public class Jogo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Personagem personagem = new Personagem();
		Raca raca = new Raca();
		
		System.out.println("###################################");
		System.out.println("#### BEM-VINDO(A) AO JOGO 70!! ####");
		System.out.println("###################################");
		
		System.out.println("\nVAMOS COMEÇAR!");
		System.out.println("###################################");
		
		System.out.print("\nINFORME O NOME DO PERSONAGEM: ");
		personagem.setNome(keyboard.nextLine());
		System.out.print("INFORME O SEXO DO PERSONAGEM (F/M): ");
		personagem.setSexo(keyboard.next().charAt(0));
		System.out.print("INFORME A IDADE DO PERSONAGEM: ");
		personagem.setIdade(keyboard.nextInt());
		System.out.print("INFORME A ALTURA DO PERSONAGEM: ");
		personagem.setAltura(keyboard.nextDouble());
		personagem.CabeloEBarba(keyboard);
		raca.tiposDeRaca(keyboard);
		
		
		// Teste
		System.out.println("Teste:");
		System.out.println("Nome do personagem: " + personagem.getNome());
		System.out.println("Sexo do personagem: " + personagem.getSexo());
		System.out.println("Idade do personagem: " + personagem.getIdade());
		System.out.println("Tamanho do cabelo: " + personagem.getCabeloTamanho());
		System.out.println("Cor do cabelo: " + personagem.getCabeloCor());
		System.out.println("Tamanho da Barba: " + personagem.getBarbaTamanho());
		System.out.println("Cor da Barba: " + personagem.getBarbaCor());
		System.out.println("Raça do personagem: " + raca.getRaca());
		
		keyboard.close();

	}

}
