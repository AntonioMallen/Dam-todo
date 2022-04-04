
package ejercicio1;

import java.util.Random;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		PilaEnteros pila = new PilaReferencia();
		Random r = new Random();
		
		int MAXOPERACIONES =150;

	
		for (int i = 0; i < MAXOPERACIONES; i++) {
			int numero_aleatorio = r.nextInt();
			
			boolean meter = r.nextBoolean();
			System.out.println("Operaciónes "+ i + " "+ (meter||i<20? "meter" : "sacar"));
			if(meter || i<20) {
				pila.push(numero_aleatorio);
			}else {
				pila.pop();
			}	
		}
		PilaEnteros aux = new Pila();
	
		
		System.out.println("Sus componentes son:");
		// este for vale pa imprimir la pila e ir borrando cada valor que es imprimido
		while ( pila.getIndice()>0 ) {
			int x=pila.pop();
			System.out.println(x+" ");
		}
	}

}
