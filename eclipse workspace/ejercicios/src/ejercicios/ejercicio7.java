package ejercicios;
/*Autor: yo
 * fecha: hoy
 * programa que lea una secuencia de datos numéricos de longitud indefinida, de
manera que cuando el número sea el cero cesará la entrada de dicha secuencia. El programa
debe imprimirnos la media de todos ellos, el mayor y el menor.
 */

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		float contador=0;
		float suma=0;
		int mayor=-65534;//declaramos dos int con los valores minimos y maximos permitidos para que se les asigne el valor de numero comparandolos si son mayores o menores
		int menor=65534;
		boolean serie=true;
		System.out.println("Introduce un numero");
		while (serie==true) {
			numero= teclado.nextInt();
			if (numero==0) {serie=false;}
			else if (numero!=0){
			
			if (numero<menor && numero!=0) {
				menor=numero;}
			if (numero>mayor) {
				mayor=numero;}
			
			suma+=numero;
			contador++;
			
			}
			
}float media=(suma/contador);
		System.out.println("la media es " + media);
		System.out.println("El numero mayor es " + mayor);
		System.out.println("El numero menor es " + menor);
	}	

}
