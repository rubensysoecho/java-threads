package ejercicioAntropofagos;

public class Olla {

	private int misioneros;
	private int misioneros_max;
	
	public Olla(int misioneros_max) {
		super();
		this.misioneros_max = misioneros_max;
	}

	public synchronized void comer(Salvaje salvaje)	{
		while(misioneros == 0)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		misioneros--;
		System.out.println("El salvaje " + salvaje.getIdSalvaje() + " come un misionero.");
		notifyAll();
	}
	
	public synchronized void rellenar(Cocinero cocinero)	{
		while(misioneros != 0 || misioneros == misioneros_max)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		misioneros++;
		System.out.println("El cocinero " + cocinero.getIdCocinero() + " deja un misionero.");
		notifyAll();
	}
}
