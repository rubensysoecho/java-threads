package ejercicioPastas;

public class Empaquetador extends Thread{

	private Caja cajaAsignada;
	private Mostrador mostrador;

	public Empaquetador(Caja cajaAsignada, Mostrador mostrador) {
		super();
		this.cajaAsignada = cajaAsignada;
		this.mostrador = mostrador;
	}

	@Override
	public void run() {		
		while(true) {
			Pasta pasta=mostrador.cogerPasta();
			cajaAsignada.colocarPasta(pasta);	
		}
	}
}
