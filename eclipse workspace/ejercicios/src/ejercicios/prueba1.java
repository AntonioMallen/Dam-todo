package ejercicios;
/*Autor: yo
 * fecha: hoy
 * programa que comprueba si un numero es primo
 */
import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero");
		numero= teclado.nextInt();
		int contador=numero;
		int primo=0;
		for(contador=numero;contador>0;contador--) { // El programa va desde el numero introducido hasta n comprobando si el numero introducido se puede dividir por cada numero de 0 hasta n
			if (numero%contador==0) { 
				primo++;// en caso de que sea primo solo sumara el propio numero y 1
				System.out.println(contador);
			}
		}
		if (primo==2)
				System.out.print("Es primo");
		else System.out.print("no es primo");

		
		}
		
	}

