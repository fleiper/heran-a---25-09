package Herenca;

public class Carro extends Automoveis {
	private int numeroPorta;
	private String motor;

	public Carro (String marca,String modelo,int ano, String cor, int numeroPorta, String motor) {
		super (marca, modelo, ano, cor);
		this.numeroPorta = numeroPorta;
		this.motor = motor;
	}
	public int getnumeroPorta() {
		return numeroPorta;
	}
	public void setnumeroPorta(int numeroPorta) {
		this.numeroPorta = numeroPorta;
	}
	public String getmotor() {
		return motor;
	}
	public void setmotor(String motor) {
		this.motor = motor;
	}
}
