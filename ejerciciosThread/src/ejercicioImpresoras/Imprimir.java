package ejercicioImpresoras;

public class Imprimir {

	private int num_impresorasA;
	private int num_impresorasB;
	private int num_ocupadasA;
	private int num_ocupadasB;



	public Imprimir(int num_impresorasA, int num_impresorasB) {
		super();
		this.num_impresorasA = num_impresorasA;
		this.num_impresorasB = num_impresorasB;
		num_ocupadasA=0;
		num_ocupadasB=0;
	}

	public void imprimirA(Impresor impr)	{
		synchronized (this) {
			while (num_ocupadasA==num_impresorasA) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			num_ocupadasA++;
			System.out.println(impr.getIdentificador()+" imprime en impresora A numero: "+num_ocupadasA);
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (this) {
			num_ocupadasA--;
			System.out.println(impr.getIdentificador()+" finaliza impresion");
			notifyAll();
		}
	}

	public void imprimirB(Impresor impr)	{
		synchronized (this) {
			while (num_ocupadasB==num_impresorasB) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			num_ocupadasB++;
			System.out.println(impr.getIdentificador()+" imprime en impresora B numero: "+num_ocupadasB);
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (this) {
			num_ocupadasB--;
			System.out.println(impr.getIdentificador()+" finaliza impresion");
			notifyAll();
		}
	}
	
	public void imprimirAB(Impresor impr)	{
		String escogida="";
		synchronized (this) {
			while (num_ocupadasA==num_impresorasA && num_ocupadasB==num_impresorasB) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (num_ocupadasA<num_impresorasA) { 
				escogida="A";
				num_ocupadasA++;
				System.out.println(impr.getIdentificador()+" imprime en impresora A numero: "+num_ocupadasA);
			}
			else {
				escogida="B";
				num_ocupadasB++;
				System.out.println(impr.getIdentificador()+" imprime en impresora B numero: "+num_ocupadasB);
			}
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (this) {
			if (escogida.equals("A"))  {
				num_ocupadasA--;
			}
			else {
				num_ocupadasB--;
			}
			System.out.println(impr.getIdentificador()+" finaliza impresion");
			notifyAll();
		}
	}
}
