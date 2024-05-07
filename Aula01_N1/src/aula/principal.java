package aula;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando um objeto da classe veiculos
		veiculos fusca = new veiculos();
		
		// Definindo as características
		fusca.marca = "Volkswagem";
		fusca.modelo = "Fusca 1600";
		fusca.placa = "AAA-1234";
		fusca.cor = "Azul";
		fusca.ano = 1975;
		
		// Executando funções
		fusca.ligar();
		fusca.acelerar();
		fusca.frear();
		fusca.desligar();
		
		veiculos brasilia = new veiculos();
		
		brasilia.modelo = "Brasilia Amarela";
		
		brasilia.ligar();
		brasilia.acelerar();
		brasilia.frear();
		brasilia.desligar();
	}
}
