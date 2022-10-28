package ejercicioBicicletas;

import java.util.ArrayList;

public class Almacen {

	private ArrayList<Rueda> stock_ruedas;
	private ArrayList<Marco> stock_marcos;
	private ArrayList<Bicicleta> stock_bicicletas;
	
	public Almacen()	{
		stock_ruedas = new ArrayList<Rueda>();
		stock_marcos = new ArrayList<Marco>();
		stock_bicicletas = new ArrayList<Bicicleta>();
	}
	
	public int num_bicicletas()	{
		return stock_bicicletas.size();
	}
	
	public synchronized void construir_rueda()	{
		while(stock_ruedas.size() >= 10)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock_ruedas.add(new Rueda());
		System.out.println("Rueda fabricada y añadida al almacén." );
		notifyAll();
	}
	
	public synchronized void construir_marco()	{
		while (stock_marcos.size() >= 4)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock_marcos.add(new Marco());
		System.out.println("Marco fabricado y añadido al almacén.");
		notifyAll();
	}
	
	public synchronized void construir_bicicleta()	{
		while(stock_marcos.size() < 1 || stock_ruedas.size() < 2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 2; i++) {
			stock_ruedas.remove(stock_ruedas.get(stock_ruedas.size()-1));
		}
		stock_marcos.remove(stock_marcos.get(stock_marcos.size()-1));
		stock_bicicletas.add(new Bicicleta());
		System.out.println("Bicicleta fabricada y añadida al almacén.");
		notifyAll();
	}
}
