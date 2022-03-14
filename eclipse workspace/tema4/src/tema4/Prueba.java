package tema4;
import java.util.*;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		frase= teclado.nextLine();
		
		int caracteres= frase.length();
		
		int contador;
		frase.substring(0,4);

		if (caracteres<80) {
			for (contador=0;contador<caracteres;contador++) {
				char letra=frase.charAt(contador);
			
					System.out.print(letra);
				}
				
					
					
					
				
			
				
			
		
		}else {System.out.print("Son mas de 80 Caracteres");}
		
	}

}
