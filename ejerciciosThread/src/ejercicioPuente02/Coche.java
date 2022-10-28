package ejercicioPuente02;

public class Coche extends Thread{

	private int idCoche;
	private Puente puente;
	private int kg;
	
	public Coche(int idCoche, Puente puente) {
		super();
		this.idCoche = idCoche;
		this.puente = puente;
		this.kg = (int)(Math.random()*1000);
	}

	public int getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public void run()	{
		puente.cruzar(this);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		puente.salir(this);
	}
}
