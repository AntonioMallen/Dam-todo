package ejercicios;

import java.util.Scanner;

//12) Realizar un programa que elija mediante un menú un tipo de figura:
/*
 Tringulo
 Cuadrado
 Rectngulo
Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos
la muestre.*/
public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número del 1 al 3:");
		System.out.println("Calcular area triangulo: 1");
		System.out.println("Calcular area cuadrado: 2");
		System.out.println("Calcular area rectangulo: 3");
		n=teclado.nextInt();
		switch(n) {
		case 1: 
			int base;
			int altura;
			System.out.println("Introduce la base y la altura");
			base=teclado.nextInt();
			altura=teclado.nextInt();
			System.out.println((base*altura)/2);
			break;
		case 2:
			int lado;
			System.out.println("Introduce el lado");
			lado=teclado.nextInt();
			System.out.println(lado*lado);
			break;
		case 3:
			int baserectangulo;
			int alturarectangulo;
			System.out.println("Introduce la base y la altura");
			baserectangulo=teclado.nextInt();
			alturarectangulo=teclado.nextInt();
			System.out.println(baserectangulo*alturarectangulo);
		default: System.out.println("no es un comando valido");
		}
		
		
		
		
		
	}

}
