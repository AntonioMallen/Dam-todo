import java.util.*;
public class Ejercicio7 {
	static int opcion1(int r) {
		double longitudcirculo = 3.14159*(r*2);
		int resultado=(int)(longitudcirculo);
		return resultado;
	}
	static int opcion2(int r) {
		double superficiecirculo = 3.14159*(r*r);
		int resultado=(int)(superficiecirculo);
		return resultado;
	}
	static int opcion3(int r) {
		double volumenesfera = (1.33333)*3.14159*(r*r*r);
		int resultado=(int)(volumenesfera);
		return resultado;
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime el radio del circulo o la esfera");
		int r = teclado.nextInt();
		if(r>0) {
		System.out.println("¿Quieres saber la longitud del circulo(1), la superficie del circulo (2) o el volumen de la esfera (3)?");
		int opcion=teclado.nextInt();
		switch (opcion) {
		case 1: {
			int operacion=opcion1(r);
			System.out.println("El resultado es " + operacion);
		}break;
		case 2: {
			int operacion=opcion2(r);
			System.out.println("El resultado es " + operacion);
		}break;
		case 3: {
			int operacion=opcion3(r);
			System.out.println("El resultado es " + operacion);
		}break;
		default:
			System.out.println("No has introducido un numero valido (1,2,3)");
		}
			
	}else {System.out.println("El radio no puede ser un numero negativo");}
}
}