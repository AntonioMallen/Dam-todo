package ejercicios;/*Hacer un programa que lea una frase y 
luego una palabra; y nos diga cuántas
veces está la palabra en la frase. Es obligatorio que la palabra solo posea letras o
números y ningún otro tipo de carácter.*/
import java.util.Scanner;
public class Ejev4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		String frase="";
		String palabra="";
		char letra;
		boolean espacio=false;
		String palabracomparar="";
		System.out.println("Introduce frase");
		frase= teclado.nextLine();
		int contadordos=1;
		int contador=0;
		int contadorpalabra=0;
		System.out.println("Introduce palabra");
		palabra= teclado.next();
		int caracteres= frase.length();
		while(contadordos<caracteres){
			while(espacio==false&&contador<caracteres) {
			letra=frase.charAt(contador);
			if (letra==' ') {espacio=true;
			contador++;}
			else {palabracomparar+=letra;
			contador++;}
		}	
			espacio=false;
			if (palabracomparar.equals(palabra)){
			contadorpalabra++;	
			}
			palabracomparar="";
			contadordos++;
		}System.out.println("se ha encontrado "+contadorpalabra+" veces");
		
	}

}
