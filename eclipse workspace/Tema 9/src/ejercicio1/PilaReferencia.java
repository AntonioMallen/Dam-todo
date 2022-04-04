package ejercicio1;

public class PilaReferencia extends PilaEnteros{

		

		class ElementoPila{
		//elemento de la pila
			int elto;
		// elemento siguiente
			ElementoPila sig;
			
			ElementoPila(int x){
				elto=x;
				sig=null;
			}
		}
		
		ElementoPila cima = null;
		// elementos almacenados en la pila
		int tam=0;
		
		
		
		public final int MAXSIZE = 100;
		
		/**
		 * Inserta un numero entero en la pila
		 *
		 */
		public  void push( int x ) {
			if( tam == MAXSIZE)
				throw new IndexOutOfBoundsException("La pila esta llena");
			ElementoPila aux = new ElementoPila(x);
			aux.sig=cima;
			cima=aux;
			tam++;
		}
		/**
		 * Dice el elemento actual del vector
		 * @return numero entero en la posicion actual
		 */
		public  int pop() {
			if(cima!=null) {
				ElementoPila aux = cima;
				cima=cima.sig;
				tam--;
				return aux.elto;
			}
			throw new IndexOutOfBoundsException("Pila vacia");
			
		}
		/**
		 * Tiene el tamaño de elementos dentro de la pila
		 * @return la posicion del ultimo elemento
		 */
		public int getIndice() {
			/*
			ElementoPila aux =cima;
			int Indice=0;
			while(cima)
				*/
			return tam;
		}
	}
