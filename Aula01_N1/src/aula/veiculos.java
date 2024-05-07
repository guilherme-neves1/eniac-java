package aula;

public class veiculos {
	// Atributos da Classe => Características / Variáveis
	String placa, marca, modelo, cor;
	int ano;
	
	// Métodos da Classe
	public int ligar() {
		System.out.print("Ligando o carro " + modelo + "\n");
		return 0;
	}
	
	public int desligar() {
		System.out.print("Desligando o carro! \n");
		return 0;
	}
	
	public int acelerar() {
		System.out.print("Acelerando o carro! \n");
		return 0;
	}
	
	public int frear() {
		System.out.print("Freando o carro! \n");
		return 0;
	}
}
