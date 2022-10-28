package ejercicioDiscoteca;

public class Chica extends Thread{

	private Baño bañoAsign;
	
	public Chica(Baño bañoAsign) {
		super();
		this.bañoAsign = bañoAsign;
	}

	@Override
	public void run() {
		bañoAsign.entra_chica();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bañoAsign.sale_chica();
	}
}
