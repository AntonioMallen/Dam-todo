package examen;
import java.util.Scanner;
public class Ej3_aburrimiento {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Dime el dia inicial");
	int diainicial=teclado.nextInt();
	System.out.println("Dime el mes inicial");
	int mesinicial=teclado.nextInt();
	System.out.println("Dime el año inicial");
	int añoinicial=teclado.nextInt();
	System.out.println("Dime el dia final");
	int diafinal=teclado.nextInt();
	System.out.println("Dime el mes final");
	int mesfinal=teclado.nextInt();
	System.out.println("Dime el año final");
	int añofinal=teclado.nextInt();
	int diastotales=0;
	int numdias=0;
	int numdiasmenos=0;
	int ajustemas=0;
	int ajustemenos=0;
		
		for (int a =añoinicial;añoinicial!=añofinal;añofinal++){
			diastotales+=366;
			if(añoinicial%4==0){
			}else{
			diastotales+=365;
			}
		}
		for(int contadormes=1;contadormes!=mesfinal;contadormes++){
		switch(contadormes){
			case 1,3,5,7,8,10,12:
				numdias=31;break;
			case 2:
				if(añofinal%4==0){
				numdias=29;
				}else{numdias=28;}break;
			default:
				numdias=30;break;
		}
		ajustemas+=numdias;
		}
		ajustemas+=(diafinal-1);
		for(int contadormenos=1;contadormenos!=mesinicial;contadormenos++){
		switch(contadormenos){
			case 1,3,5,7,8,10,12:
				numdiasmenos=31;break;
			case 2:
				if(añoinicial%4==0){
				numdiasmenos=29;
				}else{numdiasmenos=28;}break;
			default:
				numdiasmenos=30;break;
		}
		ajustemenos+=numdiasmenos;
		}
		ajustemenos+=(diainicial-1);
diastotales=diastotales+ajustemas-ajustemenos;
		System.out.println("La cantidad de dias que han pasado es "+diastotales);
	System.out.println("Aun nofunciona");
	}

}
