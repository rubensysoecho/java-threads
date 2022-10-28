package ejercicioPastas;

public class Horno extends Thread{

	private int pesoProducido;
	private Mostrador mostrador;
	
	public Horno(int pesoProducido, Mostrador mostrador) {
		super();
		this.pesoProducido = pesoProducido;
		this.mostrador = mostrador;
	}

	@Override
	public void run() {
		while(true)	{
			mostrador.anhadir(new Pasta(pesoProducido));
			System.out.println("Pasta de " + pesoProducido + "g creada.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
