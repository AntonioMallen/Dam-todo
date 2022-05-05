package ej_tema6_1;
import java.util.*;
/**
 * 
 * 1) Se generan 20 números aleatorios de tipo entero y se almacenan en un vector. Hay que calcular
y mostrar la media y, además, mostrar cuántos números hay:
-Superiores a la media
-Inferiores a la media
-Iguales a la media
 * 
 * @author alu
 *
 */


public class Main {
	
	private ArrayList<Integer> vec = new ArrayList <Integer>(); 
	private int suma =0;
	private String Salida="";
	
	
	
	public void añadirNumeros() {		
		Random r = new Random();
		for(int i = 0 ; i< 20 ; i++) {
			int num= r.nextInt(100);
			vec.add(num);		
			suma+=num;
		}
	}

	
	public static void main(String[] args) {
		Main m =new Main();
		m.añadirNumeros();	
		int media = (m.suma/20);
		System.out.println("El tamaño del vector es "+ m.vec.size());
		for(int i = 0 ; i< 20 ; i++) {
			int num= m.vec.get(i);
			
			if(num<media) {
				m.Salida +="El numero: "+ i + " es "+ num +" y esta por debajo de la media"+"\n";		
			}else if(num>media) {
				m.Salida +="El numero: "+ i + " es "+ num +" y esta por encima de la media"+"\n";	
			}else if(num==media){
				m.Salida +="El numero: "+ i + " es "+ num +" y es igual a la media"+"\n";	
			}
		}
		m.Salida +="La media es de "+media+"\n";
	
		System.out.println(m.Salida);
	}

}
