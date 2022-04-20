package Ejercicio9;

/**
 * Esta clase representa una ficha de domino la cual tiene dos numeros
 * (1 numero en cada lado de la ficha) comprendidos entre el 1 y 6 o 
 * tambien puede estar en blanco.
 * @author alu
 *
 */
public class FichaDomino {

	/**
	 * Este vector tiene dos parametros, uno por cada numero que posee una ficha de domino
	 */
	protected int[] ficha = new int[2];
	
	/**
	 * Este constructor, tomara los numeros del 1 al 6 como los numeros de una ficha de domino 
	 * y cuando este sea 0, significara que no hay ningun numero.
	 * @param v1= El primer numero de la ficha del domino
	 * @param v2= El segundo numero de la ficha del domino
	 */
	public FichaDomino( int v1, int v2){
		if ((v1<0 || v2<0) || (v1>6 || v2>6)) {
			throw new IllegalArgumentException("Los numeros introducidos no son posibles");
		} else {
			ficha[0]=v1;
			ficha[1]=v2;
		}
	}
	/**
	 * Clase para representar por pantalla cada una de las fichas
	 */
	@Override 
	public String toString(){
		if( ficha[0]==0 && ficha[1]==0) {
			return "[ | ]";
		}
		if ( ficha[0]==0 ) {
			return "[ |"+ficha[1]+"]";		
		}
		if ( ficha[1]==0 ) {
			return "["+ficha[0]+"| ]";		
		}
		return "["+ficha[0]+"|"+ficha[1]+"]";	
	}
	
	
}
