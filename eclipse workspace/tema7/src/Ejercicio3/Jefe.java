package Ejercicio3;
import java.util.Scanner;
public class Jefe extends Empleado {
	int plus;
	String nombreDepartamento;
	Jefe() {
		plus = 250;
		nombreDepartamento = "";
	}
	void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		super.pedirDatos();
		System.out.println("Escriba el departamento en el que trabaja:");
		nombreDepartamento = teclado.nextLine();
	}
	void imprimirDatos() {
		super.imprimirDatos();
		System.out.println(" Nombre del departamento: " + nombreDepartamento + " Plus: " + plus);
	}
	void cambiarPlus() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introdizca el plus del jefe");
		plus = teclado.nextInt();
	}
}