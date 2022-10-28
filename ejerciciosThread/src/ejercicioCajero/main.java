package ejercicioCajero;

public class main {

	public static void main(String[] args) {

		Cajero cajero = new Cajero();
		Cliente clienteRetirar = new Cliente("Cliente retirar", cajero, false);
		Cliente clienteIngresar = new Cliente("Cliente ingresar", cajero, true);
		
		clienteRetirar.start();
		clienteIngresar.start();
	}

}
