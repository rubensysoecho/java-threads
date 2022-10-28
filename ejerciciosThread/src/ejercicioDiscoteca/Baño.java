package ejercicioDiscoteca;

public class Baño {

	private int num_chicos;
	private boolean hay_chica;
	
	public synchronized void entra_chico()	{
		while(num_chicos == 5)	{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		num_chicos++;
		System.out.println("Entra un chico al baño. Hay " + num_chicos + " chicos en total.");
		notifyAll();
	}
	
	public synchronized void sale_chico()	{
		num_chicos--;
		System.out.println("Un chico sale del baño.");
		notifyAll();
	}
	
	public synchronized void entra_chica()	{
		while(hay_chica)	{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		hay_chica = true;
		System.out.println("Entra una chica al baño.");
		notifyAll();
	}
	
	public synchronized void sale_chica()	{
		hay_chica = false;
		System.out.println("Una chica sale del baño.");
		notifyAll();
	}
	
	
	
	
	
	
	
	
}
