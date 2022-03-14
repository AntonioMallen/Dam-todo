package examen;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
	
		boolean bien=true;
		while (bien==true) {
		System.out.println("introduzca su numero de DNI");
		int dninum= teclado.nextInt();
		System.out.println("introduzca su letra de DNI");
		String letra=teclado.next();
		String letracomprobar="";
		if (dninum<100000000&&dninum>0) {
			switch(dninum%23) {
			case 0:{letracomprobar="T";break;}
			case 1:{letracomprobar="R";break;}
			case 2:{letracomprobar="W";break;}
			case 3:{letracomprobar="A";break;}
			case 4:{letracomprobar="G";break;}
			case 5:{letracomprobar="M";break;}
			case 6:{letracomprobar="Y";break;}
			case 7:{letracomprobar="F";break;}
			case 8:{letracomprobar="P";break;}
			case 9:{letracomprobar="D";break;}
			case 10:{letracomprobar="X";break;}
			case 11:{letracomprobar="B";break;}
			case 12:{letracomprobar="N";break;}
			case 13:{letracomprobar="J";break;}
			case 14:{letracomprobar="Z";break;}
			case 15:{letracomprobar="S";break;}
			case 16:{letracomprobar="Q";break;}
			case 17:{letracomprobar="V";break;}
			case 18:{letracomprobar="H";break;}
			case 19:{letracomprobar="L";break;}
			case 20:{letracomprobar="C";break;}
			case 21:{letracomprobar="K";break;}
			case 22:{letracomprobar="E";break;}
			}
			if (letracomprobar.equals(letra)) {
				System.out.println("esta bien");
				bien=false;}
			else {System.out.println("intentelo de nuevo");}
			}
			
			}
			
			
			
		
		}
	

}
