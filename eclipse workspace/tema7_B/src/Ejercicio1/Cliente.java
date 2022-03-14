package Ejercicio1;

public class Cliente implements Persona {
	private String nombre="";

	public void pedirTodosDatos() {
		nombre =teclado.next();
	}
	public void visualizarTodosDatos() {
		System.out.println(nombre);
	}
	
}
