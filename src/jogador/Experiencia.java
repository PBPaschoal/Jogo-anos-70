package jogador;

import monstros.Monstro;

public class Experiencia {

	private double xpJogador;
	private double limiteXPLevel;
	
	public Experiencia() {
	}
	
	public Experiencia(double xpJogador, double limiteXPLevel) {
		this.xpJogador = xpJogador;
		this.limiteXPLevel = limiteXPLevel;
	}

	public double getXpJogador() {
		return xpJogador;
	}

	public double getLimiteXPLevel() {
		return limiteXPLevel;
	}
	
	
	
	
	
}
