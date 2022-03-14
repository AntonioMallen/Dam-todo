package ejercicios;
/*Autor: yo
 * fecha: hoy
 * programa imprime la tabla de multiplicar del numero que introducimos
 */
import java.util.*;
public class ejercicio2 {
public static void main(String[] args) throws Exception {
	Scanner teclado = new Scanner(System.in);
	int n;
	System.out.println("Introduce un numero entre 1 y 10");
	n= teclado.nextInt();
	if (n<=10&&n>=0) {
		System.out.println("TABLA DE MULTIPLICAR DE " +n);
		for(int contador=1; contador<=10;contador++)
			System.out.println(n + " * " + contador +" = " + n*contador);		
	}
	else {System.out.println("El numero no es valido");}
}
}