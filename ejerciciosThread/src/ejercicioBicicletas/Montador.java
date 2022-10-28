package ejercicioBicicletas;

public class Montador extends Thread{

	private int id;
	private Almacen almacen_asignado;
	
	public Montador(int id, Almacen almacen_asignado) {
		super();
		this.id = id;
		this.almacen_asignado = almacen_asignado;
	}

	@Override
	public void run() {
		while(almacen_asignado.num_bicicletas() != 8)	{
			almacen_asignado.construir_bicicleta();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
