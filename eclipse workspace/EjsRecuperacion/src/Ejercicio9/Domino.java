package Ejercicio9;

public class Domino {
	private FichaDomino [] domino = new FichaDomino[28];
	public int indice=0;
	
	public Domino() {
			for( int j = 6 ; j >= 0 ; j-- ) {
				for (int z = j ; z >= 0; z--) {
					FichaDomino ficha= new FichaDomino(j,z);
					insertarFicha(ficha);
				}
			}
	}
	public void insertarFicha(FichaDomino ficha) {
		domino[indice]=ficha;
		indice++;
	}
	public static void main( String [] args) {
		Domino d = new Domino();
		for(int i =0 ; i < 28; i++) {
			System.out.println(i+":"+d.domino[i]);
		}
	}
}
