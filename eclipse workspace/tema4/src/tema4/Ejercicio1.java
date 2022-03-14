package tema4;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		frase= teclado.nextLine();
		
		int caracteres= frase.length();
		int contadordos;
		int contador;
	
		if (caracteres<80) {
			for (contador=0;contador<caracteres;contador++) {
				
				for (contadordos=0;contadordos<=contador;contadordos++) {
					char letrados=frase.charAt(contadordos);
					System.out.print(letrados);
				}
				System.out.println();
					
					
					
				
			
				
			}
		
		}else {System.out.print("Son mas de 80 Caracteres");}
		
	}

}
