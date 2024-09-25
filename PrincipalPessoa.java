package Herenca;

public class PrincipalPessoa {

	public static void main(String[] args) {
		//pessoa
		Pessoa cara = new Pessoa ("Fellipe Raszejas", "(15)99665-6962");
		System.out.println("Pessoa:");
		System.out.println("Nome:"+cara.getnome());
		System.out.println("Telefone:"+cara.gettelefone());
		System.out.println("================================");
		//pessoafisica
		PessoaFisica existe = new PessoaFisica ("Max Rocha","(15) 99602-6923", "508.209.568-48", "69.254.???-09");
		System.out.println("Pessoa Fisica");
		System.out.println("Nome:"+existe.getnome());
		System.out.println("Telefone:"+existe.gettelefone());
		System.out.println("CPF"+existe.getcpf());
		System.out.println("RG"+existe.getrg());
		System.out.println("================================");
		//pessoajuridica
		PessoaJuridica empresa = new PessoaJuridica("JGT", "3213-5519", "NÃO TEMOS");
		System.out.println("Pessoa Juridica / empresa");
		System.out.println("Empresa"+empresa.getnome());
		System.out.println("Telefone:"+empresa.gettelefone());
		System.out.println("CNPJ"+empresa.getcnpj());
		
	}

}
