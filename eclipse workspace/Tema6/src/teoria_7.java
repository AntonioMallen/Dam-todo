import java.util.*;
public class teoria_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] a = new int[100];
		int[] b = new int[100];
		int j;
		int m;
		int sumaA = 0;
		int sumaB = 0;
		int sumaDiff = 0;
		m = teclado.nextInt();
		// 5 11 15 19 14 4 2 17 6 1 3
		for ( j = 0; j < m; j++ ) {
		a[j] = teclado.nextInt();
		b[j] = teclado.nextInt();
		sumaA = sumaA + a[j];
		sumaB = sumaB + b[j];
		sumaDiff = sumaDiff + (a[j] - b[j]);
		}
		for ( j = m - 1; j >= 0; j-- ) {
		System.out.println(a[j] + " " + b[j] + " " + (a[j] - b[j]));}
		System.out.println();
		System.out.println(sumaA + " " + sumaB + " " + sumaDiff);

	}

}
