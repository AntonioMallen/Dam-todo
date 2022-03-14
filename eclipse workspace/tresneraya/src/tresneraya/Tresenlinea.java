
package tresneraya;
import java.util.*;
/**
 *Este programa trata de representar un 3 en linea
 * 
 * @author alu
 *@version 1.0
 */
public class Tresenlinea {
	/**
	 * Creamos una matriz que representara el tablero de juego siendo asi un 3x3
	 */
	char[][] tablero = { { ' ', ' ', ' ', }, { ' ', ' ', ' ', }, { ' ', ' ', ' ' } };
	/**
	 * Contamos las victorias de el jugador uno
	 */
	int victoriasuno = 0;
	/**
	 * Contamos las victorias de el jugador dos
	 */
	int victoriasdos = 0;
	/**
	 * Son los empates entre ambos jugadores
	 */
	int empatecontador = 0;

	
	/**
	 * Con el constructor se comienza directamente una partida en caso
	 * de que se cree un objeto de esta clase
	 */
	public void empezarPartida() {
		Scanner teclado= new Scanner(System.in);
		/**
		 *Determinamos a quien le va tocando en cada turno dependiendo del valor.
		 * En los pares sera el turno del jugador 2 y en los impares el turno 
		 * del jugador uno siendo asi el primer turno cuando juega el jugador 1.
		 */
		int turno=1;
		/**
		 * Con el boleano end determinamos cuando termina la partida, a no ser que
		 * su valor sea true, la partida seguira.
		 */
		boolean end=false;
		
		while (end==false) {
			if (turno%2==0) {System.out.println("le toca al jugador 2");}
			if (turno%2==1) {System.out.println("le toca al jugador 1");}
			System.out.println("introduzca posicion de la ficha en el teclado numerico");
			if (turno%2==0) {int posicion=teclado.nextInt();
			/**
			 * Con el switch de posicion comprobamos si en el numero deseado hay una pieza,
			 * si no la hay se colocara una del jugador que le toque dependiendo del turno
			 */
					switch (posicion)
					{
					case 1: 
						if (tablero[2][0]==' ')
						tablero[2][0]='o';
						else {System.out.println("ya hay una pieza ahi");turno--;}
					break;
					case 2:
						if(tablero[2][1]==' ')
						tablero[2][1]='o';
						else {System.out.println("ya hay una pieza ahi");turno--;}
					break;
					case 3:
						if(tablero[2][2]==' ')
						tablero[2][2]='o';
						else {System.out.println("ya hay una pieza ahi");turno--;}
					break;
					case 4: 
						if(tablero[1][0]==' ')
							tablero[1][0]='o';
							else {System.out.println("ya hay una pieza ahi");turno--;}
					break;
					case 5: 
						if(tablero[1][1]==' ')
							tablero[1][1]='o';
							else {System.out.println("ya hay una pieza ahi");turno--;}
					break;
					case 6: 
						if(tablero[1][2]==' ')
							tablero[1][2]='o';
							else {System.out.println("ya hay una pieza ahi");turno--;}
					break;
					case 7: 
						if(tablero[0][0]==' ')
							tablero[0][0]='o';
							else {System.out.println("ya hay una pieza ahi");turno--;}
					break;
					case 8: 
						if(tablero[0][1]==' ')
							tablero[0][1]='o';
							else {System.out.println("ya hay una pieza ahi");turno--;}tablero[0][1]='o';break;
					case 9: 
						if(tablero[0][2]==' ')
							tablero[0][2]='o';
							else {System.out.println("ya hay una pieza ahi");turno--;}
						break;
					}
			}
			if (turno%2==1) {int posicion=teclado.nextInt();
			switch (posicion)
			{
			case 1: 
				if (tablero[2][0]==' ')
				tablero[2][0]='x';
				else {System.out.println("ya hay una pieza ahi");turno--;}
			break;
			case 2:
				if(tablero[2][1]==' ')
				tablero[2][1]='x';
				else {System.out.println("ya hay una pieza ahi");turno--;}
				break;
			case 3:
				if(tablero[2][2]==' ')
				tablero[2][2]='x';
				else {System.out.println("ya hay una pieza ahi");turno--;}
				break;
			case 4: 
				if(tablero[1][0]==' ')
					tablero[1][0]='x';
					else {System.out.println("ya hay una pieza ahi");turno--;}
			break;
			case 5: 
				if(tablero[1][1]==' ')
					tablero[1][1]='x';
					else {System.out.println("ya hay una pieza ahi");turno--;}
				break;
			case 6: 
				if(tablero[1][2]==' ')
					tablero[1][2]='x';
					else {System.out.println("ya hay una pieza ahi");turno--;}
				break;
			case 7: 
				if(tablero[0][0]==' ')
					tablero[0][0]='x';
					else {System.out.println("ya hay una pieza ahi");turno--;}
				break;
			case 8: 
				if(tablero[0][1]==' ')
					tablero[0][1]='x';
					else {System.out.println("ya hay una pieza ahi");turno--;};break;
			case 9: 
				if(tablero[0][2]==' ')
					tablero[0][2]='x';
					else {System.out.println("ya hay una pieza ahi");turno--;}
				break;
			}
	}
				
			/**
			 * Con los siguientes ifs comprobamos que si se alinean tres piezas de un mismo
			 * usuario, se le avise de que ha ganado y se le sume uno al contador
			 * de victorias de ese usuario.
			 */
			if(tablero[0][0]=='x'&tablero[0][1]=='x'&tablero[0][2]=='x'||
			   tablero[1][0]=='x'&tablero[1][1]=='x'&tablero[1][2]=='x'||
			   tablero[2][0]=='x'&tablero[2][1]=='x'&tablero[2][2]=='x'||
			   tablero[0][0]=='x'&tablero[1][1]=='x'&tablero[2][2]=='x'||
			   tablero[0][2]=='x'&tablero[1][1]=='x'&tablero[2][0]=='x'||
			   tablero[0][0]=='x'&tablero[1][0]=='x'&tablero[2][0]=='x'||
			   tablero[0][1]=='x'&tablero[1][1]=='x'&tablero[2][1]=='x'||
			   tablero[0][2]=='x'&tablero[1][2]=='x'&tablero[2][2]=='x') 
			{System.out.println("gana jugador 2");
			end=true;
			victoriasdos++;}
			if(tablero[0][0]=='o'&tablero[0][1]=='o'&tablero[0][2]=='o'||
					   tablero[1][0]=='o'&tablero[1][1]=='o'&tablero[1][2]=='o'||
					   tablero[2][0]=='o'&tablero[2][1]=='o'&tablero[2][2]=='o'||
					   tablero[0][0]=='o'&tablero[1][1]=='o'&tablero[2][2]=='o'||
					   tablero[0][2]=='o'&tablero[1][1]=='o'&tablero[2][0]=='o'||
					   tablero[0][0]=='o'&tablero[1][1]=='o'&tablero[2][2]=='o'||
					   tablero[0][0]=='o'&tablero[1][0]=='o'&tablero[2][0]=='o'||
					   tablero[0][1]=='o'&tablero[1][1]=='o'&tablero[2][1]=='o'||
					   tablero[0][2]=='o'&tablero[1][2]=='o'&tablero[2][2]=='o') 
					{System.out.println("gana jugador 2");
					end=true;
					victoriasdos++;}
			/**
			 * Con el siguiente if comprobamos los turnos y si han llegado a 9
			 * (El tablero estara lleno de fichas) se termina el bucle del juego
			 * y se suma uno a empates
			 */
			if (turno>=9) {
					end=true;
					empatecontador++;}
			
			turno++;
			imprimirTablero();
			
		}System.out.println("acabao");

	}
	/**
	 * En el siguiente metodo se imprime el vector el cual es el tablero,
	 * con esto se consigue una representacion grafica del juego cada vez que se llama 
	 * al metodo imprimirTablero.
	 */
	public void imprimirTablero() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(this.tablero[i][j]);
			}
			System.out.println();
			;
		}
	}
	/**
	 * Con limpiarTablero se restablecen todos los valores del tablero a un hueco en blanco
	 * para que se pueda jugar otra partida en caso de asi quererlo
	 */
	public void limpiarTablero() {

		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				tablero[i][j]=' ';
			}
		}
	}
	
	/**
	 * Este metodo simplemente imprime las estadisticas finales en funcion
	 * de las victorias o empates de ambos jugadores.
	 */
	public void imprimirEstadisticas() {
		
		System.out.println("jugador 1 ha ganado: " + victoriasuno + " veces");
		System.out.println("jugador 2 ha ganado: " + victoriasdos + " veces");
		System.out.println("se ha empatado: " + empatecontador + " veces");

	}
	/**
	 * En el main simplemente se crea un bucle y se ejecutan los metodos
	 * anteriores, y existe un bucle en caso de querer seguir jugando 
	 * otra partida despues de finalizar la anterior
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continuar = true;
		Tresenlinea prueba = new Tresenlinea();
		while (continuar) {
			
			prueba.limpiarTablero();
			prueba.empezarPartida();
			System.out.println("¿Quiere seguir jugando? Y/N");
			String continuacion = teclado.nextLine();
			if (continuacion.charAt(0) == 'Y') {prueba.limpiarTablero();
			}
			if (continuacion.charAt(0) == 'N') {
				continuar = false;
			}
			;
		}
		prueba.imprimirEstadisticas();
	}

}
