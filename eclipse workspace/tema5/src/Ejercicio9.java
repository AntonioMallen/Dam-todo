/*Escribir un programa que llame a un m�todo con los coeficientes de una ecuaci�n de
segundo grado, a, b y c, y devuelva sus ra�ces en el caso de ser reales.
Nota. Las ra�ces de una ecuaci�n son :

R1=(-b+ra�z(b2-4*a_c))/(2*a)
R2=(-b-ra�z(b2-4*a_c))/(2*a)

Para la ra�z llamar a la clase Math y el m�todo ra�z que es sqrt.
Esta funci�n solo se puede aplicar en el caso de que valor sea positivo es decir:
b^2-4*a*c > 0.*/
import java.util.*;
import java.math.*;
public class Ejercicio9 {
	static double ecuacionpositiva(int a,int b,int c) {
		double r1= ((-b+Math.sqrt((b*b)-4*a*c))/(2*a)); 
		return r1;
	}
	static double ecuacionnegativa(int a,int b,int c) {
		double r2= ((-b-Math.sqrt((b*b)-4*a*c))/(2*a)); 
		return r2;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer numero(a)");
		int a = teclado.nextInt();
		System.out.println("Dime el segundo numero(b)");
		int b = teclado.nextInt();
		System.out.println("Dime el tercero numero(c)");
		int c = teclado.nextInt();
		if(((b*b)-4*a*c)>0) {
			double r1=ecuacionpositiva(a, b, c);
			double r2=ecuacionnegativa(a, b, c);
			System.out.println("El resultado positivo es "+ r1 +" y el resultado negativo es "+r2);
		}else 
		{System.out.println("No valido (Raiz negativa)");}
	}
}