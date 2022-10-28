package ejercicioConsumidor;

public class Consumidores extends Thread{

	private String nombre;
	private Buffer buffer;
	
	
	public Consumidores(String nombre, Buffer buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}
	
	public void run()	{
		
		for (int i = 0; i < 10; i++) {
			buffer.cogerNumero(nombre);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}
}
