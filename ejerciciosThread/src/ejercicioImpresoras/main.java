package ejercicioImpresoras;

public class main {

	public static void main(String[] args) {
		
		Imprimir imprimir = new Imprimir(2,3);
		Impresor impresor1 = new Impresor("Impresor1A","a",imprimir);
		Impresor impresor2 = new Impresor("Impresor2A","a",imprimir);
		Impresor impresor3 = new Impresor("Impresor1B","b",imprimir);
		Impresor impresor4 = new Impresor("Impresor2B","b",imprimir);
		Impresor impresor5 = new Impresor("Impresor1AB","ab",imprimir);
		Impresor impresor6 = new Impresor("Impresor2AB","ab",imprimir);
		
		
		impresor1.start();
		impresor2.start();
		impresor3.start();
		impresor4.start();
		impresor5.start();
		impresor6.start();
	}

}
