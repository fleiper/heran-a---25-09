package Herenca;

public class Automoveis {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;

	public Automoveis (String marca, String modelo, int ano, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	public String getmarca() {
		return marca;
	}
	public void setmarca (String marca) {
		this.marca = marca;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public int getano() {
		return ano;
	}
	public void setano (int ano) {
		this.ano = ano;
	}
	public String getcor() {
		return cor;
	}
	public void setcor (String cor) {
		this.cor = cor;
	}
}