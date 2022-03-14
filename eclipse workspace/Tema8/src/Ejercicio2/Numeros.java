package Ejercicio2;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Numeros {
	private int numero;
	private int suma;
	private String numero_cadena;
	boolean error = false;//que no se me olvide esto , tengo k añadirlo al constructor
	Scanner teclado=new Scanner(System.in);
	Numeros(){
		numero=0;
		suma=0;
		numero_cadena="0";
		
		
	}
	public int getSuma() {
		return suma;
	}
	
public 
void sumarEnteros() {
	try {
		for(int contador=1;contador<4;contador++) {
			System.out.println("Dime el numero "+contador);
			this.numero=teclado.nextInt();
			suma=numero+suma;
		}
	}catch(InputMismatchException e) {System.out.println(""+e.getMessage());
		error = true;
		
		System.out.println("La suma de lo que esta bien puesto es "+ suma);
	}
}
public void sumarCadena() throws IOException {
	if (error == false) {
	for(int contador=4;contador<7;contador++) {
	System.out.println("Dime el numero "+contador);
	if (contador < 5) {
		teclado.nextLine();
	}
	this.numero_cadena=teclado.nextLine();
	for( int i = 0; i < numero_cadena.length() && error != true; i++ ) {
		if (numero_cadena.charAt(i) >= '0' && numero_cadena.charAt(i) <= '9') {
			error = false;
		}else {
			error = true;
		}
	}
	if (error == false) {
		suma=Integer.parseInt(numero_cadena)+suma;
	}else {

		throw new IOException("Si es que eres tonto, te estoy pidiendo numeros no letras."+"\n"
	+"La suma de lo que esta bien puesto es "+ suma);
	
	}

	}
	System.out.println("La suma es "+ suma);
}
}

}
