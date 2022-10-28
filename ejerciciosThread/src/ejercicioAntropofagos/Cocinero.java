package ejercicioAntropofagos;

public class Cocinero extends Thread{

	private int idCocinero;
	private Olla ollaAsign;

	public Cocinero(int idCocinero, Olla ollaAsign) {
		super();
		this.idCocinero = idCocinero;
		this.ollaAsign = ollaAsign;
	}

	public int getIdCocinero() {
		return idCocinero;
	}
	
	@Override
	public void run() {
		while(true)	{
			ollaAsign.rellenar(this); 
		}
	}
}
