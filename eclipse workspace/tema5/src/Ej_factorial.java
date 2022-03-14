import java.util.Scanner;
public class Ej_factorial {
	static int factorial(int numero) {
		int resultado = 1;
		for(int contador=numero;contador!=0;contador--) {
			resultado = contador * resultado;
		}
		return resultado;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int resultado;
		System.out.println("Dime un numero para hacer su factorial");
		int numero = teclado.nextInt();
		resultado= factorial(numero);
		System.out.println(resultado);
	}

}
