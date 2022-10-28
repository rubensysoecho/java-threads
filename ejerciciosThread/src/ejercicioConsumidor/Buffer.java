package ejercicioConsumidor;

import java.util.ArrayList;

public class Buffer {

	private ArrayList<Integer> listaEnteros;

	public Buffer()	{
		listaEnteros = new ArrayList<Integer>();
	}

	public synchronized void anhadirEntero(int entero,String nombre){
		while(listaEnteros.size()==5)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		listaEnteros.add(entero);
		System.out.println(entero + " añadido al buffer por "+nombre);
		notifyAll();
	}

	public synchronized  void cogerNumero(String nombre)	{
		while(listaEnteros.size()==0)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		Integer num=listaEnteros.remove(listaEnteros.size()-1);
		System.out.println("Número " + num + " cogido. por "+nombre);
		notifyAll();

	}
}
