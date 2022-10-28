package ejercicioPuente;

public class Puente {

	private int numCoches;
	
	public Puente()	{ numCoches = 0; }
	
	public synchronized void cruzar(int idCoche)	{
		while(numCoches == 3)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		numCoches++;
		System.out.println("Coche " + idCoche + " está cruzando...");
	}
	
	public synchronized void salir(int idCoche)	{
		numCoches--;
		System.out.println("Coche " + idCoche + " ha cruzado.");
		notifyAll();
	}
}
