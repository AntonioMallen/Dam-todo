package tema4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String palabra;
		frase= teclado.nextLine();
		palabra= teclado.nextLine();
	 	int caracteres= frase.length();
		if (caracteres<80) {
			if (frase.indexOf(palabra)==-1) {
				System.out.println("0");
			}else System.out.print(frase.indexOf(palabra));
			
			
		} else System.out.print("no valido mu largo");

		
	}

}
