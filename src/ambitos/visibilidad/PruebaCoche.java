package ambitos.visibilidad;

import java.util.Scanner;

public class PruebaCoche {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Coche coche;
		String matricula;
		String respuesta;
		System.out.println("Tu matrícula es: ");
		matricula = lector.nextLine();
		System.out.println("¿Tiene cambio automático (s/n)");
		respuesta = lector.nextLine();
		if (respuesta.charAt(0) == 's' || respuesta.charAt(0) == 'S') {
			coche = new CocheCambioAutomatico(matricula);
		} else {
			coche = new CocheCambioManual(matricula);
		}

		System.out.println(coche);
		coche.acelerar(60);
		if (coche instanceof CocheCambioManual) {
			((CocheCambioManual) coche).cambiaMarcha(3);
		}

		System.out.println(coche);
	}

}
