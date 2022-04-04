package Ejercicio2;

public class Programa {

	public static void main(String[] args) {
		Votacion v= new Votacion(5);
		/*
		int electores =235636;
		int partidos = 20;
		final int MAXVOTOS = 500;
		int numVotos =r.nextInt(MAXVOTOS);
		electores -= numVotos;*/
		int [] votos= {10000,25000,30000,12000};
		String []p= {"P1","P2","P3","P4"};
		for (int i=0;i<p.length;i++) {
			v.insertarVotos(p[i], votos[i]);
		}
		v.calcular();
		System.out.println(v);
	}

}
