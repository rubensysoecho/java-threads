package ejercicioDiscoteca;

public class Chica extends Thread{

	private Ba�o ba�oAsign;
	
	public Chica(Ba�o ba�oAsign) {
		super();
		this.ba�oAsign = ba�oAsign;
	}

	@Override
	public void run() {
		ba�oAsign.entra_chica();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ba�oAsign.sale_chica();
	}
}
