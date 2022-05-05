package Ejercicio9;

public class FichaJuego extends FichaDomino{

	// lados ocupados
	boolean ocupado1,ocupado2;
	
	public FichaJuego(int v1, int v2) {
		super(v1, v2);
		ocupado1 = ocupado2 = false;
	}
	
	public boolean compatible( FichaJuego f) {
		return ficha[0]==f.ficha[1] || ficha[0]==f.ficha[1] 
			|| ficha[1]==f.ficha[0] || ficha[1]==f.ficha[0];
	}
	
	public void casar (FichaJuego f) {
		if ( ! compatible(f)) {
			throw new IllegalArgumentException();
		}
		if(ficha[0] == f.ficha[0] && !ocupado1 && !f.ocupado1) {
			ocupado1=true;
			f.ocupado1=true;
		}
		if(ficha[0] == f.ficha[1] && !ocupado1 && !f.ocupado2) {
			ocupado1=true;
			f.ocupado2=true;
		}
		if(ficha[1] == f.ficha[0] && !ocupado2 && !f.ocupado1) {
			ocupado2=true;
			f.ocupado1=true;
		}
		if(ficha[1] == f.ficha[1] && !ocupado2 && !f.ocupado2) {
			ocupado2=true;
			f.ocupado2=true;
		}
	}

	

}
