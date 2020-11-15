package polimorfismo;

public class VehiculoMain {

	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[4];
		vehiculos[0] = new Coche("BI-2342-AJ", 3);
		vehiculos[1] = new Camion("A1111C");
		vehiculos[2] = new Coche("S4333BC", 4);
		vehiculos[3] = new Camion("555444ABC");

		for (Vehiculo v : vehiculos) {
			if (v instanceof Camion) {
				((Camion) v).ponRemolque(new Remolque(5000));
			}
		}

		for (Vehiculo v : vehiculos) {
			try {
				v.acelerar(80);
			} catch (DemasiadoRapidoException ex) {
				System.out.println("Error: algún vehículo se ha acelerado demasiado");
			}
		}
	}

}
