package Ejercicio9;

public class Principal {

	public static void main( String [] args) {
		/**
		 * Para crear una Ficha de domino se le pasan dos parametros( izquierdo y derecho respectivamente)
		 * puedes poner un numero entre el 1 y el 6, y si le pasas un 0 entonces pondra un espacio en
		 * blanco
		 */
		FichaDomino f1 = new FichaDomino(0,0);
		FichaDomino f2 = new FichaDomino(0,5);
		FichaDomino f3 = new FichaDomino(1,6);
		System.out.print(f1);
		System.out.print(f2);
		System.out.print(f3);
	}
}
