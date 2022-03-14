
public class Ejercicio6 {
	private Trabajador[] vector;
	private int indice;
	Ejercicio6() {
		Trabajador[] vector= new Trabajador[50];
	
	}
	
	public int getIndice() {
		return indice;
	}
	void leerTrabajadores() {
		for (indice=0; indice<50;indice++) {
			Trabajador ejemplo= new Trabajador();
			vector[indice]=ejemplo;
		}
	}
	void imprimirDatos() {
		for (this.indice=0; this.indice<50;this.indice++) {
			vector[indice].verDatos();
		}
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}


	public Trabajador[] getVector() {
		return vector;
	}


	public void setVector(Trabajador[] vector) {
		this.vector = vector;
	}


	public static void main(String[] args) {
		Ejercicio6 trabajadores= new Ejercicio6();
		trabajadores.leerTrabajadores();
		trabajadores.imprimirDatos();


	}

}
