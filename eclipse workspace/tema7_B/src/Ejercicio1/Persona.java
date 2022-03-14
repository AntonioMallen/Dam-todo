package Ejercicio1;

import java.util.Scanner;

public interface Persona {
	String Nombre_empresa="Hacienda S.L";
	Scanner teclado = new Scanner(System.in);
	
	public void pedirTodosDatos();
	public void visualizarTodosDatos();
}
