package Ejercicio2;

public class ListaPartidos {
	private final int MAXSIZE=100;
	int limite;
	/**
	  *Lista de partidos con sus votos
	  */
	Partido [] l= new Partido[MAXSIZE];
	
	private void insertarVotos(Partido[] l,String partido, int votos) {
		for(int i=0;i<limite ;i++) {
			if(l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return;
			}
		}
			l[limite++]=new Partido(partido,votos);
			return ;
		
	}
}
