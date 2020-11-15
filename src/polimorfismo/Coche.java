package polimorfismo;

public class Coche extends Vehiculo {

	private int numeroPuertas;

	public Coche(String matric, int numPuertas) {
		super(matric);
		numeroPuertas = numPuertas;
	}

	public int totalPuertas() {
		return numeroPuertas;
	}

}
