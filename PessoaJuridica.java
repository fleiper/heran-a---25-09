package Herenca;

public class PessoaJuridica extends Pessoa {
private String cnpj;
	
	public PessoaJuridica (String nome, String telefone, String cnpj) {
		super (nome, telefone);
		this.cnpj = cnpj;
		
	}
	public String getcnpj() {
		return cnpj;
	}
	public void setcpf(String cnpj) {
		this.cnpj = cnpj;
	}
}
