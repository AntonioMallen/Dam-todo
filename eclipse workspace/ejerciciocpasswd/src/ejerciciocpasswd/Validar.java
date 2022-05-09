package ejerciciocpasswd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Validar {
	String fichero;
	Scanner s=null;
	
Validar(String archivo){
	fichero = archivo;
	boolean add;
	
	//System.out.println("Abro fichero: " + fichero);
	try {
		s = new Scanner(
				new BufferedReader(
						new FileReader(fichero)));
	} catch (FileNotFoundException e1) {
		add = false;
	}
}
public boolean validacion(String nombre, String passwd) {}
	

public boolean comprobarUsuario(String nombre) {
	while(s.hasNext()) {
		if(s.next().equals(nombre))
			return true;
		s.nextLine();
	}
	return false;
	
}
}