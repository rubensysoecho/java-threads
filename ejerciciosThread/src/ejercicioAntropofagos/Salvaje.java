package ejercicioAntropofagos;

public class Salvaje extends Thread{

	private int idSalvaje;
	private Olla ollaAsign;

	public Salvaje(int idSalvaje, Olla ollaAsign) {
		super();
		this.idSalvaje = idSalvaje;
		this.ollaAsign = ollaAsign;
	}

	public int getIdSalvaje() {
		return idSalvaje;
	}
	
	@Override
	public void run() {
		while(true)	{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ollaAsign.comer(this); 
		}
	}
}
