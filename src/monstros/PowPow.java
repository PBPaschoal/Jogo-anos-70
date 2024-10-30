package monstros;

public class PowPow extends Monstro {
	
	public PowPow() {
        super("PowPow", 100, 500, new String[]{"Gosma", "Ouro"});
    }

    @Override
    public void atacar() {
        System.out.println("O " + nome + " cospe gosma!");
    }

}
