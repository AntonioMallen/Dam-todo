/*Crear una clase Disco para guardar información sobre los discos de música que
tenemos.
La información asociada a cada uno de los discos es:
Titulo, no de canciones, precio y fecha de compra.*/
public class Disco {
	private String titulo;
	private int numero_canciones;
	private float precio;
	private String fecha_compra;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumero_canciones() {
		return numero_canciones;
	}
	public void setNumero_canciones(int numero_canciones) {
		this.numero_canciones = numero_canciones;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
}