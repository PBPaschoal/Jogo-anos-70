package monstros;

public class Monstro {
	
	protected String nome;
    protected int hp;
    protected double xp;
    protected String[] drops;

    public Monstro(String nome, int hp, double xp, String[] drops) {
        this.nome = nome;
        this.hp = hp;
        this.xp = xp;
        this.drops = drops;
    }

    public void atacar() {
        System.out.println(nome + " atacou!");
    }

    public void receberDano(int dano) {
        hp -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano.");
    }

    public double getXp() {
        return xp;
    }

    public String[] getDrops() {
        return drops;
    }
}
