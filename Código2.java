public class Main {
	public static void main(String[] args) {
		Moto moto = new Moto("Ducati", "Panigale", 2022, "Rojo");
		Carro carro = new Carro("Lamborghini", "Aventador", 2022, "Gris");

		moto.trucos();
		carro.tráfico();
	}
}

class Vehiculo {
	public String marca;
	public String modelo;
	public int año;
	private String color;

	public Vehiculo(String marca, String modelo, int año, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
}

class Moto extends Vehiculo {
	public Moto(String marca, String modelo, int año, String color) {
		super(marca, modelo, año, color);
	}

	public void trucos() {
		System.out.println("La moto está haciendo trucos.");
	}
}

class Carro extends Vehiculo {
	public Carro(String marca, String modelo, int año, String color) {
		super(marca, modelo, año, color);
	}

	public void tráfico() {
		System.out.println("El carro está atascado en el tráfico.");
	}
}