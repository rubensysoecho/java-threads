package ejercicioPastas;

import java.util.ArrayList;

public class Mostrador {

	private ArrayList<Pasta> pastasMostrador; 
	
	public Mostrador()	{ pastasMostrador = new ArrayList<Pasta>(); }
	
	public int tamanhoLista()	{ return pastasMostrador.size(); }
	
	public synchronized void anhadir(Pasta pasta)	{
		pastasMostrador.add(pasta);
		System.out.println("Pasta " + pasta.getId_pasta() + " está pasando por el mostrador...");
		notifyAll();
	}
	
	public synchronized Pasta cogerPasta() {	
		while(pastasMostrador.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("Pasta recogida por el empaquetador.");
		Pasta pasta=pastasMostrador.get(pastasMostrador.size() - 1);
		return pasta;
	}
}
