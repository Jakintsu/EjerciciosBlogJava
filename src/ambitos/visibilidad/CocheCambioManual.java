package ambitos.visibilidad;

public class CocheCambioManual extends Coche {

	public CocheCambioManual(String matricula) {
		// Llamada al constructor de la superclase
		super(matricula);
	}

	// Se sobreescribe con un modificador de acceso público
	@Override
	public void cambiaMarcha(int marcha) {
		if (marcha < 0) {
			throw new IllegalArgumentException();
		}
		super.cambiaMarcha(marcha);
	}
}