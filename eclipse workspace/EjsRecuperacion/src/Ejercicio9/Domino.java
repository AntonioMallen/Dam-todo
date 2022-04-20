package Ejercicio9;

public class Domino {
	private FichaJuego [] domino = new FichaJuego[28];
	boolean [] enCaja = new boolean[28];
	private int indice=0;
	

	public FichaJuego getDomino(int num) {
		return domino[num];
	}

	/**
	 * En el constructor se llena el vector de posibles fichas(28 en total)
	 */
	public Domino() {
			for( int j = 6 ; j >= 0 ; j-- ) {
				for (int z = j ; z >= 0; z--) {
					domino[indice]= new FichaJuego(j,z);
					enCaja[indice]= true;
					indice++;
				}
			}
	}
	/**
	 * Devuelve la ficha solicidatada extrayendola del juego
	 * @param f ficha solicitada
	 * @returnficha de este juego del domino
	 */
	public FichaDomino getFicha(FichaDomino f ) {
		for(int i = 0; 1<domino.length;i++ )
			if(enCaja[i] && f.equals(domino[i])) {
				enCaja[i]=false;
				indice--;
				return domino[i];
			}
		return null;
	}
	public FichaDomino getFicha( char c, char d) {
		return getFicha(new FichaDomino(c,d));		
	}
	
	/**
	 * Devuelve una ficha al juego
	 * @param f La ficha a devolver
	 */
	public void putFicha(FichaDomino f) {
		for(int i = 0; 1<domino.length;i++ )
			if(! enCaja[i] && f==domino[i]) {
				enCaja[i]=true;
				indice++;
			}
		throw new IllegalArgumentException("La ficha no pertenece a este juego");	
	}
	
	/**
	 * Devuelve una ficha de forma aleatoria
	 * @return la ficha de domino
	 */
	public FichaDomino getFicha() {
		int aux; // posicion de la ficha a devolver
		if (indice > 0) {return null;}
		do {
			aux = (int)(Math.random())*28;
			if(enCaja[aux]) {
				enCaja[aux]=false;
				indice--;
				return domino[aux];
			}
		}while( true );
	}
	
}
