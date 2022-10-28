package ejercicioPastas;

public class Caja {

	private int peso;
	private int pesoMax;
	boolean lleno;
	
	public Caja()	{
		peso = 0;
		pesoMax = 30;
		lleno=false;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}
	
	public boolean isLleno() {
		return lleno;
	}

	public void setLleno(boolean lleno) {
		this.lleno = lleno;
	}

	public synchronized void retirarcaja() {
		while(!lleno)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		peso=0;
		lleno=false;
		System.out.println("Caja retirada. Peso restablecido.");
		notifyAll();
		
	}
	public synchronized void colocarPasta(Pasta pasta)	{
		while(lleno)	{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if ((peso+pasta.getPeso()<pesoMax)) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			peso += pasta.getPeso();
			System.out.println("Pasta de "+ pasta.getPeso() + "kg " + " colocada en caja");
		}
		else {
			lleno=true;
			notifyAll();	
		}
	}
}
