package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {

		Carro ferrari = new Carro ("00000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();

		System.out.println("------------------------");

		Onibus marcopolo = new Onibus("11111","XBI","Prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();


		System.out.println("------------------------");

		Carro porsche = new Carro ("11111", "F1", "Rosa", 2024);
		porsche.ligar();
		porsche.acelerar();
		porsche.virar();
		porsche.frear();


		System.out.println("------------------------");

		Moto biz = new Moto("22222","XBI","Branca",2021);
		biz.ligar();
		biz.acelerar();
		biz.virar();
		biz.frear();

	}

}
