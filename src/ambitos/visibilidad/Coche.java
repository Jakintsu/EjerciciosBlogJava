package ambitos.visibilidad;

public class Coche {
	private String matricula;
	private double velocidad;
	private int marcha;

	public Coche(String matricula) {
		this.matricula = matricula;
		velocidad = 0;
		marcha = 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void acelerar(int cantidad) {
		if (cantidad < 0) {
			frenar(-cantidad);
		} else {
			velocidad += cantidad;
		}
	}

	public void frenar(int cantidad) {
		if (cantidad < 0) {
			acelerar(-cantidad);
		} else {
			velocidad -= cantidad;
			if (velocidad < 0) {
				velocidad = 0;
			}
		}
	}

	protected void cambiaMarcha(int marcha) {
		this.marcha = marcha;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public String toString() {
		return "Matricula: " + matricula + "\nVelocidad: " + velocidad + "\nMarcha: " + marcha;
	}

}


	
	
	
	

