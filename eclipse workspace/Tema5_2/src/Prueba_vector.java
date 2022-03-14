import java.util.*;
public class Prueba_vector {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] valor = new int[10];
		
		int[] patatas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] patata = new int[valor.length];
	for(int i=0; i < valor.length; i++) {
		valor[i]=teclado.nextInt();
	}
	for(int i=0; i<10; i++) {
		System.out.println(valor[i]);
	}
	}

}
