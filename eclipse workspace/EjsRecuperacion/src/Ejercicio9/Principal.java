package Ejercicio9;

public class Principal {

	public static void main( String [] args) {
		
		Domino d = new Domino();
		for(int i =0 ; i < 28; i++) {
			System.out.println(i+":"+d.getDomino(i));
		}
	}
}
