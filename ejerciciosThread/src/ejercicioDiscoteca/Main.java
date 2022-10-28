package ejercicioDiscoteca;

public class Main {

	public static void main(String[] args) {
		Baño baño = new Baño();
		Chico chico1 = new Chico(baño);
		Chico chico2 = new Chico(baño);
		Chico chico3 = new Chico(baño);
		Chico chico4 = new Chico(baño);
		Chico chico5 = new Chico(baño);
		Chico chico6 = new Chico(baño);
		Chico chico7 = new Chico(baño);
		Chico chico8 = new Chico(baño);
		Chico chico9 = new Chico(baño);
		Chica chica1 = new Chica(baño);
		Chica chica2 = new Chica(baño);
		
		chico1.start();
		chico2.start();
		chico3.start();
		chico4.start();
		chico5.start();
		chico6.start();
		chico7.start();
		chico8.start();
		chico9.start();
		chica1.start();
		chica2.start(); 
	}
}
