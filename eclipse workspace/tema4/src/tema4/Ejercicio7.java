package tema4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String frase;
		frase= teclado.nextLine();
		
		int caracteres= frase.length();
		int mayus=0;
		int minus=0;
		int contadornumero=0;
		String espacio=" ";
		if (caracteres<80) {
			for(int contador=0;contador<caracteres;contador++) {
				char letra = frase.charAt(contador);
				String letrados = String.valueOf(letra);
				if(letra=='1'||letra=='2'||letra=='3'||letra=='4'||letra=='5'
						||letra=='6'||letra=='7'||letra=='8'||letra=='9'||letra=='0') {
					contadornumero++;}
				else if (letrados.equals(letrados.toUpperCase())&&!letrados.equals(espacio)) {
					mayus++;
				}else if (!letrados.equals(espacio)) {
					minus++;}
			}
		System.out.println("El numero de mayusculas es: "+mayus);
		System.out.println("El numero de minusculas es: "+minus);
		System.out.println("El numero de numeros es: "+contadornumero);
		}else {System.out.print("Mucho texto");}}

}
