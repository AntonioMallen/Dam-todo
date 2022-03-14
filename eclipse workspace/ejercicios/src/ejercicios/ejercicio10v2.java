package ejercicios;

import java.util.Scanner;

public class ejercicio10v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		boolean siguienteprimo=false;
		
		System.out.println("Introduce un numero");
		numero= teclado.nextInt();

		

	int contador;
		numero=numero+1;
   while (siguienteprimo==false) {
	 int primo=0;
		for(contador=numero;contador>0;contador--) { // El programa va desde el numero introducido hasta n comprobando si el numero introducido se puede dividir por cada numero de 0 hasta n
			
			if (numero%contador==0) { 
				
				primo++;// en caso de que sea primo solo sumara el propio numero y 1
			}	
			
		}
		if (primo==2)
				siguienteprimo=true;
		
		numero++;
		}System.out.println(numero-1);
		
}
}
