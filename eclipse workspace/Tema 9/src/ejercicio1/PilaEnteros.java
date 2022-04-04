package ejercicio1;

public abstract class PilaEnteros {

	
	
	
	public abstract int getIndice();
	/**
	 * Numero maximo de elementos del vector
	 */
	public final int MAXSIZE = 100;
	
	/**
	 * Inserta un numero entero en la pila
	 *
	 */
	public abstract void push( int x );
	/**
	 * Dice el elemento actual del vector
	 * @return numero entero en la posicion actual
	 */
	public abstract int pop();
	/**
	 * Tiene el tamaño de elementos dentro de la pila
	 * @return la posicion del ultimo elemento
	 */

}
