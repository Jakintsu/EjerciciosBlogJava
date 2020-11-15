package Herencia;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distancia(Punto p) {
		double distanciaX = p.getX() - x;
		double distanciaY = p.getY() - y;

		return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
