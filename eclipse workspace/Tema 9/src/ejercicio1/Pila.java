package ejercicio1;
import java.util.*;
public class Pila extends PilaEnteros{
/**
 * Creamos un vector para el almacenamiento de los numeros
 */
private int [] pila=new int[MAXSIZE];
/**
 * Creamos un int para almacenar 
 * la posicion del ultimo numero del vector(cantidad de elementos en la pila)
 */
private int indice=0;

public int getIndice() {
	return indice; 
}

public void push( int num ) {
	if(indice<MAXSIZE) {
		pila[indice]=num;
		indice++;	
	}else {
		throw new IndexOutOfBoundsException("La pila esta llena");
	}
}
public int pop() {
	if(indice>0) {
		return pila[--indice];
	}
	throw new IndexOutOfBoundsException("La pila esta vacia");
}
public int size() {	
	return indice;
}

}
