package Herencia;

public class Poligono {

	private Punto[] vertices;

	public Poligono(Punto[] vert) {

		if (vert.length < 3) {
			throw new IllegalArgumentException();
		}

		vertices = vert;
	}

	public void escalar(double x, double y) {
		double valX, valY = 0;

		for (Punto p : vertices) {
			valX = p.getX();
			valX = p.getX();
			p.setX(valX * x);
			p.setY(valY * y);
		}
	}

	public void trasladar(double x, double y) {
		double valX, valY = 0;

		for (Punto p : vertices) {
			valX = p.getX();
			valX = p.getX();
			p.setX(valX + x);
			p.setY(valY + y);
		}
	}

	public double perimetro() {
		double acumulador = 0;
		for (int i = 0; i < vertices.length - 1; i++) {
			acumulador += vertices[i].distancia(vertices[i + 1]);
		}
		acumulador += vertices[0].distancia(vertices[vertices.length - 1]);
		return acumulador;
	}

	public String toString() {
		String cadena = "";
		for (Punto p : vertices) {
			cadena += p + "\n";
		}
		return cadena;
	}
}
