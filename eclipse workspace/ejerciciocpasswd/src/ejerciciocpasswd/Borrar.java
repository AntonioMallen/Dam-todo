package ejerciciocpasswd;

import java.io.*;
import java.util.Scanner;

public class Borrar {
	String fichero;
	String nombre;
	String passwd;
	
	Scanner s=null;
	FileWriter tmp=null;
	
Borrar(String archivo) throws IOException{
	fichero = archivo;
	boolean add;
	
	//System.out.println("Abro fichero: " + fichero);
	try {
		s = new Scanner(
				new BufferedReader(
						new FileReader(fichero)));
		tmp = new FileWriter("tmp.txt");
	} catch (FileNotFoundException e1) {
		add = false;
	}
}

public boolean comprobarUsuario ( String nombre ) {
	if ( s == null )
		return false;
	boolean encontrado = false;
	// System.out.println("Compruebo nombre de usuario en archivo");
	while ( ! encontrado && s.hasNext() ) {
		String usuario = s.next();
		if ( nombre.equals(usuario) )
			return true;
		s.nextLine();
	}
	return false;
}

public void borrar(String nombre) throws IOException {
	while(s.hasNext()) {
		String n= s.next();
		if( nombre.equals(n)) {
			s.nextLine();
		}
		tmp.write(n +" ");
		s.nextLine();
	}
}

}