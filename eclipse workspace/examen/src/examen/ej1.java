package examen;
import java.util.*;
/*1.- Programa que solicite introducir un entero positivo y obtenga por pantalla la siguiente salida,
según el valor introducido. (2,5 puntos)

N=3 N=4
   *
  **
 ***

    *
   **
  ***
 **** */

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("cuantas filas quieres");
		int filas= teclado.nextInt();
		for (int contador=1; contador<=filas;contador++) {
			for (int espacios=contador; espacios<filas;espacios++) {
				System.out.print(" ");
				
			}
			for (int asterisco=contador;asterisco>0;asterisco--) {System.out.print("*");}
			System.out.println();
			
		}
	}

}
