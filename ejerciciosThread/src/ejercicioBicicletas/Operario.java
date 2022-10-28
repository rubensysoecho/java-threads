package ejercicioBicicletas;

public class Operario extends Thread{

	private int id;
	private boolean construir_ruedas;
	private Almacen almacen_asignado;
	
	public Operario(int id, boolean construir_ruedas, Almacen almacen_asignado) {
		super();
		this.id = id;
		this.construir_ruedas = construir_ruedas;
		this.almacen_asignado = almacen_asignado;
	}

	@Override
	public void run() {
		while(almacen_asignado.num_bicicletas() != 8)	{
			if (construir_ruedas) {
				almacen_asignado.construir_rueda();
			}else {
				almacen_asignado.construir_marco();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
