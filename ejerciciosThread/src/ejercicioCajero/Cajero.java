package ejercicioCajero;

import java.util.ArrayList;

public class Cajero {

	private double dineroDisponible;
	private ArrayList<Cliente> listaClientes;

	public Cajero()	{
		dineroDisponible = 10000;
	}

	public Cajero(Cliente clienteIngreso, Cliente clienteRetirada)	{
		listaClientes.add(clienteIngreso);
		listaClientes.add(clienteRetirada);
	}
	
	public synchronized void ingresar(double dineroIngreso,Cliente cliente)	{
		double dineroGuardado = dineroDisponible;
		dineroDisponible += dineroIngreso;
		System.out.println("INGRESO Fondos del cajero:");
		System.out.println(dineroGuardado + " ---> " + dineroDisponible);
		if (!cliente.isIngresar() && cliente.getDinero() < dineroDisponible) notify();
	}

	public synchronized void retirar(double dineroRetirada)	{
		if (dineroDisponible < dineroRetirada)	{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		double dineroGuardado = dineroDisponible;
		dineroDisponible -= dineroRetirada;
		System.out.println("RETIRADA Fondos del cajero:");
		System.out.println(dineroGuardado + " ---> " + dineroDisponible);
	}
}
