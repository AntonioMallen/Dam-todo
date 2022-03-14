package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero");
		n= teclado.nextInt();
		
		boolean siguienteprimo=false;
		
		while (siguienteprimo==false); {
		int contador=2;
		boolean primo = true;
		while (primo==true) {
		
			if (n%contador==0) {
				System.out.println(n);
					primo=false;
			}else if(contador<=n) {
				contador++;}
			if(contador>n)
					primo=false;
			siguienteprimo=true;
	
		}

		System.out.println(n);
		
}System.out.println(n);
}
}