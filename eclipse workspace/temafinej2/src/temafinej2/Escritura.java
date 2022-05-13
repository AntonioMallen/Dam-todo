package temafinej2;

import java.io.*;
import java.util.ArrayList;

public class Escritura {
	ObjectOutputStream out = null;
	ObjectInputStream in = null;
	
	Escritura(String fichero){
	
			try {
				out = new ObjectOutputStream(new FileOutputStream(fichero));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				in = new ObjectInputStream(new FileInputStream(fichero));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void escribir(Empresa e) throws IOException {
		ArrayList<Viajante> viajantes=e.vector;
		out.writeObject(viajantes);
	}
	public ArrayList leer() throws ClassNotFoundException, IOException {
		ArrayList<Viajante> array= (ArrayList<Viajante>) in.readObject();
		return array;
		
	}
}
