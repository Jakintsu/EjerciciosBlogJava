package almacenamiento;

class MetodosLongitud {

	public String obtenerCadenaMasLarga(String[] arrCadenas) throws IllegalAccessException {
		if (arrCadenas == null) {
			throw new IllegalAccessException("Argumento no válido");
		}
		String cadenaMasLarga = null;
		int longCadenaMasLarga = 0;
		for (String cad : arrCadenas) {
			if (cad != null) {
				if (cad.length() > longCadenaMasLarga) {
					cadenaMasLarga = cad;
					longCadenaMasLarga = cad.length();
				}
			}
		}
		return cadenaMasLarga;

	}

}
