import java.util.*;
import java.io.*;
/*
 * 3) Escribe un programa que rellene un vector de 100 elementos con n�meros enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuaci�n, el programa
mostrar� el m�nimo y el m�ximo de los cien.
 */
public class Ej_Repaso03 {
	public void escribir(FileWriter f) {}
	ArrayList <Character>vector = new ArrayList<Character>();
	public void rellenar() {
		Random r= new Random();
		for(int i=0; i<100;i++) {
			vector.add((char)r.nextInt(256));
		}
	}
	public void imprimir() {
		for (int i=0;i<100;i++) {
			System.out.println(vector.get(i));
		}
	}
	public static void main(String[] args) throws IOException {
		Ej_Repaso03 a= new Ej_Repaso03();
		a.rellenar();
		a.imprimir();
		FileWriter escritor= null;
		try {
			escritor= new FileWriter("D:\\texto.txt");
			for(int i=0;i<100;i++)
				escritor.write("Hola mundo!");	
		} 
		finally {
			if (escritor != null) {
				escritor.close();
	}
		
}
		
	}}
