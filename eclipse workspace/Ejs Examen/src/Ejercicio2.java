/**
 * 
 */

import java.util.Scanner;
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numrandom = (int)(Math.random()*50)+1;
		boolean x = true;
		System.out.println("Adivina el numero entre el 1 y el 50");
		int respuesta= teclado.nextInt();
		for(int contador =0;contador<7&&x==true;contador++){
			if(respuesta>numrandom) {
				System.out.println("La respuesta es menor");
			}else if(respuesta<numrandom) {
				System.out.println("La respuesta es mayor");
			}else {
				System.out.println("Has acertado");
				x=false;
			}
			System.out.println(" ");
			respuesta= teclado.nextInt();
		}
	}
}
