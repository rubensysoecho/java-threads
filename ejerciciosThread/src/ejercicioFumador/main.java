package ejercicioFumador;

public class main {

	public static void main(String[] args) {
		
		Mesa mesa = new Mesa();
		Agente agente = new Agente(mesa);
		Fumador fumador1 = new Fumador("Fumador 1", mesa, "cerillas");
		Fumador fumador2 = new Fumador("Fumador 2", mesa, "tabaco");
		Fumador fumador3 = new Fumador("Fumador 3", mesa, "papel");

		agente.start();
		fumador1.start();
		fumador2.start();
		fumador3.start();
	}

}
