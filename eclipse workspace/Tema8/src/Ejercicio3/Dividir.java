package Ejercicio3;
import java.io.IOException;
import java.util.*;
/**
 * Diseña un programa que pida el dividendo y el divisor y muestre el cociente de la división
entera. Este proceso se repetirá hasta que se inserte como divisor un cero o se introduzca
un dato que no sea válido como número. La división por cero se controla con el error
ArithmeticException.
Para hacerlo se usarán, al menos, estos tres métodos:
• Uno que pida una cadena.
• Otro que pida un número entero.
• Otro que calcule y visualice el cociente de dicha división.
Si se produce un error en uno de estos métodos hay que dejar que se propague.
*
 * @author alu
 *
 */
public class Dividir {
	private int dividendo;
	private String cadena;
	Scanner teclado=new Scanner(System.in);
	
	boolean error=false;
	Integer pedirCadena() throws IOException{
	Integer divisor=0;
	
	System.out.println("Dime el divisor");
	cadena="";
	this.cadena=teclado.next();
	for( int i = 0; i < cadena.length() && error != true; i++ ) {
		if (cadena.charAt(i) >= '0' && cadena.charAt(i) <= '9') {
			error = false;
		}else {
			error = true;
		}
	}
	if (error == true) {
		throw new IOException("Si es que eres tonto, te estoy pidiendo numeros no letras.");
	}
	if(cadena.equals("0")) {
		throw new IOException("No puedes dividir entre 0");
	}
	
	divisor=Integer.parseInt(cadena);
	
	return divisor;
	}
	
	int pedirInt() {
		System.out.println("dime dividendo");
		
		int dividendo=teclado.nextInt();
		return dividendo;
		
	}
	
	double calculo() throws IOException {
		double resultado= (double)(pedirInt())/(double)(pedirCadena());
		return resultado;
		
	}

}

