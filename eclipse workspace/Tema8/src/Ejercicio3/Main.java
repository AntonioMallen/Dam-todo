package Ejercicio3;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean bien=true;
		Dividir d= new Dividir();
		Dividir g = new Dividir();
		while(bien) {
		try {System.out.println(d.calculo());}
		
		catch(IOException e) {
			System.out.println(""+e.getMessage());bien=false;
		}
		catch(InputMismatchException e) {
			System.out.println("has puesto una letra");bien=false;
		}
		catch(ArithmeticException e) {
			System.out.println(""+e.getMessage());bien=false;
		}
		}
	System.out.println("se caba el programa");}
}
