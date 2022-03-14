package tema4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorpar=1;
		Scanner teclado = new Scanner(System.in);
		String frase;
		

		System.out.println("Introduzca su frase");
		frase= teclado.nextLine();
		int contadorimpar=0;
		String impar="";
		String par ="";
		int caracteres= frase.length();
		if (caracteres<80) {
			while (contadorpar<caracteres) {
				par =frase.charAt(contadorpar) +par;
				contadorpar = contadorpar+2;
				}
			while (contadorimpar<caracteres) {
				impar=frase.charAt(contadorimpar)+impar;
				contadorimpar = contadorimpar+2;	
			}System.out.println(par);
			System.out.println(impar);
				
			}
		
		
	}

	}

