package jogador;

public class Level {

	private int levelJogador;
	
	public Level() {
	}
	
	public Level(int levelJogador) {
		this.levelJogador = levelJogador;
	}

	public int getLevelJogador() {
		return levelJogador;
	}
	
	//Metodo para upar de level!
	public void UP(){
		Experiencia experiencia = new Experiencia();
		if(experiencia.getXpJogador() >= experiencia.getLimiteXPLevel()){
			levelJogador++;
		}
	}

}
