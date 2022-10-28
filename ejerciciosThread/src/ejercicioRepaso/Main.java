package ejercicioRepaso;

public class Main {

	public static void main(String[] args) {
		
		Carrera carrera = new Carrera();
		Atleta atleta1 = new Atleta(1, "Alberto", carrera);
		Atleta atleta2 = new Atleta(2, "Julian", carrera);
		Atleta atleta3 = new Atleta(3, "Roberto", carrera);
		Atleta atleta4 = new Atleta(4, "Ruben", carrera);
		Atleta atleta5 = new Atleta(5, "Joel", carrera);
		Atleta atleta6 = new Atleta(6, "Pedro", carrera);
		Atleta atleta7 = new Atleta(7, "Tomas", carrera);
		Atleta atleta8 = new Atleta(8, "Manuel", carrera);
		
		carrera.prepararse();
		atleta1.start();
		atleta2.start();
		atleta3.start();
		atleta4.start();
		atleta5.start();
		atleta6.start();
		atleta7.start();
		atleta8.start();
		carrera.mostrar_podio();
	}
}
