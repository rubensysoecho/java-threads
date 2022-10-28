package ejercicioImpresoras;

public class Impresor extends Thread{

	private String identificador;
	private String tipo;
	private Imprimir imprimir;

	public Impresor(String identificador,String tipo, Imprimir imprimir) {
		super();
		this.identificador=identificador;
		this.tipo = tipo;
		this.imprimir = imprimir;

	}


	public String getIdentificador() {
		return identificador;
	}

	public String getTipo() {
		return tipo;
	}


	public void run()	{
		switch(tipo)	{
		case "a":
			imprimir.imprimirA(this);
			break;
		case "b":
			imprimir.imprimirB(this);
			break;
		case "ab":
			imprimir.imprimirAB(this);
			break;
		}

	}

}
