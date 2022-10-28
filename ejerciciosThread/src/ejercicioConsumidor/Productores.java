package ejercicioConsumidor;

public class Productores extends Thread{

	private String nombre;
	private Buffer buffer;

	public Productores(String nombre, Buffer buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			buffer.anhadirEntero((int)(Math.random() * 100),nombre);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
