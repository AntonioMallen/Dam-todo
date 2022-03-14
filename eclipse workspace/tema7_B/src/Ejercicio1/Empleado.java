package Ejercicio1;
public class Empleado implements Persona {
	
	private String nombre="";
	public void pedirTodosDatos() {
		nombre =teclado.next();
	}
	public void visualizarTodosDatos() {
		System.out.println(nombre);
	}
	
	
	public static void main(String[] args) {


	}

}
