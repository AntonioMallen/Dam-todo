package ej_tema6_2;

import java.util.*;

/**
 * 
 * Leer dos vectores de dimensión 10 para construir un tercer vector cuyos componentes sean la
suma de los dos anteriores e imprimirlo
 * 
 * @author alu
 *
 */

public class Main {

	private ArrayList<Integer> vec1 = new ArrayList <Integer>();
	private ArrayList<Integer> vec2 = new ArrayList <Integer>();
	private ArrayList<Integer> vec3 = new ArrayList <Integer>();
	
	
	
	public void añadirNumeros( ArrayList<Integer> vec ) {		
		Random r = new Random();
		for(int i = 0 ; i< 20 ; i++) {
			int num= r.nextInt(100);
			vec.add(num);		
		}
	}
	
	public void sumarArrayList( ArrayList<Integer> vec1,ArrayList<Integer> vec2) {
		for(int i = 0 ; i< 20 ; i++) {
		int num1=vec1.get(i);
		int num2=vec2.get(i);
		vec3.add(num1+num2);
		}
	}
	
	public static void main(String[] args) {
		Main m = new Main ();
		String Salida="";
		m.añadirNumeros(m.vec1);
		m.añadirNumeros(m.vec2);
		m.sumarArrayList(m.vec1, m.vec2);
		System.out.println("Lista 1");
		for(int mas : m.vec1) 
			;
		System.out.println("Lista 2");
		for(int mas : m.vec2) 
			System.out.println(mas);
		System.out.println("Lista 3");
		for(int mas : m.vec3) 
			System.out.println(mas);
		for(int i = 0; i<m.vec1.size() ; i++) { 
			Salida=("El numero "+m.vec1.get(i)+ " + "+m.vec2.get(i)+" = "+m.vec3.get(i)+"\n");
			System.out.println(Salida);
		}
		
	}

}
