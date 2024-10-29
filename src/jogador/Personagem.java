package jogador;

import java.util.Scanner;

public class Personagem {
	
	private String nome;
	private String cabeloTamanho;
	private String barbaTamanho;
	private String cor;
	private char sexo;
	private int idade;
	private double altura;
	
	// Criando os construtores
	public Personagem() {
	}
	
	public Personagem(String nome, String cabeloTamanho, String barbaTamanho, String cor, char sexo, int idade, double altura) {
		this.nome = nome;
		this.cabeloTamanho = cabeloTamanho;
		this.barbaTamanho = barbaTamanho;
		this.cor = cor;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}
	
	// Criando get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCabeloTamanho() {
		return cabeloTamanho;
	}

	public void setCabeloTamanho(String cabeloTamanho) {
		this.cabeloTamanho = cabeloTamanho;
	}
	
	public String getBarbaTamanho() {
		return barbaTamanho;
	}

	public void setBarbaTamanho(String barbaTamanho) {
		this.barbaTamanho = barbaTamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	//Método
	//Criar personagem
	public void criarPersonagem(Scanner keyboard) {
		System.out.print("\nINFORME O NOME DO PERSONAGEM: ");
		setNome(keyboard.nextLine());
		System.out.print("INFORME O SEXO DO PERSONAGEM (F/M): ");
		setSexo(keyboard.next().charAt(0));
		System.out.print("INFORME A IDADE DO PERSONAGEM: ");
		setIdade(keyboard.nextInt());
		System.out.print("INFORME A ALTURA DO PERSONAGEM: ");
		setAltura(keyboard.nextDouble());
		cabeloEBarba(keyboard);
	}
	
	//Cor cabelo e barba
	public void escolherCor(Scanner keyboard, String tipoCor) {
		System.out.print("ESCOLHA A COR DA " + tipoCor + ": ");
	    System.out.println("\n [1] PRETO\n [2] LOIRO\n [3] RUIVO\n [4] AZUL\n [5] CINZA\n [6] MARROM\n [7] ROSA\n [8] LARANJA\n [9] VERDE\n [10] BRANCO");
	    int opcao = keyboard.nextInt();
	    switch(opcao) {
	        case 1: setCor("PRETO"); break;
	        case 2: setCor("LOIRO"); break;
	        case 3: setCor("RUIVO"); break;
	        case 4: setCor("AZUL"); break;
	        case 5: setCor("CINZA"); break;
	        case 6: setCor("MARROM"); break;
	        case 7: setCor("ROSA"); break;
	        case 8: setCor("LARANJA"); break;
	        case 9: setCor("VERDE"); break;
	        case 10: setCor("BRANCO"); break;
	        default: 
	            System.out.println("- OPÇÃO INVALIDA! TENTE NOVAMENTE\n");
	            escolherCor(keyboard, tipoCor);
	            break;
	    }
	    System.out.println("VOCÊ ESCOLHEU " + tipoCor + " " + getCor());
	}
	
	
	// Metodo para escolher o tamanho do cabelo e barba (E também chamar o metodo para pintar o cabelo e barba)
	public void cabeloEBarba(Scanner keyboard) {
		System.out.print("ESCOLHA O TAMANHO DO SEU CABELO: ");
		System.out.println("\n [1] LONGO\n [2] CURTO\n [3] CARECA");
		int opcao = keyboard.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("LONGOS");
				setCabeloTamanho("LONGOS");
				break;
			case 2:
				System.out.println("CURTOS");
				setCabeloTamanho("CURTOS");
				break;
			case 3:
				System.out.println("- VOCÊ ESCOLHEU: CARECA");
				setCabeloTamanho("CARECA");
				break;
			default:
				System.out.println("- OPÇÃO INVALIDA! TENTE NOVAMENTE\n");
				cabeloEBarba(keyboard);
				break;
		}
		if(opcao == 1 || opcao == 2) {
			System.out.println("- VOCÊ ESCOLHEU: CABELOS " + getCabeloTamanho());
			escolherCor(keyboard, "CABELO"); //Chamar o metodo para pintar o cabelo
		}
		
		do {
			if(sexo == 'M') {
				opcao = 0;
				System.out.println("\nESCOLHA O TAMANHO DA SUA BARBA: ");
				System.out.println("\n [1] LONGA\n [2] CURTA\n [3] SEM BARBA");
				opcao = keyboard.nextInt();
				switch(opcao) {
					case 1:
						System.out.println("LONGA");
						setBarbaTamanho("LONGA");
						break;
					case 2:
						System.out.println("CURTA");
						setBarbaTamanho("CURTA");
						break;
					case 3:
						System.out.println("- VOCÊ ESCOLHEU: SEM BARBA");
						setBarbaTamanho("SEM");
						break;
					default:
						System.out.println("- OPÇÃO INVALIDA! TENTE NOVAMENTE\n");
						break;
				}
				if(opcao == 1 || opcao == 2) {
					System.out.println("- VOCÊ ESCOLHEU: BARBA " + getBarbaTamanho());
					escolherCor(keyboard, "BARBA"); //Chamar o metodo para pintar a cor da barba
				}
			}
		} while (opcao < 1 && opcao > 3);
	}
}
