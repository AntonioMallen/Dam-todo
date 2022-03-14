package examen;
import java.util.Scanner;
public class ej1_aburrimiento {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	System.out.println("Dime cuantas lineas quieres(numero mayor que 0) xaval");
	int n= teclado.nextInt();
	System.out.println("n="+n);
	System.out.println();
	if(n>0) {
		for(int contador=1;contador<=n;contador++) {
			for(int contadorespacio=n-contador;contadorespacio>0;contadorespacio--) {
				System.out.print(" ");
			}
			for(int contadorasterisco =0;contadorasterisco<contador;contadorasterisco++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}else {System.out.println("Tiene que ser un numero mayor que 0");}
	}

}
