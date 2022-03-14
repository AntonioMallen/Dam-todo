package tema4;  

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		frase= teclado.nextLine();
		
		int caracteres= frase.length();
		int contadordos;
		int contador;
		String frasenueva="";
		if (frase.equals(frase.toUpperCase())) {
			for (contador=0;contador<caracteres;contador++) {
				char letra=frase.charAt(contador);
				letra=(char) (letra+3);
				
				frasenueva= frasenueva+letra;
	}
System.out.println(frasenueva);
}else {System.out.println("no son todas mayusculas");}
}
}