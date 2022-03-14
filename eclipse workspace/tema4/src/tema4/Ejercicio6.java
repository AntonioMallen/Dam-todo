package tema4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		frase= teclado.nextLine();
		
		int caracteres= frase.length();
		int contadordos;
		int contador;
		int contadorvocal=0;
		int contadornumero=0;
		int contadorconsonantes= 0;
		if (caracteres<80) {
				for (contador=0;contador<caracteres;contador++) {
					char letra=frase.charAt(contador);
					if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'
							||letra=='A' ||letra=='E'||letra=='I'||letra=='O'||letra=='U') {
						contadorvocal++;
					}
					else if(letra=='1'||letra=='2'||letra=='3'||letra=='4'||letra=='5'
							||letra=='6'||letra=='7'||letra=='8'||letra=='9'||letra=='0') {
						contadornumero++;
						
					}else if(letra>'a'&&letra<='z' || letra>'A'&&letra<='Z'&&letra!='a'&&letra!='e'&&letra!='i'&&letra!='o'&&letra!='u'
							&&letra!='A' &&letra!='E'&&letra!='I'&&letra!='O'&&letra!='U') {
						contadorconsonantes++;
					}
				
					
					
				}
System.out.println("el numero de vocales es "+contadorvocal);
System.out.println("el numero de numeros es "+contadornumero);
System.out.println("el numero de consonantes es "+contadorconsonantes);
}
}
}