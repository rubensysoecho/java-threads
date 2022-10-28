package ejercicioPastas;

public class Main {

	public static void main(String[] args) {
		
		Mostrador mostrador = new Mostrador();
		Horno hornoA = new Horno(3, mostrador);
		Horno hornoB = new Horno(7, mostrador);
		Horno hornoC = new Horno(10, mostrador);
		Caja caja = new Caja();
		Empaquetador empaquetador = new Empaquetador(caja, mostrador);
		Brazo brazo = new Brazo(caja);
		
		hornoA.start();
		hornoB.start();
		hornoC.start();
		empaquetador.start();
		brazo.start();
	}
}
