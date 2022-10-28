package ejercicioConsumidor;

public class Main {

	public static void main(String[] args) {
		
		Buffer buffer = new Buffer();
		Productores prod1 = new Productores("Productor 1",buffer);
		Productores prod2 = new Productores("Productor 2",buffer);
		Consumidores cons1 = new Consumidores("Consumidor 1", buffer);
		Consumidores cons2 = new Consumidores("Consumidor 2", buffer);
		
		prod1.start();
		prod2.start();
		cons1.start();
		cons2.start();
	}
}
