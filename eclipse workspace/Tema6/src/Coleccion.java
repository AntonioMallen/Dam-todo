/*
 * Crea una clase que nos permita almacenar una colección de discos. El nombre de la clase será
Coleccion. Los datos miembro serán:
 Un vector de 100 elementos de la clase Disco.
 Un entero al que llamaremos índice que servirá para saber cuántos discos hemos
almacenado en la colección.
Diseña los métodos necesarios para gestionar la colección.
 */
import java.util.*;
public class Coleccion {
	private int indice;
	private Disco[]discos;
	Coleccion(){
		this.discos=new Disco[100];
		this.indice=0;
	}
	public Disco[] getDiscos() {
		return discos;
	}
	public void setDiscos(Disco[] discos) {
		this.discos = discos;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	void newDisco() {
		if (indice<100) {
		Disco discotres= new Disco();
		this.discos[indice]=discotres;
		indice++;
		System.out.println("vale ya esta");
		}
		else {System.out.println("muchos discos");}	
	}
	void mostrarColeccion() {
		for(int i=0;i<=indice-1;i++) {
			System.out.println("Disco "+(i+1));
			discos[i].mostrarPantalla();
		}
	}
	public static void main(String[] args) {
		System.out.println("cuantos discos quieres introducir?");
		int numero=0;
		Scanner teclado= new Scanner(System.in);
		numero=teclado.nextInt();
		Coleccion coleccion = new Coleccion();
		for(int j=0;j<numero;j++) {
		coleccion.newDisco();
		}
		coleccion.mostrarColeccion();
	}

}
