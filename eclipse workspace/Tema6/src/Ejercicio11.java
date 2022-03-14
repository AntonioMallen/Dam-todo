/**
 * Escribe una clase Matriz y dótala de métodos para instanciarla, 
 * obtener el número de filas o de
   columnas, el valor de una celda, asignar valor a una celda, 
   imprimirla, sumar matrices, restar y
   multiplicar.
 * 
 * @author alu
 *
 */
public class Ejercicio11 {
	protected int filas, columnas;
	private double [][] m;
public Ejercicio11(int columnas) {
	m=new double [columnas][columnas];
}
	
public Ejercicio11(int filas, int columnas) {
		this.filas=filas;
		this.columnas=columnas;
		m=new double[filas][columnas];
		
}
int getColumnas() {
	return columnas;
}
int getFilas() {
	return filas;
}
public void hacerCero (int filas, int columnas) {
	for(int i=0;i<filas;i++) {
		for(int o=0;0<columnas;o++) {
			m[i][o]=0D; // se pone la D para hacer un double de 64 bits de doble precision envede un float de 32 bits
		}
	}
}
public void setValor(int fila, int columna, int valor) {
	m[fila-1][columna-1]=valor;
	if(fila<1|| fila>this.filas) {
		throw new IllegalArgumentException("Error en el numero de fila");
	}
	if(columna<1|| columna>this.columnas) {
		throw new IllegalArgumentException("Error en el numero de columna");
	}

}

public double getValor(int fila, int columna) {
	if(fila<1|| fila>this.filas) {
		throw new IllegalArgumentException("Error en el numero de fila");
	}
	if(columna<1|| columna>this.columnas) {
		throw new IllegalArgumentException("Error en el numero de columna");
	}
	return m[fila-1][columna-1];
}

public Ejercicio11 suma (Ejercicio11 b) {
	if(filas!= b.filas || columnas!=b.columnas) {
		throw new IllegalArgumentException("Las matrices son de dimensiones diferentes");
	}
	System.out.println("Operacion de suma");
	return null;
}
public Ejercicio11 producto(double c) {
	Ejercicio11 p = new Ejercicio11(filas,columnas);
	for(int i =0; i<filas;i++) {
		for(int j=0;j<columnas;j++) {
			p.m[i][j]=m[i][j]*c;
		}
	}
	return p;
}
public Ejercicio11 producto (Ejercicio11 b) {
	if(filas!= b.filas || columnas!=b.columnas) {
		throw new IllegalArgumentException("Las matrices no pueden multiplicarse");
	}
	System.out.println("Operacion de producto");
	return null;
}


}
