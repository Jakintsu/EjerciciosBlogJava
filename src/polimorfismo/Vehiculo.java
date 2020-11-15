package polimorfismo;

public class Vehiculo {

	private String matricula;
	private double velocidad;

	public Vehiculo(String matric) {
		this.matricula = matric;
		this.velocidad = 0;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public void acelerar(double cantidad) throws DemasiadoRapidoException {
		velocidad += cantidad;
	}

	public String toString() {
		return "El vehículo con matrícula " + matricula + " va a velocidad de " + velocidad + "km/h";	
	}
}
