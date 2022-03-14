package ejercicios;

import java.util.Scanner;

public class pruebanose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		boolean x=true;
	
		System.out.println("Introduce un numero");
		n= teclado.nextInt();
		int contador =n;
		while(x==true){
			contador++;
			if(n%contador!=0) {
				System.out.println(contador);
				x=false;
			}
		}
		/*for(contador; x=false;contador++) {
			if(n%contador!=0) {
				System.out.println(contador);
			}
		}
		*/
	}

}
