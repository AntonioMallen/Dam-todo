package ejercicios;
import java.util.*;
/*
 * Autor: yo
 * fecha:hoy
 * El programa suma los numeros entre a y b sin incluirlos
 */
public class Ejercicios1 {
public static void main(String[] args) throws Exception {
	Scanner teclado = new Scanner(System.in);
	int suma; 
	int a,b; // numeros de los extremos
	System.out.println("Introduzca el numero menor: ");
	a= teclado.nextInt();
	System.out.println("Introduzca el numero mayor: ");
	b= teclado.nextInt();
	
	//Sumo los números entre A y B sin incluirlos
	suma=0;
	for( int contador=a+1; contador < b; contador++)// el contador empieza en a+1 para no contarlo y termina en < b para que tampoco sea incluido
		suma +=contador;
		
		System.out.println("La suma es: " + suma);
	
}
}

