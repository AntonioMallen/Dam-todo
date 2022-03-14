/*
Programa que imprie una felicitación para mamá
author:yo
fecha:hoy
entrada:no hay
salida:mensaje
*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    double F = s.nextDouble();
		double C = (F-32)/1.8;
		System.out.println(F);
	    System.out.println("C es igual a= "+C+ "ºC");
	    
	}
	
}