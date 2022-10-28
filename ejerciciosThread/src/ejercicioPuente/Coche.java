package ejercicioPuente;

public class Coche extends Thread{

	private int id;
	private Puente puente;
	
	public Coche(int id, Puente puente) {
		super();
		this.id = id;
		this.puente = puente;
	}

	public void run()	{
		puente.cruzar(id);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		puente.salir(id);
	}
}
