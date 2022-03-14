package Ejercicio1;

import java.util.*;
public class Jefe extends Ej1{
	String titulo;
	String nombreDepartamento;
	Jefe(){
		Scanner teclado= new Scanner (System.in);
		System.out.println("introduce titulo");
		titulo= teclado.nextLine();
		System.out.println("introduce lo otro");
		nombreDepartamento= teclado.nextLine();
	}
	public void imprimirDatosEmpleado() {
		System.out.println("El nombre del Jefe es: "+getNombre());
		System.out.println("La cantidad de sueldo es: "+getSueldo());
		System.out.println("El titulo es: "+this.titulo);
		System.out.println("El titulo es: "+this.nombreDepartamento);
	}

}
