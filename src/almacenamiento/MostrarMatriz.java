package almacenamiento;

public class MostrarMatriz {

	public void mostrarMatrizId(int[][] matriz) throws IllegalAccessException {
		if (matriz == null) {
			throw new IllegalAccessException("Par�metro no v�lido");
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%2d ", matriz[i][j]);
				System.out.println(matriz[i][j] + (matriz[i][j] < 10 ? " " : "") + " ");
			}
			// Salto de l�nea al terminar de mostrar los elementos de una fila
			System.out.println();
		}
	}

}
