package almacenamiento;

public class CharString {

	public String matrizCharComoString(char[][] matriz) {
		if (matriz == null) {
			throw new IllegalArgumentException("Parámetro no válido");
		}
		String result = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				result += (matriz[i][j] + " ");
			}
			result += "\n";
		}
		return result;	
	}
}
