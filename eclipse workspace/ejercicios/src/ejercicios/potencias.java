package ejercicios;

import java.util.Scanner;

public class potencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la base");
		double n= teclado.nextInt();
		System.out.println("Introduce el exponente");
		int e= teclado.nextInt();
		double m=n;
		
	for (int contador=1;contador<=e;contador++)
	{
		System.out.println(m);
		m=m*n;
			
		
		/*m=Math.pow(n,contador);
		System.out.println(m);*/
		
	}
	
	
	}

}
