package ejercicioRepaso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Carrera {

	private boolean pistoletazo;
	private int dorsalMeta;
	private ArrayList<Atleta> podio = new ArrayList<Atleta>();
	
	public synchronized void prepararse()	{
		System.out.println("Preparados!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Listos!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("YA!!");
		pistoletazo = true;
		notifyAll();
	}
	
	public void correr(Atleta atleta)	{
		while(!pistoletazo)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("El atleta " + atleta.getDorsal() + " empieza a correr.");
		DecimalFormat df = new DecimalFormat("#.00");
		double tiempo_corriendo = 9000 + Math.random()*3000;
		try {
			Thread.sleep((long) tiempo_corriendo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dorsalMeta = atleta.getDorsal();
		System.out.println("El atleta " + dorsalMeta + " tardó " + df.format(tiempo_corriendo/1000) + " segundos.");
		atleta.setTiempo_carrera(tiempo_corriendo);
		podio.add(atleta);
	}

	public void mostrar_podio()	{
		try {
			Thread.sleep(13000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Comparador comparador = new Comparador();
		Collections.sort(podio, comparador);
		System.out.println("\nPODIO\n=====");
		for (int i = 0; i < 3; i++) {
			System.out.println(podio.get(i));
		}
	}
}
