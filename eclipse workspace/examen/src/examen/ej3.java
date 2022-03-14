package examen;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int diainicio=0;
		int mesinicio=0;
		int añoinicio=0;
		int diafinal=0;
		int mesfinal=0;
		int añofinal=0;
		int dia=0;
		int diatotal=0;
		System.out.println("introduce dia mes y año de incio");
		diainicio= teclado.nextInt(); 
		mesinicio= teclado.nextInt();
		añoinicio= teclado.nextInt();
		System.out.println("introduce dia mes y año de final");
		diafinal= teclado.nextInt();
		mesfinal= teclado.nextInt();
		añofinal= teclado.nextInt();
		dia=0;
		while((mesinicio!=mesfinal)&&(añoinicio!=añofinal)) {
			diatotal+=dia;
			System.out.println(añoinicio);
			System.out.println(mesinicio);
			System.out.println(diatotal);
			dia=0;
			if (mesinicio==13) {mesinicio=mesinicio-12;
								añoinicio++;}else {
			while (mesinicio==1&&diainicio<=31) {dia++;}
			while (mesinicio==2&&añoinicio%4==0&&dia<29) {dia++;}
			while (mesinicio==2&&añoinicio%4!=0&&dia<28) {dia++;}
			while (mesinicio==3&&dia<31) {dia++;}
			while (mesinicio==4&&dia<30) {dia++;}
			while (mesinicio==5&&dia<31) {dia++;}
			while (mesinicio==6&&dia<30) {dia++;}
			while (mesinicio==7&&dia<31) {dia++;}
			while (mesinicio==8&&dia<31) {dia++;}
			while (mesinicio==9&&dia<30) {dia++;}
			while (mesinicio==10&&dia<31) {dia++;}
			while (mesinicio==11&&dia<30) {dia++;}
			while (mesinicio==12&&dia<31) {dia++;}
			mesinicio++;}}
		diatotal=diatotal-diainicio+diafinal;
		
		System.out.println("los dias totales son " + diatotal);
		
	}

}
