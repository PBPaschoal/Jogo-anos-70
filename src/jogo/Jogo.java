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
		
		personagem.criarPersonagem(keyboard);
		raca.tiposDeRaca(keyboard);
		System.out.println("###################################");
		System.out.println("PERSONAGEM CRIADO COM SUCESSO!!!!!!");
		System.out.println("###################################");
		System.out.println("A SUA AVENTURA COMEÇA AGORA!!!!!!!!");
		
		
		// Teste
		System.out.println("\nTeste:");
		System.out.println("Nome do personagem: " + personagem.getNome());
		System.out.println("Sexo do personagem: " + personagem.getSexo());
		System.out.println("Idade do personagem: " + personagem.getIdade());
		System.out.println("Tamanho do cabelo: " + personagem.getCabeloTamanho());
		System.out.println("Cor do cabelo: " + personagem.getCor());
		if(personagem.getSexo() == 'M') {
			System.out.println("Tamanho da Barba: " + personagem.getBarbaTamanho());
			System.out.println("Cor da Barba: " + personagem.getCor());
		}
		System.out.println("Raça do personagem: " + raca.getRaca());
		
		keyboard.close();

	}

}
