/*Crear una clase llamada Empleado que contenga como datos miembro el nombre y
el número de empleado, y como métodos miembro leerDatos( ) para leer los datos
desde teclado y verDatos( ) para mostrarlos en pantalla, además de los getters y
setters que sean necesarios.*/
import java.util.Scanner;
public class Empleado {
	private String nombre;
	private int numero;
	
void leer_Datos(){
	Scanner teclado= new Scanner(System.in);
	System.out.println("introduzca nombre");
	this.nombre= teclado.nextLine();
	System.out.println("introduzca numero");
	this.numero= teclado.nextInt();
}
void ver_Datos(){
	
	System.out.println(this.nombre);
	
	System.out.println(this.numero);
}
public String getNombre() {
	return nombre;
} 
public String setNombre(String newnombre) {
	this.nombre=newnombre;
	return newnombre;
}
public int setNumero(int newnumero) {
	this.numero=newnumero;
	return newnumero;
}
public static void main (String[] args) {

	Empleado jp= new Empleado();
jp.leer_Datos();
jp.ver_Datos();
jp.getNombre();
jp.setNombre("A");
jp.setNumero(99);
jp.ver_Datos();
}
}