
package ejercicios;

import java.util.Scanner;

/*Autor: yo
 * fecha: hoy
 * programa que calcula el factorial de un numero
 */
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador =1;
		int x=1;
		int factorial=0;
		System.out.println("Introduce un numero");
		numero= teclado.nextInt();
		while(contador<numero) {	
			contador++;
            x= contador * x;
		}
		System.out.println(x);	
	
	}

}
