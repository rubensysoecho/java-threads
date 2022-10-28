package ejercicioPastas;

public class Brazo extends Thread{

	private Caja cajaAsignada;

	public Brazo(Caja cajaAsignada) {
		super();
		this.cajaAsignada = cajaAsignada;
	}
	
	@Override
	public void run()	{
		while(true)	{
			cajaAsignada.retirarcaja();
		}
	}
}
