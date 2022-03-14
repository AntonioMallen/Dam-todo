package ejercicios;
/*Autor: yo
 * fecha: hoy
 * programa que dice todos los factores del numero introducido
 */
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero");
		n= teclado.nextInt();
		int contador=1;
		while (contador<n/2+1) {
			if (n%contador==0) {
					System.out.print(contador+" ");
					contador++;
			}else contador++;
				
				
	}
		
		
		/*for (contador=1; contador==n; contador++) 
			System.out.print(contador+" ");
			if(n%contador==0)
				System.out.print(contador+" ");*/
	}
	
	
	}

