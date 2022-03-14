import java.util.*;
public class Ejercicio6 {
	public static int minimoComunMultiplo(int a, int b) {
		int num1=a;
		int num2=b;
	    int temporal; 
	    while (b != 0) {
	        temporal = b;
	        b = a % b;
	        a = temporal;
	    }
	    int mcm=(num1*num2)/a;
	    return mcm;
	}
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dime el primer numero");
		int a = teclado.nextInt();
		System.out.println("Dime el segundo numero");
		int b = teclado.nextInt();
		int mcm=minimoComunMultiplo(a, b);
		System.out.println("El minimo comun multiplo entre "+ a +" y "+ b + " es "+ mcm);	
	}
}