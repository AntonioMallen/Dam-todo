/*Crear una clase Disco para guardar información sobre los discos de música que
tenemos.
La información asociada a cada uno de los discos es:
Titulo, no de canciones, precio y fecha de compra.*/

import java.util.Scanner;
public class Disco {
	private String titulo;
	private int numero_canciones;
	private double precio;
	private String fecha_compra;
	
	Disco(){
		
		System.out.println("introduzca nombre del disco");
		titulo=teclado.nextLine();
		System.out.println("introduzca numero de canciones del disco");
		numero_canciones=teclado.nextInt();
		System.out.println("introduzca precio del disco");
		
		precio=teclado.nextDouble();
		System.out.println("introduzca fecha de compra del disco");
		teclado.nextLine();
		this.fecha_compra=teclado.nextLine();
		
	}
	public String getTitulo() {
		return titulo;
	}
	Scanner teclado= new Scanner(System.in);
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumero_canciones() {
		return numero_canciones;
	}
	public void setNumero_canciones(int numero_canciones) {
		this.numero_canciones = numero_canciones;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	public void mostrarPantalla() {
		System.out.println("El titulo del disco es "+this.getTitulo());
		System.out.println("El numero de canciones en el disco es: "+this.getNumero_canciones());
		System.out.println("El precio del disco es: "+this.getPrecio());
		System.out.println("La fecha de compra del disco es: "+this.getFecha_compra());
	}
}