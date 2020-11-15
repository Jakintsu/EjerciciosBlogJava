package Herencia;

public class PoligonoMain {

	public static void main(String[] args) {

		Punto[] verti = { new Punto(0, 0), new Punto(2, 0), new Punto(2, 2), new Punto(2, 0) };
		Poligono poligonoPrueba;

		poligonoPrueba = new Poligono(verti);
		System.out.println(poligonoPrueba);
		System.out.println("Perimetro: " + poligonoPrueba.perimetro());
		poligonoPrueba.trasladar(4, -3);
		System.out.println("Perimetro: " + poligonoPrueba.perimetro());
		System.out.println(poligonoPrueba);
		poligonoPrueba.escalar(3, 4);
		System.out.println(poligonoPrueba);
		System.out.println("Perimetro: " + poligonoPrueba.perimetro());

	}

}
