package ejercicioRepaso;

import java.util.Comparator;

public class Comparador implements Comparator<Atleta>{

	@Override
	public int compare(Atleta o1, Atleta o2) {
		if (o1.getTiempo_carrera()==o2.getTiempo_carrera())	return 0;
		else if (o1.getTiempo_carrera()>o2.getTiempo_carrera())	return 1;
		else return -1;
	}

	

}
