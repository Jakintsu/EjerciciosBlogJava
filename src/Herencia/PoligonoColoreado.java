package Herencia;

import java.awt.Color;

public class PoligonoColoreado extends Poligono {
	private Color color;

	public PoligonoColoreado(Punto[] vert, Color color) {
		super(vert);

		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString() {
		return "Polígono con color: " + color + "\n" + super.toString();	
	}

}
