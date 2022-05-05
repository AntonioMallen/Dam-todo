package ej1_tema11;
import java.util.*;
import java.io.*;

public class Ej1 {

	ArrayList<Integer> vector = new ArrayList<Integer>();
	
	public void rellenar() {
		for(int i = 2;i<=30000;i++) 
			vector.add(i);
	}
	
	public void criba() {
		 int maximo=vector.size();
		 int primo= 2;
		 int contador=1;
		 while(primo*primo<maximo) {
		Iterator<Integer> iteradorprimo= vector.iterator();
		for(int i=1;i<=contador;i++) {
			primo= iteradorprimo.next();
		}
		 
		 Iterator<Integer> iteradorcriba= vector.iterator();
		 while(iteradorcriba.hasNext()) {
			 int posibleprimo=iteradorcriba.next();
				if(posibleprimo%primo==0&&posibleprimo>primo) {
					iteradorcriba.remove();
				 	}			
			}
		 contador++;
		 }
		 
		 }
	public void imprimir() {
		int limite= vector.size();
		for (int i=0;i<limite;i++)
			System.out.print(vector.get(i)+" ");
	}	 
	
	public static void main(String[] args) {
	Ej1 a= new Ej1();
	a.rellenar();
	a.criba();
	a.imprimir();
	}

}
