package tema4; 
/*10) Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro
primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo (H
ó M) sexo, el sexto un número que representa el curso 1 ó 2 y los caracteres séptimo y octavo
pueden tener cualquier valor. Deben rechazarse los códigos que no cumplan estas condiciones.
La finalización de entrada de códigos se produce cuando se introduce el código “00000000”.
Al final, el programa debe sacar un informe indicando cuántos hombres y mujeres hay
matriculados en primero y segundo y cuántos códigos correctos han sido leídos.*/

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		
		int caracteres;
		int mujeresprimero=0;
		int mujeressegundo=0;
		int hombresprimero=0;
		int hombressegundo=0;
		boolean condicion= true;
		
		
		while(condicion==true) {
		System.out.println("Escriba su numero");	
		frase= teclado.nextLine();
		caracteres= frase.length();
		if (frase.equals("00000000")){
			condicion=false;} else {
		
		if (caracteres==8) {
			if (frase.substring(0,4).equals(""+1990)||frase.substring(0,4).equals(""+1991)||frase.substring(0,4).equals(""+1992)||frase.substring(0,4).equals(""+1993)||frase.substring(0,4).equals(""+1994)||frase.substring(0,4).equals(""+1995)) 
			{
				
				 if (frase.substring(4, 5).equals("H")||frase.substring(4, 5).equals("M")) {
					if (frase.substring(4, 5).equals("H")) {
					if (frase.substring(5, 6).equals("1")) {
						hombresprimero++;
						System.out.println(frase.substring(5,6));} 
						else if (frase.substring(5, 6).equals("2")) 
							{hombressegundo++;
							System.out.println(frase.substring(5,6));}
					}
					
					else if (frase.substring(4, 5).equals("M")) {
						if (frase.substring(5, 6).equals("1")) {
							System.out.println(frase.substring(5,6));
							mujeresprimero++;} else if (frase.substring(5, 6).equals("2")) {
								System.out.println(frase.substring(5,6));mujeressegundo++;}
					}} 
																	;}else {System.out.println("tiene que ser entre 1990 y 1995");}
			} else {System.out.print("no es valido, no son 8 digitos");}
						   }
		
		}

		System.out.println("el numero de hombres en primero es "+ hombresprimero);
		System.out.println("el numero de hombres en segundo es "+ hombressegundo);
		System.out.println("el numero de mujeres en primero es "+ mujeresprimero);
		System.out.println("el numero de mujeres en segundo es "+ mujeressegundo);	
		}
		
		
	}

