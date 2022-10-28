package ejercicioFumador;

public class Mesa {

	private String ingr1;
	private String ingr2;
	private boolean vacia;

	public Mesa()	{
		ingr1 = "";
		ingr2 = "";
		vacia = true;
	}

	public synchronized void coger_ingredientes(String nombreFumador, String ingrediente_que_tiene)		{
		while(vacia || ingr1.equals(ingrediente_que_tiene) || ingr2.equals(ingrediente_que_tiene))	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nombreFumador + " coge " + ingr1 + " y " + ingr2 + " y fuma.");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		vacia = true;
		notifyAll();
	}

	public synchronized void colocar_ingredientes(String ingrediente1, String ingrediente2)	{
		while(!vacia)	{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
