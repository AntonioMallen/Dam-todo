
public class Lista {
	String [] lista;
	int cantidad;
	Lista(){
		lista= new String[10];
		cantidad=0;
	}
/* se comprueba que no este lleno
 * se comprueba si esta vacia, si lo esta se mete al principio
 * en un bucle for de 0 a cantidad
 * Comprobar primera letra del introducido con vector  [i] 
 * si es menor que i : se desplaza una posicion a partir de i y se mete en i
 * si es mayor que i: se comprueba el siguiente
 * si es igual pasas de letra 
 * se suma 1 a cantidad
 * se sale del bucle, se busca la string en la lista y si n oesta se introduce
 */
	public void insertar (String presidente) {
		if (lista.length<10) {
		if (listaVacia()) {/*meter al principio*/}
		for (int i=0;i<cantidad&&buscar(presidente)==false;i++) {
			for (int j=0;j<presidente.length()-1&&buscar(presidente)==false;j++) {
				if(presidente.charAt(j)<lista[i].charAt(j)) {
					for(int k=cantidad;k>i;k--) {
						// mover alreves( de atras a alante)
						lista[k]=lista[k-1];}
					/*se caba el bucle y se mete en i*/
					lista[i]=presidente;
					
				/*se desplaza todo a partir de i a i+1 y luego se introduce en i*/
				}
				if(presidente.charAt(j)>lista[i].charAt(j)) {
				/*se desplaza i para comprobar el siguiente*/
					break;
				}
				if(presidente.charAt(j)==lista[i].charAt(j)) {
				/*se desplaza j*/
				}
			}	
		}
		if(buscar(presidente)==false) {
			/*se mete en lista[cantidad]*/
		}
		cantidad++;
		}
		}
	

	

}
