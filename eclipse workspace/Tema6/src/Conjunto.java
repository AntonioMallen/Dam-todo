/*
 * Escribir una clase Conjunto que gestione un conjunto de enteros (int) con ayuda de una tabla de
tamaño fijo (100) (un conjunto contiene una lista no ordenada de elementos y se caracteriza
por el hecho de que cada elemento es único: no se debe encontrar dos veces el mismo valor en
la tabla). Las operaciones a implementar (métodos de la clase) son las siguientes:
 vaciar: vacía el conjunto.
 agregar: añade un entero al conjunto
 eliminar: retira un entero del conjunto (habrá que desplazar elementos).
 copiar: recopila un conjunto en otro
 esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o falso si no
existe.
 posicion: reenvía la posición en el conjunto de un entero dado, o el valor -1 si no existe.
 */
import java.util.*;
public class Conjunto {
	
	private int[] vector;
	private int indice;
	
	Conjunto(){
		this.indice=0;
		vector=new int[100];
	}
	public void agregarNumero() {
		System.out.println("Dime el numero a agregar");
		int numero= teclado.nextInt();
		boolean repetido=false;
		for (int i=0;i<indice && repetido==false;i++) {
			if (vector[i]==numero) {
				repetido=true;
			}
			else {repetido=false;}
		}
		if (repetido==true) {System.out.println("numero repetido");
	    }
		else {	vector[indice]=numero;
				indice++;
			 	System.out.println("numero agregado");}
		}
	public void vaciarLista() {
		for(int i=0;i<100;i++) {
			vector[i]=0;
		}
		indice=0;
	}
	public void eliminarElemento(int posicion) {
		for(int i=posicion;i<99;i++) {
			this.vector[i]=vector[i+1];
		}
		this.vector[99]=0;
	}
	public void imprimirLista() {
		System.out.println("Su vector es: ");
		for(int i=0;i<100;i++) {
			System.out.println(vector[i]);
		}
	}
	void copiarLista(Conjunto copiado) {
		for(int i=0;i<100;i++) {
			this.vector[i]=copiado.vector[i];
		}
	}
	public boolean esigualLista(Conjunto copiado) {
		boolean igual=true;
		for(int i=0;i<100;i++) {
			if(this.vector[i]!=copiado.vector[i]) {
				igual=false;
			}
		}
		System.out.println(igual);
		return igual;
	}
	public void posicionLista() {
		boolean posicion = true;
		System.out.println("Dime el numero a comprobar");
		int numero=teclado.nextInt();
		for(int i=0;i<100 && posicion==true;i++) {
			if(vector[i]==numero) {
				System.out.println("Esta en la posicion "+i);
				posicion=false;
			}
		}
		if(posicion==true) {System.out.println("-1");}
	}
	Scanner teclado=new Scanner(System.in);	
	public static void main(String[] args) {
	Conjunto prueba= new Conjunto();
	Conjunto prueba1= new Conjunto();
	prueba.agregarNumero();
	prueba.agregarNumero();
	prueba.agregarNumero();
	prueba.eliminarElemento(1);
	prueba.imprimirLista();
	
	

	//prueba1.esigualLista(prueba);
	}

}
