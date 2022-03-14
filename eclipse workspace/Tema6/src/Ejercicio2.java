/*
 * 2) Leer dos vectores de dimensión 10 para construir un tercer vector cuyos componentes sean la
suma de los dos anteriores e imprimirlo
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		int []vector1=new int [10];
		int []vector2=new int [10];
		int []vector3=new int [10];
		for (int i=0;i<10;i++) {
			vector3[i]=vector1[i]+vector2[i];
			System.out.println(vector3[i]);
		}
		
		

	}

}
