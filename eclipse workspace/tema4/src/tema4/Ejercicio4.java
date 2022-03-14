package tema4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		

		System.out.println("Introduzca su frase");
		frase= teclado.nextLine();
		int caracteres= frase.length();
		String fraseminuscula;
		String frasemayuscula;


		if (caracteres<80) {
			System.out.println("Para transformarlo a mayuscula pulsa 1, para minuscula 2");
			int n= teclado.nextInt();
			switch (n) {
			case 1: 
			System.out.print(frase.toUpperCase());
			break;
			case 2:
			System.out.print(frase.toLowerCase());
			break;
			default: System.out.print("te he dicho 1 o 2 ");
			}
			
			
			
			
		}
	}

}
