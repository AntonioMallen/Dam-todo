package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Empleado [] empleado;
		Jefe [] jefe;
		int emp, jef, opcion;
		boolean salir = false;
		
		System.out.println("¿Cuántos empleados hay?");
		emp = teclado.nextInt();
		empleado = new Empleado [emp];
		System.out.println("¿Cuátos jefes hay?");
		jef = teclado.nextInt();
		jefe = new Jefe [jef];
		for(int i = 0; i < emp; i++) {
			System.out.println("Datos de empleado:");
			empleado[i] = new Empleado();
			empleado[i].pedirDatos();
		}
		for(int i = 0; i < emp; i++) {
			System.out.println("Datos de jefe:");
			jefe[i] = new Jefe();
			jefe[i].pedirDatos();
		}
		for(int i = 0; i < emp; i++) {
			empleado[i].imprimirDatos();
			System.out.println("");
		}
		for(int i = 0; i < emp; i++) {
			jefe[i].imprimirDatos();
		}
		
		while (salir == false) {
			System.out.println("Elija una de estas ociones:\n1.Modificar el sueldo base de todos los empleado"
					+ "\n2Modificar el plus de todos los jefes\n3.Visualizar los datos de todos los empleado"
					+ "\n4.Salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1: {
				for(int i = 0; i < emp; i++) {
					System.out.println("Elija el nuevo sueldo base:");
					int numero = teclado.nextInt();
					jefe[i].cambiarSueldoBase(numero);
					empleado[i].cambiarSueldoBase(numero);
				}
				break;
			}
			case 2: {
				for(int i = 0; i < jef; i++) {
					jefe[i].cambiarPlus();
				}
				break;
			}
			case 3: {
				for(int i = 0; i < emp; i++) {
					empleado[i].imprimirDatos();
					System.out.println("");
				}
				for(int i = 0; i < emp; i++) {
					jefe[i].imprimirDatos();
				}
				break;
			}
			case 4: {
				salir = true;
				break;
			}
			default:{
				System.out.println("Es del 1 al 4 pedazo gilipollas.");
			}	
			}
		}
		
	}

}