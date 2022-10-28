package ejercicioDiscoteca;

public class Chico extends Thread{
	
	private Ba�o ba�oAsign;

	public Chico(Ba�o ba�oAsign) {
		super();
		this.ba�oAsign = ba�oAsign;
	}
	
	@Override
	public void run() {
		ba�oAsign.entra_chico();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ba�oAsign.sale_chico();
	}
}
