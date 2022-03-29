package ejercicio1;
import java.util.*;
public class Pila {
private int [] pila=new int[1000];
private int indice=0;


public int numeroAleatorio() {
	Random r = new Random();
return r.nextInt(2000);
}
public void push() {
	pila[indice]=numeroAleatorio();
	indice++;
}
public void pop() {
	pila[indice]=0;
	indice--;
}
public int size() {	
	return indice;
}

}
