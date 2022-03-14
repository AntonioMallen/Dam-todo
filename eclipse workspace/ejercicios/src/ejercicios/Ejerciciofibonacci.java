package ejercicios;

import java.util.Scanner;

public class Ejerciciofibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x=0;
		int y=1;
		int suma;
		int contador=1;
		int contadorlimite;
		contadorlimite=teclado.nextInt();
		
		System.out.print(x+" "+ y);
		
		
		while (contador<contadorlimite) {
			
			suma=x+y;
			System.out.print(" "+suma);
			x= y+suma;
			System.out.print(" "+x);
			y=suma+x;
			System.out.print(" "+y);
			contador++;
			
			
			
			
		}
	
	
	}
	  
}	/*	suma	
/*x y (x+y)  (x+2y) (2x+3y) (3x+5y) (5x+8y)
0 1 1 2 3 5 8 13

x+y +y
x+y +(y+x+y)*/