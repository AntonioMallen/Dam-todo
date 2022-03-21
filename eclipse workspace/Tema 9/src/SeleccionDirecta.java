
public class SeleccionDirecta {
	int [] vector= { 6, 17, 4, 7,99,13,22,66} ;
	int cantidad= vector.length-1;
	int aux=0;
	
	void seleccionDirecta() {
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
	void seleccionDirecta_bien() {
		for(int i=0;i<cantidad;i++) {
			int menor=i;
			
			for(int j=i+1;j<cantidad;j++) {
				if(vector[menor]>vector[j]) {
					menor=j;
				}
			}
			
			aux=vector[i];
			vector[menor]=vector[i];
			vector[menor]=aux;
		}
	}
	
	public static void main(String[] args) {
		
	}

}
