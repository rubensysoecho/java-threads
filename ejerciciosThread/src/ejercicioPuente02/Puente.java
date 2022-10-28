package ejercicioPuente02;

public class Puente {

	private int numCoches;
	private int kg;
	
	public Puente()	{ numCoches = 0; kg = 0; }
	
	public synchronized void cruzar(Coche coche)	{
		while(numCoches == 3 && kg < 3000)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		numCoches++;
		kg += coche.getKg();
		System.out.println("Coche " + coche.getIdCoche() + " de "+ coche.getKg() + "kg " +"está cruzando...");
	}
	
	public synchronized void salir(Coche coche)	{
		numCoches--;
		kg -= coche.getKg();
		System.out.println("Coche " + coche.getIdCoche() + " ha cruzado.");
		notifyAll();
	}
}
