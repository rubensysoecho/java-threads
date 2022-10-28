package ejercicioPastas;

public class Pasta {
	private static int num_pasta = 1;
	private int id_pasta;
	private int peso;
	
	public Pasta(int peso) {
		super();
		this.peso = peso;
		this.id_pasta = num_pasta;
		num_pasta++;
	}

	public int getId_pasta() {
		return id_pasta;
	}

	public void setId_pasta(int id_pasta) {
		this.id_pasta = id_pasta;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pasta [id_pasta=" + id_pasta + ", peso=" + peso + "]";
	}

	
}
