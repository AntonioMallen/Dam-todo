
/** 
Dado un número N que se pedirá por teclado y debe ser positivo, imprimir la lista de
todos los numero primos hasta dicho número incluido.
Hacer este programa usando el método primo que ya tenéis construido.
*/
import java.util.*;
/** 

*/
class ejercicio4{
static boolean esPrimo(int contadordos) {
	boolean primo ;
	int contadorprim=0;
	int contador=1;
	
	for(contador=1;contadordos!=contador;contador++) {
		if(contadordos%contador==0) {
			contadorprim++;
		}
	}
	if(contadorprim<=1) {
		primo=true;
	}else primo=false;
	
	return primo;
}
	
public static void main(String[] args) {
	int numero;
	boolean primo;
	java.util.Scanner teclado=new Scanner(System.in);
	System.out.println("Dime un numero");
	numero = teclado.nextInt();
	for (int contadordos=1;contadordos!=numero;contadordos++) {
	primo = esPrimo(contadordos);
	if (primo==true){System.out.println(contadordos);}
	
	}

}}
