import java.util.*;
public class SeleccionDirecta {
	int [] vector= new int[100000] ;
	int cantidad= vector.length;
	int aux=0;
	SeleccionDirecta(){
		Random r= new Random(54364542);
		for (int i=0;i<100000;i++) {
			vector[i]=r.nextInt(10000000);
		}
	}
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
			for (int j = u-1; j>=p ;j--) {
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
		int contadorposicion=99351;
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
		if(contadorposicion!=1) {
		contadorposicion=(contadorposicion/2)+1;}
		if (contadorposicion==2) {contadorposicion=1;}
		ordenado=true;
		}
	}
	void qsort(int ini, int fin) {
		if(ini>=fin) {return;}
		while(ini<fin) {
			int pivote=vector[ini];
			int posicion=ini;
			for(int contador=ini;contador<fin;contador++) {
				if(pivote>vector[contador]) {
					aux=vector[contador];
					for(int i=contador;i>ini;i--) {
						vector[contador]=vector[contador-1];	
					}
					if(posicion!=0) {
						vector[posicion-1]=aux;
					}
					posicion=contador;
				}
			}
			qsort(ini,vector[posicion-1]);
			qsort(vector[posicion+1],fin);
		}
	}
	
	void qsort_mejor(int ini, int fin) {
		int i=ini;
		int j=fin;
		int pivote=vector[ini];
		if(ini>=fin) {return;}
		do {
			while(vector[i]<pivote) {i++;}
			while(vector[j]>pivote) {j--;}
			if(i<j) {
				aux=vector[i];
				vector[i]=vector[j];
				vector[j]=aux;
			}
		}while(j>=i);
		qsort_mejor(ini,i-1);
		qsort_mejor(j+1,fin);
	}
	
	public static void main(String[] args) {
		SeleccionDirecta a= new SeleccionDirecta();
		long t=System.currentTimeMillis();
		a.burbuja_baile();
		long y= System.currentTimeMillis();
		System.out.println("tiempo: "+(y-t));
		for(int i=a.vector.length-1;i>a.vector.length-101;i--) {
			System.out.println(a.vector[i]);
		}
		//seleccionDirecta_bien 10600-10775-10596
		//burbuja_mejorada 12247
		//burbuja normal 10972
		//burbuja baile 14422
	}		
}
