package tema4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		frase= teclado.nextLine();
		
		int caracteres= frase.length();
		int mayus=0;
		int minus=0;
		String espacio=" ";
		if (caracteres<80) {
			for(int contador=0;contador<caracteres;contador++) {
				char letra = frase.charAt(contador);
				String letrados = String.valueOf(letra);
				if (letrados.equals(letrados.toUpperCase())&&!letrados.equals(espacio)) {
					mayus++;
				}else if (!letrados.equals(espacio)) {
					minus++;}
			}
		System.out.println("El numero de mayusculas es: "+mayus);
		System.out.println("El numero de minusculas es: "+minus);
		}else {System.out.print("Mucho texto");}
	}

}
