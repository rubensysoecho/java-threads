package ejercicioDiscoteca;

public class Main {

	public static void main(String[] args) {
		Ba�o ba�o = new Ba�o();
		Chico chico1 = new Chico(ba�o);
		Chico chico2 = new Chico(ba�o);
		Chico chico3 = new Chico(ba�o);
		Chico chico4 = new Chico(ba�o);
		Chico chico5 = new Chico(ba�o);
		Chico chico6 = new Chico(ba�o);
		Chico chico7 = new Chico(ba�o);
		Chico chico8 = new Chico(ba�o);
		Chico chico9 = new Chico(ba�o);
		Chica chica1 = new Chica(ba�o);
		Chica chica2 = new Chica(ba�o);
		
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
