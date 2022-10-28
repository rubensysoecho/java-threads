package ejercicioCajero;

public class Cliente extends Thread{

	private String nombre;
	private double dinero;
	private Cajero cajero;
	private boolean ingresar;

	public Cliente(String nombre, Cajero cajero, boolean ingresar) {
		super();
		this.nombre = nombre;
		this.cajero = cajero;
		this.ingresar = ingresar;
		dinero = Math.random()*10000;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public boolean isIngresar() {
		return ingresar;
	}

	public void setIngresar(boolean ingresar) {
		this.ingresar = ingresar;
	}


	public void run()	{
		while(true)	{
			if (ingresar) cajero.ingresar(dinero,this);
			else cajero.retirar(dinero);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
