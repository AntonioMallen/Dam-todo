package examen;
import java.util.Scanner;
public class Ej_2_otraforma {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String secuencia="TRWAGMYFPDXBNJZSQVHLCKE";
	boolean verdadero=false;
	while (verdadero==false){
		System.out.println("Dime el numero de tu NIF");
		int num=teclado.nextInt();
	if (num>0&&num<100000000) {
		System.out.println("Dime la letra de tu NIF");
		String letra1=teclado.next();
		letra1=letra1.toUpperCase();
		char letra=letra1.charAt(0);
		char validacion=secuencia.charAt(num%23);
		if(letra==validacion) {
			System.out.println("Esta bien el NIF");
			verdadero=true;
		}else {System.out.println("El NIF no es valido"); verdadero=false;}
	}else {System.out.println("El numero introducido no es valido");
	}
	}
}
}