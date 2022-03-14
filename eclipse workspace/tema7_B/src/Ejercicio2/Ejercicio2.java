package Ejercicio2;
/*
 * Escribe un programa que controle los datos de todas las personas que trabajan en una
empresa. De todas ellas, nos interesa: nombre, sueldo base (el mismo para todos) y
edad. Entre los empleados que trabajan en la empresa, hay dos grupos de personas de
las que nos interesa algún dato más:
 Los administrativos: de los cuales, nos interesan estudios académicos y
número de ordenador asignado.
 Los maquinistas: de los cuales nos interesan número de máquina asignada y la
cantidad de años que lleva con dicha máquina.
Es obligatorio usar constructores en cada una de las clases que se encarguen de pedir
los datos de dichos empleados. El método “visualizarTodosDatos()” estará en todas las
clases y se encargará de visualizar todos los datos de la clase donde está.
El programa pedirá que el usuario indique el número de empleados que pertenecen al
grupo de los administrativos, al grupo de los maquinistas y número de empleados que
no están en ninguno de estos dos grupos. Posteriormente se pedirán los datos de cada
uno de ellos.
Visualiza los datos de cada uno de ellos (por grupos). Para ello se usará un único
método preparado para recibir los datos de un grupo de trabajadores con el fin de
visualizar sus datos.
 */

import java.util.*;

// Clase de todos los empleados en general (Datos genericos para luego crear clases hijas)
public class Ejercicio2 {
	Scanner teclado=new Scanner(System.in);
	private String nombre;
	private int sueldo;
	private int edad;
	Ejercicio2(){
		System.out.println("Dime el nombre del empleado");
		this.nombre=teclado.next();
		this.sueldo=1000;
		System.out.println("Dime la edad del empleado");
		this.edad=teclado.nextInt();
	}
	public void visualizarTodosDatos(){
		System.out.println("Nombre de empleado: "+nombre);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Edad del empleado: "+edad);
	}
	public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
	 System.out.println("Dime el numero de personas en los administrativos");
	 int num_administrativos = teclado.nextInt();
	 Los_administrativos [] adminis=new Los_administrativos[num_administrativos];
	 
	 
	 System.out.println("Dime el numero de personas en los maquinistas");
	 int num_maquinistas = teclado.nextInt();
	 Los_maquinistas [] maquinistas=new Los_maquinistas[num_maquinistas];
	 
	 
	 System.out.println("Dime el numero de personas de otros grupos");
	 int num_resto_gente = teclado.nextInt();
	 Ejercicio2 [] otros=new Ejercicio2[num_resto_gente];
	 
	 
	 System.out.println("Datos de los administrativos");
	 for(int i=0;i<num_administrativos;i++) {
		 Los_administrativos empleado =new Los_administrativos();
		 adminis[i]=empleado;
		 System.out.println();
	 }
	 System.out.println("Datos de los maquinistas");
	 for(int i=0;i<num_maquinistas;i++) {
		 Los_maquinistas empleado =new Los_maquinistas();
		 maquinistas[i]=empleado;
		 System.out.println();
	 }
	 System.out.println("Datos de los otros");
	 for(int i=0;i<num_resto_gente;i++) {
		 Ejercicio2 empleado =new Ejercicio2();
		 otros[i]=empleado;
		 System.out.println();
	 }
	 for(int i=0;i<num_administrativos;i++) {
	 adminis[i].visualizarTodosDatos();
	 System.out.println();
	 }
	 for(int i=0;i<num_maquinistas;i++) {
	 maquinistas[i].visualizarTodosDatos();
	 System.out.println();
	 }
	 for(int i=0;i<num_resto_gente;i++) {
	 otros[i].visualizarTodosDatos();
	 System.out.println();
	 }
	}
}
class Los_administrativos extends Ejercicio2{
Scanner teclado=new Scanner(System.in);
	private String estudios_academicos;
	private int num_ordenador;
	Los_administrativos(){
		System.out.println("Dime los estudios academicos");
		this.estudios_academicos=teclado.next();
		System.out.println("Dime el numero de ordenador asignado");
		this.num_ordenador=teclado.nextInt();
	}
	public void visualizarTodosDatos(){
		super.visualizarTodosDatos();
		System.out.println("Estudios academicos: "+estudios_academicos);
		System.out.println("Numero de ordenador asignado: "+num_ordenador);
	}
}
class Los_maquinistas extends Ejercicio2{
	Scanner teclado=new Scanner(System.in);
	private int num_maquinas;
	private int cantidad_años;
	Los_maquinistas(){
		System.out.println("Dime el numero de maquinas asignado");
		this.num_maquinas=teclado.nextInt();
		System.out.println("Dime el numero de años en la maquina");
		this.cantidad_años=teclado.nextInt();
	}
	public void visualizarTodosDatos(){
		super.visualizarTodosDatos();
		System.out.println("Numero de maquina asignado: "+num_maquinas);
		System.out.println("Cantidad de años en la maquina: "+cantidad_años);
	}
}