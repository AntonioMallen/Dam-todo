/**
 * 
 */
import java.util.Scanner;
/**
 * @author alu
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("De que quieres examinarte (suma(1) , diferencia(2) ó producto(3)");
	int tipo = teclado.nextInt();
	int resultado=0;
	if(tipo == 1) {
		for(int contador = 0;contador<10;contador++) {
			int num1 = (int)(Math.random()*20)+1;
			int num2 = (int)(Math.random()*20)+1;
			System.out.println("Cuanto es la suma de "+num1 +" + "+ num2);
			double respuesta = teclado.nextDouble();
			if(respuesta==num1+num2) {
				resultado++;
				System.out.println("Es correcto");
			}else {
			System.out.println("Es erroneo");
			}
		}
	}
	if(tipo == 2) {
		for(int contador = 0;contador<10;contador++) {
			int num1 = (int)(Math.random()*20)+1;
			int num2 = (int)(Math.random()*20)+1;
			System.out.println("Cuanto es la resta de "+num1 +" - "+ num2);
			double respuesta = teclado.nextDouble();
			if(respuesta==num1-num2) {
				resultado++;
				System.out.println("Es correcto");
			}else {
			System.out.println("Es erroneo");
			}
		}
	}
	if(tipo == 3) {
		for(int contador = 0;contador<10;contador++) {
			int num1 = (int)(Math.random()*20)+1;
			int num2 = (int)(Math.random()*20)+1;
			System.out.println("Cuanto es el producto de "+num1 +" * "+ num2);
			double respuesta = teclado.nextDouble();
			if(respuesta==num1*num2) {
				resultado++;
				System.out.println("Es correcto");
			}else {
			System.out.println("Es erroneo");
			}
		}
	}else System.out.println("Ese no es un numero valido");
	System.out.println("Has sacado un "+ resultado);
	}

}
