package Ejercicio4;

public class Usuario {
	private String nombre;
	private String contrasenia;
	Usuario(String nombre, String contrasenia){
		
	}
	public boolean comprobar (String comprobar) {
		boolean resultado;
		int tam=comprobar.length();
		for(int i=0;i<tam;i++) {
			(comprobar.charAt(i)<20&&comprobar.charAt(i)>90)
		}
		return;
	}
}
