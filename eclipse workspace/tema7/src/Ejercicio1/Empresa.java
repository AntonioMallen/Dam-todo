package Ejercicio1;


import java.util.Scanner;

public class Empresa {
	Ej1[] empleados;
	int indice;
	public void datosEmpleado(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("indica numero de empleados");
		int contadorEmpleados=teclado.nextInt();
		for(int i=0;i<contadorEmpleados;i++) {
			Ej1 empleado= new Ej1();
			empleado=empleados[i];
			indice++;}
		
		System.out.println("indica numero de jefes");
			int contadorJefes=teclado.nextInt();
			for(int i=0;i<contadorJefes;i++) {
				Ej1 jefe= new Jefe();
				jefe=empleados[indice];
				indice++;
			
		}
			for (int i=0;i<indice-1;i++) {
				empleados[i].imprimirDatosEmpleado();
			}
	}
	

	public static void main(String[] args) {
		Empresa empresa= new Empresa();
		empresa.datosEmpleado();
		

	}

}
