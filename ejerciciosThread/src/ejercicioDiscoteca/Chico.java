package ejercicioDiscoteca;

public class Chico extends Thread{
	
	private Baño bañoAsign;

	public Chico(Baño bañoAsign) {
		super();
		this.bañoAsign = bañoAsign;
	}
	
	@Override
	public void run() {
		bañoAsign.entra_chico();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bañoAsign.sale_chico();
	}
}
