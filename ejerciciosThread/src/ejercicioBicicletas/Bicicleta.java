package ejercicioBicicletas;

public class Bicicleta {

	private static int id_asign = 1;
	private int id;
	
	public Bicicleta()	{
		id = id_asign;
		id_asign++;
	}
}
