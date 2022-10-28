package ejercicioFumador;

public class Fumador extends Thread{

	private String nombre;
	private Mesa mesa;
	private String ingrediente_que_tiene;
	
	public Fumador(String nombre, Mesa mesa, String ingrediente_que_tiene) {
		super();
		this.nombre = nombre;
		this.mesa = mesa;
		this.ingrediente_que_tiene = ingrediente_que_tiene;
	}
	
	public void run()	{
		while(true)	{
			mesa.coger_ingredientes(nombre, ingrediente_que_tiene);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
