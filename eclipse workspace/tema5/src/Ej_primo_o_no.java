import java.util.*;
/** 
método que determina si el numero es primo o no
@params numero numero que deseamos comprobar
@return true si es primo: false si no lo es
*/
class Ej_primo_o_no {
static boolean esPrimo(int numero) {
	boolean primo ;
	int contadorprim=0;
	for(int contador=1;numero!=contador;contador++) {
		if(numero%contador==0) {
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
	primo = esPrimo(numero);
	System.out.println(primo);
	}

}
