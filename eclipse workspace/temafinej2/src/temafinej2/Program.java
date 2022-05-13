package temafinej2;

import java.io.IOException;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa e= new Empresa();
		Viajante v= new Viajante();
		Viajante b= new Viajante();
		e.annadirViajante(b);
		e.annadirViajante(b);
		Escritura esc= new Escritura("fichero.txt");
		try {
			esc.escribir(e);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ArrayList<Viajante> array=esc.leer();
			for (Viajante v1 : array) {
				System.out.println(v1.DNI);
			}
		} catch (ClassNotFoundException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
