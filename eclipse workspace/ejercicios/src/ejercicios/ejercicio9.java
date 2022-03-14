package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		int suma=0;
		System.out.println("Introduce un numero");
		n= teclado.nextInt();
		int contador=1;
		while (contador<n/2+1) {
			if (n%contador==0) {
				
					suma+=contador;
					contador++;
			}else contador++;
	}
		if (suma==n)
			System.out.println("Es perfecto");
		else
			System.out.println("No es perfecto");
	}
}