import java.util.*;
public class Menu {
	private String primerplato="";
	private String segundoplato="";
	private int [] precios= {8,6,7,5,6,4};
	private int precioPrimero;
	private int precioSegundo;
	private int precioTotal;
	private String [] platos= {"Alubias","Lentejas","Garbanzos","Alfalfa","Guisantes","Cacahuetes"};
	Menu (){
		Scanner teclado= new Scanner(System.in);
		System.out.println("elige dos platos de los 6");
		for(int i=0;i<6;i++) {
			System.out.print("Plato "+ (i+1) +": "+platos[i]);
			System.out.println(" "+precios[i]+" €");
		}
		System.out.println("Dime el primer plato");
		int primero=teclado.nextInt();
		System.out.println("Dime el segundo plato");
		int segundo=teclado.nextInt();
		switch (primero) {
		case 1:{
			primerplato+=platos[0];
			precioPrimero=precios[0];
			break;
		}
		case 2:{
			primerplato+=platos[1];
			precioPrimero=precios[1];
			break;
		}
		case 3:{
			primerplato+=platos[2];
			precioPrimero=precios[2];
			break;
		}
		case 4:{
			primerplato+=platos[3];
			precioPrimero=precios[3];
			break;
		}
		case 5:{
			primerplato+=platos[4];
			precioPrimero=precios[4];
			break;
		}
		case 6:{
			primerplato+=platos[5];
			precioPrimero=precios[5];
			break;
		}
		default:{System.out.println("por favor no me jodas el programa");}
		}
		switch (segundo) {
		case 1:{
			precioSegundo=precios[0];
			segundoplato+=platos[0];
			break;
		}
		case 2:{
			segundoplato+=platos[1];
			precioSegundo=precios[1];
			break;
		}
		case 3:{
			segundoplato+=platos[2];
			precioSegundo=precios[2];
			break;
		}
		case 4:{
			segundoplato+=platos[3];
			precioSegundo=precios[3];
			break;
		}
		case 5:{
			segundoplato+=platos[4];
			precioSegundo=precios[4];
			break;
		}
		case 6:{
			segundoplato+=platos[5];
			precioSegundo=precios[5];
			break;
		}
		default:{System.out.println("por favor no me jodas el programa");}
		}
		precioTotal= precioPrimero+precioSegundo;
		
	}
public int getPrecioMenu() {
	return precioTotal;
	
}

public void infoMenu(){
	Scanner teclado= new Scanner(System.in);
	System.out.println("Precio primero:"+this.precioPrimero);
	System.out.println("Precio segundo:"+this.precioSegundo);
	System.out.println("Precio total:"+this.precioTotal);
	

	}
	
	}


