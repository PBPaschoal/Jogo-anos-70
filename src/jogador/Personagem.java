package jogador;

import java.util.Scanner;

public class Personagem {
	
	private String nome;
	private String cabeloTamanho;
	private String barbaTamanho;
	private String cabeloCor;
	private String barbaCor;
	private char sexo;
	private int idade;
	private double altura;
	
	// Criando os construtores
	public Personagem() {
	}
	
	public Personagem(String nome, String cabeloTamanho, String barbaTamanho, String cabeloCor, String barbaCor, char sexo, int idade, double altura) {
		this.nome = nome;
		this.cabeloTamanho = cabeloTamanho;
		this.barbaTamanho = barbaTamanho;
		this.cabeloCor = cabeloCor;
		this.barbaCor = barbaCor;
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
	
	public String getCabeloCor() {
		return cabeloCor;
	}
	
	public void setCabeloCor(String cabeloCor) {
		this.cabeloCor = cabeloCor;
	}
	
	public String getBarbaCor() {
		return barbaCor;
	}
	
	public void setBarbaCor(String barbaCor) {
		this.barbaCor = barbaCor;
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
	public void CriarPersonagem(Scanner keyboard) {
		System.out.print("\nINFORME O NOME DO PERSONAGEM: ");
		setNome(keyboard.nextLine());
		System.out.print("INFORME O SEXO DO PERSONAGEM (F/M): ");
		setSexo(keyboard.next().charAt(0));
		System.out.print("INFORME A IDADE DO PERSONAGEM: ");
		setIdade(keyboard.nextInt());
		System.out.print("INFORME A ALTURA DO PERSONAGEM: ");
		setAltura(keyboard.nextDouble());
		CabeloEBarba(keyboard);
	}
	
	// Metodo para pintar a cor do cabelo
	public void CorDoCabelo(Scanner keyboard) {
		System.out.print("ESCOLHA A COR DO CABELO: ");
		System.out.println("\n [1] PRETO\n [2] LOIRO\n [3] RUIVO\n [4] AZUL\n [5] CINZA\n [6] MARROM\n [7] ROSA\n [8] LARANJA\n [9] VERDE\n [10] BRANCO");
		int opcao = keyboard.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("- VOCÊ ESCOLHEU: CABELO PRETO");
				setCabeloCor("PRETO");
				break;
			case 2:
				System.out.println("- VOCÊ ESCOLHEU: CABELO LOIRO");
				setCabeloCor("LOIRO");
				break;
			case 3:
				System.out.println("- VOCÊ ESCOLHEU: CABELO RUIVO");
				setCabeloCor("RUIVO");
				break;
			case 4:
				System.out.println("- VOCÊ ESCOLHEU: CABELO AZUL");
				setCabeloCor("AZUL");
				break;
			case 5:
				System.out.println("- VOCÊ ESCOLHEU: CABELO CINZA");
				setCabeloCor("CINZA");
				break;
			case 6:
				System.out.println("- VOCÊ ESCOLHEU: CABELO MARROM");
				setCabeloCor("MARROM");
				break;
			case 7:
				System.out.println("- VOCÊ ESCOLHEU: CABELO  ROSA");
				setCabeloCor("ROSA");
				break;
			case 8:
				System.out.println("- VOCÊ ESCOLHEU: CABELO LARANJA");
				setCabeloCor("LARANJA");
				break;
			case 9:
				System.out.println("- VOCÊ ESCOLHEU: CABELO VERDE");
				setCabeloCor("VERDE");
				break;
			case 10:
				System.out.println("- VOCÊ ESCOLHEU: CABELO BRANCO");
				setCabeloCor("BRANCO");
				break;
			default:
				System.out.println("- OPÇÃO INVALIDA! TENTE NOVAMENTE\n");
				CorDoCabelo(keyboard);
				break;
		}
	}
	
	// Metodo para pintar a cor da barba
	public void CorDaBarba(Scanner keyboard) {
		System.out.print("ESCOLHA A COR DA BARBA: ");
		System.out.println("\n [1] PRETO\n [2] LOIRO\n [3] RUIVO\n [4] AZUL\n [5] CINZA\n [6] MARROM\n [7] ROSA\n [8] LARANJA\n [9] VERDE\n [10] BRANCO");
		int opcao = keyboard.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("- VOCÊ ESCOLHEU: BARBA PRETA");
				setBarbaCor("PRETA");
				break;
			case 2:
				System.out.println("- VOCÊ ESCOLHEU: BARBA LOIRA");
				setBarbaCor("LOIRA");
				break;
			case 3:
				System.out.println("- VOCÊ ESCOLHEU: BARBA RUIVA");
				setBarbaCor("RUIVA");
				break;
			case 4:
				System.out.println("- VOCÊ ESCOLHEU: BARBA AZUL");
				setBarbaCor("AZUL");
				break;
			case 5:
				System.out.println("- VOCÊ ESCOLHEU: BARBA CINZA");
				setBarbaCor("CINZA");
				break;
			case 6:
				System.out.println("- VOCÊ ESCOLHEU: BARBA MARROM");
				setBarbaCor("MARROM");
				break;
			case 7:
				System.out.println("- VOCÊ ESCOLHEU: BARBA ROSA");
				setBarbaCor("ROSA");
				break;
			case 8:
				System.out.println("- VOCÊ ESCOLHEU: BARBA LARANJA");
				setBarbaCor("LARANJA");
				break;
			case 9:
				System.out.println("- VOCÊ ESCOLHEU: BARBA VERDE");
				setBarbaCor("VERDE");
				break;
			case 10:
				System.out.println("- VOCÊ ESCOLHEU: BARBA BRANCA");
				setBarbaCor("BRANCA");
				break;
			default:
				System.out.println("- OPÇÃO INVALIDA! TENTE NOVAMENTE\n");
				CorDaBarba(keyboard);
				break;
		}
	}
	
	
	// Metodo para escolher o tamanho do cabelo e barba (E também chamar o metodo para pintar o cabelo e barba)
	public void CabeloEBarba(Scanner keyboard) {
		System.out.print("ESCOLHA O TAMANHO DO SEU CABELO: ");
		System.out.println("\n [1] LONGO\n [2] CURTO\n [3] CARECA");
		int opcao = keyboard.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("- VOCÊ ESCOLHEU: CABELOS LONGOS");
				setCabeloTamanho("LONGOS");
				break;
			case 2:
				System.out.println("- VOCÊ ESCOLHEU: CABELOS CURTOS");
				setCabeloTamanho("CURTOS");
				break;
			case 3:
				System.out.println("- VOCÊ ESCOLHEU: CARECA");
				setCabeloTamanho("CARECA");
				break;
			default:
				System.out.println("- OPÇÃO INVALIDA! TENTE NOVAMENTE\n");
				CabeloEBarba(keyboard);
				break;
		}
		if(opcao == 1 || opcao == 2) {
			CorDoCabelo(keyboard); //Chamar o metodo para pintar o cabelo
		}
		
		do {
			if(sexo == 'M') {
				opcao = 0;
				System.out.println("\nESCOLHA O TAMANHO DA SUA BARBA: ");
				System.out.println("\n [1] LONGA\n [2] CURTA\n [3] SEM BARBA");
				opcao = keyboard.nextInt();
				switch(opcao) {
					case 1:
						System.out.println("- VOCÊ ESCOLHEU: BARBA LONGA");
						setBarbaTamanho("LONGA");
						break;
					case 2:
						System.out.println("- VOCÊ ESCOLHEU: BARBA CURTA");
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
			}
		} while (opcao < 1 && opcao > 3);
		if(opcao == 1 || opcao == 2) {
			CorDaBarba(keyboard); //Chamar o metodo para pintar a cor da barba
		}
	}
}
