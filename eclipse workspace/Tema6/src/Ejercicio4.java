/*
 * 4) Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5) y
 *  comprobar para
cada uno de los elementos del primer vector cuántas veces está en el segundo, 
es decir
primero: 3,7,2
segundo: 3,3,5
el resultado debe ser:
elemento 1 (3): 2 veces
elemento 2 (7): 0 veces
elemento 3 (2): 0 veces
 */
import java.math.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		int []vector1=new int[10];
		int []vector2=new int[10];
		int contadorveces=0;
		for(int contador = 0;contador<10;contador++) {
			vector1[contador] =(int) ((Math.random()*5)+1);
			vector2[contador] =(int) ((Math.random()*5)+1);
			}
		for(int contador = 0;contador<10;contador++) {
			contadorveces=0;
			for(int contador1 = 0;contador1<10;contador1++) {
				
				if (vector1[contador]==vector2[contador1]) {
					
					contadorveces++;
					
				}
				
			}
			
			System.out.println("elemento"+(contador+1)+" ("+vector1[contador]+") : "+contadorveces+" veces");
		}
		String hola="";
		Integer patata = 3;
		hola=patata.toString();
		System.out.println(hola);
		
	}

}
