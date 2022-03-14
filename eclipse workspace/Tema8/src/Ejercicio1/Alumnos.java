package Ejercicio1;
/**
 * Visualiza los datos de dichos alumnos e indica cuál es el mayor de los dos.
 *  Si ambos tienen la misma edad hay que mostrar un mensaje que lo indique.
Si se produce el error IOException, 
se visualizará el mensaje correspondiente y se cerrará el programa.
En la entrada de datos, tanto de la altura como de la edad,
 se comprobará que el usuario
no haya insertado letras.
Si es así, se volverá a pedir el dato correspondiente hasta que la
entrada sea correcta.
 * @author alu
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Alumnos {
private String nombre;
private int edad;
private int altura;
Scanner teclado = new Scanner(System.in);

Alumnos(){
	nombre = "";
	edad = 0;
	altura = 0;
	pedirDatos();
	//comprobacion();
}
void comparacion(int edad, int edad2){
	if (edad < edad2) {
		System.out.println("La segunda persona es mayor");
	}else if(edad>edad2) {
		System.out.println("La primera persona es mayor");
	}else {System.out.println("Tienen la misma edad");}
	}
public int getEdad() {
	return this.edad;
}
void pedirDatos() {
	boolean error = true;
	System.out.println("Dime el nombre del alumno");
	this.nombre=teclado.nextLine();
	while (error == true) {
		try {
			while(this.edad<=0) {
				if(edad<0) {
					System.out.println("No puedes introducir esa edad");
				}
			System.out.println("Dime la edad");
			this.edad=teclado.nextInt();
			}
			error = false;
		}catch(InputMismatchException e) {
			error = true;
			System.out.println("Fallo en la edad");
		}
	}
	error=true;
	while(error==true) {
		try {
			while(this.altura<=0) {
			if(altura<0) {System.out.println("No puedes introducir esa altura");}
			System.out.println("Dime la altura");
			this.altura=teclado.nextInt();
			}
			error = false;
		}catch(InputMismatchException e) {
			System.out.println("Fallo en la altura");
			error = true;
		}

	}
}


	
}
