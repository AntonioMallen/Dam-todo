package Ejercicio1;

/*Ejercicio 1
Escribe un programa que pida los datos de una serie de empleados que no son jefes, tantos
como el usuario indique. También hay que pedir los datos de una serie de jefes que son, al
mismo tiempo, empleados, tantos como el usuario indique. Una vez insertados todos los
datos, hay que visualizarlos.
De los empleados nos interesa: nombre y sueldo.
De los jefes nos interesa: nombre, sueldo, título y nombre del departamento del que es jefe.*/
import java.util.*;
public class Ej1 {
	private String nombre;
	private int sueldo;
	Ej1(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduyzca el nombre");
		nombre=teclado.nextLine();
		System.out.println("Introduyzca el sueldo");
		sueldo=teclado.nextInt();
	}
	public void imprimirDatosEmpleado() {
		System.out.println("El nombre del empleado es: "+nombre);
		System.out.println("La cantidad de sueldo es: "+sueldo);
	}
	public void pedirTodosDatos() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
