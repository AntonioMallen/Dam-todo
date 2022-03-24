
public class SeleccionDirecta {
	int [] vector= { 6, 17, 4, 7,99,13,22,66,23,65,123,5623} ;
	int cantidad= vector.length;
	int aux=0;
	
	void seleccionDirecta_mal2() {
		for(int i=0;i<cantidad;i++) {
			int menor=i;
			
			for(int j=i+1;j<cantidad;j++) {
				if(vector[menor]>vector[j]) {
					menor=j;
				}
			}
			
			aux=vector[menor];
			for(int k=menor;k>i;k--) {
				vector[k]=vector[k-1];
			}
			vector[i]=aux;
		}
	}
	void seleccionDirecta_mal() {
		for(int i=0;i<cantidad;i++) {
			int menor=i;
			
			for(int j=i+1;j<cantidad;j++) {
				if(vector[menor]>vector[j]) {
					menor=j;
				}
			}
			if(i!=menor) {
				aux=vector[i];	
				for(int k=menor;k>i;k--)
					vector[k]=vector[k-1];
				vector[menor]=aux;
			}
			
		}
	}
	void seleccionDirecta_bien() {
		for(int i=0;i<cantidad;i++) {
			int menor=i;
			for(int j=i+1;j<cantidad;j++) {
				if(vector[menor]>vector[j]) {
					aux=vector[j];
					vector[j]=vector[menor];
					vector[menor]=aux;
				}
			}
			
		}
	}
	
	void burbuja() {

		for (int i = 0; i < cantidad-1; i++) {
			
			for(int j=0;j<cantidad-(i+1);j++) {
				if(vector[j]>vector[j+1]) {
					aux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;
				}
			} 
			
		}
	}
	/*
	 * No sabemos si es esto lo que nos pide pero Antonio Mallén dice que sí☺
	 */
	void burbuja_mejorada() {
		boolean ordenao=false;
		do {
			for (int i = 0; i < cantidad; i++) {
				for(int j=0;j<cantidad-(i+2);j++) {
					if(vector[j]>vector[j+1]) {
						aux=vector[j];
						vector[j]=vector[j+1];
						vector[j+1]=aux;
					}
					if(vector[j+1]>vector[j+2]) {
						aux=vector[j+1];
						vector[j+1]=vector[j+2];
						vector[j+2]=aux;
					}else {
						ordenao=true;
					}
				}
				
				
			}
		}while(!ordenao);
	}
	void burbuja_sacudida() {
		boolean ordenao=false;
		int u=cantidad-1;
		int p=0;
		do {
			for (int j = u; j>=p ;j--) {
				if(vector[j]>vector[j+1]) {
					if(vector[j]>vector[j+1]) {
						aux=vector[j];
						vector[j]=vector[j+1];
						vector[j+1]=aux;
					}
				}	
			}
			p++;
			for(int j=p;j<=u;j++) {
				if(vector[j]<vector[j+1]) {
					if(vector[j]>vector[j+1]) {
						aux=vector[j];
						vector[j]=vector[j+1];
						vector[j+1]=aux;
					}
				}
				u--;
			}
		}while(p<u  );
	}
	
	void burbuja_baile() {
		boolean ordenado=true;
		int contadorposicion=9;
		while (ordenado==true) {
		for(int i=0;i<cantidad-(contadorposicion);i++) {
				if(vector[i]>vector[i+contadorposicion]) {
					if(contadorposicion==1) { ordenado=false;}
					aux=vector[i];
					vector[i]=vector[i+contadorposicion];
					vector[i+contadorposicion]=aux;
				}
		}
		if (ordenado==true&&contadorposicion==1) { return;}
		contadorposicion=(contadorposicion/2)+1;
		if (contadorposicion==2) {contadorposicion=1;}
		ordenado=true;
		}
	}
	
	public static void main(String[] args) {
		SeleccionDirecta si = new SeleccionDirecta();
		si.burbuja_baile();
		
		for(int i=0;i<si.vector.length;i++) {
			System.out.println(si.vector[i]);
		}
	}

}
