package Ejercicio3;
import java.util.Scanner;

public class Empleado {
	String nombre;
    int edad;
	int porcentaje;
	final String nombreEmpresa;
	int sueldoBase;
	Empleado(){
		sueldoBase = 1000;
		nombre = "";
		edad = 0;
		porcentaje = 0;
		nombreEmpresa = "Eléctrica, SA";
	}
	void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba el nombre del empleado:");
		nombre = teclado.nextLine();
		System.out.println("Escriba la edad del empleado");
		edad = teclado.nextInt();
		System.out.println("Escriba el porcentaje del sueldo");
		porcentaje = teclado.nextInt();
	}
	void imprimirDatos() {
		System.out.print("Nombre de la empresa: " + nombreEmpresa + " Nombre del empleado: " + nombre + 
				" Edad del empleado: " + edad + " \n\tSueldo base: " + sueldoBase + " Porcentaje de incremento del sueldo " + porcentaje);
	}
	void cambiarSueldoBase(int numero) {
		sueldoBase = numero;
	}
}