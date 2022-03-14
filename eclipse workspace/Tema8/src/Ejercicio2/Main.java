package Ejercicio2;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		Numeros numeros = new Numeros();
		numeros.sumarEnteros();
		try {numeros.sumarCadena();}
		catch (IOException e){System.out.println(e.getMessage());
			
		}
	}

}
