/*
 * 3) Leer un vector de 10 componentes enteros; 
 * calcular el mayor, el menor y los lugares donde se
encuentran.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int mayor=0;
		int menor=0;
		int mayorlugar=0;
		int menorlugar=0;
		int [] vector = new int[10];
		for(int i=0;i<10;i++) {
			if(vector[i]>mayor) {
				vector[i]=mayor;
				mayorlugar=i;
			}
			if(vector[i]<menor) {
				vector[i]=menor;
				menorlugar=i;
			}
			
		}

	}

}
