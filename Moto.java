package Herenca;

public class Moto extends Automoveis {
	private int cilindrada;
	
	public Moto(String marca, String modelo,int ano,String cor, int cilindrada) {
		super (marca, modelo, ano, cor);
		this.cilindrada = cilindrada;
	}
	public int getcilindrada() {
		return cilindrada;
	}
	public void setcilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	
}
}
