package ejercicios;
/*Autor: yo
 * fecha: hoy
 * programa que comprueba si un numero es primo o no
 */

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero");//comprobamos que el numero no sea divisible por ningun otro hasta su mitad ya que ningun numero mayor que la mitad será factor, si se supera ese numero sin encontrar niongun factor sabemois que es primo
		n= teclado.nextInt();
		int contador=2;
		boolean primo = true;
		while (primo==true) {
		
			if (n%contador==0) {
					System.out.print("No es primo");
					primo=false;
			}else if(contador<=n/2+1) {
				contador++;
			if(contador>n/2+1)
					System.out.print("Es primo");
			}
				
	}

	}
}
