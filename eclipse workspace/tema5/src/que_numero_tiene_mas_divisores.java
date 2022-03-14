
import java.util.*;
class que_numero_tiene_mas_divisores {
	static int masDivisores(int p, int q) {
		int comprobar;
		int contadordiv = 0;
		int contadordiv2 = 0;
		for (int i = 1;i != q;i++) {
			if (q % i == 0) {
				contadordiv++;
			}
		}
		for (int j = 1;j != p;j++) {
			if (p % j == 0) {
				contadordiv2++;
			}
		}
		if (contadordiv > contadordiv2) {
			comprobar = 1;
		}else if (contadordiv < contadordiv2) {
			comprobar = -1;
		}else comprobar = 0;
		return comprobar;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int comprobar;
		int p,q;
			System.out.println("Introduzca un número");
			p = teclado.nextInt();
			System.out.println("Introduzca otro un número");
			q = teclado.nextInt();
			if (p < 0) {
				System.out.println("Error 1");
			}else if (q < 0) {
				System.out.println("Error 2");
			}else {
				comprobar = masDivisores(p,q);
				if (comprobar == 0) {
					System.out.println("Tienen los mismos divisores");
				}else if (comprobar == 1) {
					System.out.println("El número " + q + " tiene más divisores");
				}else System.out.println("El número " + p + " tiene más divisores");
			}
		
	}
}
