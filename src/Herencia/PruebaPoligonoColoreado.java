package Herencia;

import java.awt.Color;

public class PruebaPoligonoColoreado {

	public static void main(String[] args) {

		Punto[] vert = { new Punto(0, 0), new Punto(2, 0), new Punto(2, 2), new Punto(0, 2) };
		PoligonoColoreado miPoligono = new PoligonoColoreado(vert, Color.RED);
		System.out.println(miPoligono);
		System.out.println("Perimetro: " + miPoligono.perimetro());
		miPoligono.trasladar(6, -4);
		miPoligono.setColor(Color.GREEN);
		System.out.println(miPoligono);

	}

}
