package ejercicioFumador;

public class Agente extends Thread{

	private Mesa mesa;
	private String ingredientes[];
	
	public Agente(Mesa mesa) {
		super();
		this.mesa = mesa;
		ingredientes = new String[3];
		ingredientes[0] = "paper";
		ingredientes[1] = "tabaco";
		ingredientes[2] = "cerillas";
	}
	
	public void run()	{
		while(true)	{
			int aleatorio =(int) Math.random() * 3;
			String ingrediente1 = ingredientes[aleatorio];
			aleatorio = (int) Math.random()*3;
			while(ingredientes[aleatorio].equals(ingrediente1))	{
				aleatorio = (int) Math.random()*3;
				String ingrediente2 = ingredientes[aleatorio];
			}
		}
	}
	
}
