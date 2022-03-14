package pruebaed;

	public class prueba1 {
		private char cadena[];
		private char letra;
		prueba1(char cadena[],char letra){
			this.cadena=cadena;
			this.letra=letra;
		}
		public int contador_letra(char cadena[], char letra) {
		int contador, n, longitud;
		n=0; 
		contador = 0;
		longitud = cadena.length;
		if(longitud >0) {
			do {
				if(cadena[contador]==letra) {
					n++;
				}
				contador++;
				longitud--;
			}while(longitud>0);
		}
		System.out.println(n);
		return n;
		
		}

	public static void main(String[] args) {
		prueba1 patata = new prueba1({'b','c','a'},'a');
		char cadena[]= {'a','b','c'};
				
		patata.contador_letra(cadena,'a');
	}

}
