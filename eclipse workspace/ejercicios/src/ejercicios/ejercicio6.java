package ejercicios;
/*Autor: yo
 * fecha: hoy
 * programa que vaya leyendo números por el teclado hasta que lea el cero, que indicará
el fin de la entrada de datos. El programa debe calcular y escribir la suma de los números
introducidos en lugar par y de los introducidos en lugar impar,
 */

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);//declaramos dos variables de suma, una para los lugares pares y otra para los impares
		int numero;
		int contador=0;
		int sumapar=0;
		int sumaimpar=0;
		boolean serie=true;
		System.out.println("Introduce un numero");
		while (serie==true) {
			numero= teclado.nextInt();
			contador++;
			if(contador%2==0)
				sumapar+=numero;
			else
				sumaimpar+=numero;
			if (numero==0)
			serie=false;
			
	}
System.out.println("La suma de los numeros en lugar par es "+sumapar);
System.out.println("La suma de los numeros en lugar inpar es "+sumaimpar);
}
}