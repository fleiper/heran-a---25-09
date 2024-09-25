package Herenca;

public class PrincipalAutomoveis {

	public static void main(String[] args) {
		Automoveis veiculos = new Automoveis ("Buzão", "ferro-velho", 2020, "azul");
		System.out.println("Veiculo:");
		System.out.println("marca:"+veiculos.getmodelo());
		System.out.println("modelo:"+veiculos.getmodelo());
		System.out.println("ano:"+veiculos.getano());
		System.out.println("cor:"+veiculos.getcor());
		System.out.println("================================");
		//pessoafisica
		Carro carro = new Carro ("omega","?", 2015, "preto", 4,"2.5");
		System.out.println("Veiculo:");
		System.out.println("marca:"+carro.getmarca());
		System.out.println("modelo:"+carro.getmodelo());
		System.out.println("ano:"+carro.getano());
		System.out.println("cor:"+carro.getcor());
		System.out.println("numeroPorta:"+carro.getnumeroPorta());
		System.out.println("motor:"+carro.getmotor());
		System.out.println("================================");
		//pessoajuridica
		Moto moto = new Moto("bis", "hilux",2000, "NÃO TEMOS", 2);
		System.out.println("Veiculo:");
		System.out.println("marca:"+moto.getmarca());
		System.out.println("modelo:"+moto.getmodelo());
		System.out.println("ano:"+moto.getano());
		System.out.println("cor:"+moto.getcor());
		System.out.println("cilindrada:"+moto.getcilindrada());
	}

}

