import java.util.*;
public class Comedor {
	private int indice;
	Menu[] listaMenus;
	Comedor(){
		indice=0;
		listaMenus= new Menu[100];
	}
	//un metodo para que nel cliente ordene, 
	//siempre teniendo en cuenta que el total de menus <100
	/*
	 * en constructor de comedor vector de 100 menus
	 * 
	 * Objeto menu con 6 platos
	 * Objeto Comedor
	 * Cada comedor tendra 1 menu con 6 platos
	 *
	 */
public void pedir(){
		int precioMenus=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("¿Cuántos menús querrá el señor?");
		int numeroMenus=teclado.nextInt();
		for (int i=0;i<numeroMenus;i++) {
		Menu menuActual = new Menu();
		listaMenus[indice]=menuActual;
		indice++;
		}
		int contador=1;
		for(int i =indice-numeroMenus;i<indice;i++) {
			System.out.println("MENU "+contador);
			listaMenus[i].infoMenu();
			precioMenus+=listaMenus[i].getPrecioMenu();
			contador++;
		}
		System.out.println("El precio de los menus es "+ precioMenus);
		System.out.println("¿Cuanto dinero me entrega?");
		
		boolean dineroBien=false;
		while (dineroBien==false) {
			int dineroEntregado= teclado.nextInt();
			if(dineroEntregado>=precioMenus) {
				System.out.println("Su cambio: "+(dineroEntregado-precioMenus)+"€");
				dineroBien=true;
				System.out.println("Gracias por intercambiar unidades monetarias por Alfalfa");}
			else {System.out.println("no me seas rata");}
	}
	}


	public static void main(String[] args) {
		Comedor h = new Comedor();
		h.pedir();

	}

}
