package ejercicios;

import java.util.Scanner;

public class ejerciciotorre {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	System.out.println("Introduce el numero de filas");
	int filas= teclado.nextInt();
	int contador=1;
	int contadordos=1;
	int contadortres;
	for(int contadorcuatro=((filas-contador)*2)+1;contadorcuatro>1;contadorcuatro--) {
		System.out.print(" ");
	}
	System.out.print("   1");
	while(contador<filas) {
		
		System.out.println();
			for(int contadorcuatro=((filas-contador)*2)+1;contadorcuatro>1;contadorcuatro--) {
				System.out.print(" ");
			}
			
			/*if(contador==1) {
				System.out.println("  1  ");
			}*/
			/*if (contador>9) {System.out.print(" ");}*/
			for(contadordos=1;contadordos<contador;contadordos++) {
			System.out.print(" "+contadordos);}
		System.out.print(" "+contador+" ");	
			for(contadortres=contador+1;contadortres>0;contadortres--) {
				System.out.print(contadortres+" ");}
		
			
		
			contador++;
		
		
	}
}
}
/*	while(contadordos<contador) {
System.out.print(contadordos+" ");
contadordos++;}
*/