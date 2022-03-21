
public class InsercionIDirecta {
	int [] vector= { 6, 17, 4, 7,99,13,22,66} ;
	int cantidad= vector.length;
	int guardar=0;
	
	void inserciondirecta() {
		for (int i=0; i<cantidad;i++) {
			int j=i;
			 while (j>=1 && vector[j]<vector[j-1] )
			 {
				guardar= vector[j];
				vector[j]=vector[j-1];
				vector[j-1]=guardar;
				j--;
			 }
				}
			}
	void inserciondirecta_bien() {
		for(int i=1;i<cantidad;i++) {
			int j=i-1;
			guardar=vector[i];
			while(vector[j]>vector[i]) {
				vector [j+1]=vector[j];
				j--;
			}
			vector[j]=guardar;
		}
		
	}
	void insercionBinaria() {
		int m =0;
		for(int i=1;i<cantidad;i++) {
		int p=0;
		int u=i-1;
		while(p<=u) {
			m=(p+u)/2;
			if( vector[i]<vector[m] )
				u=m-1;
			if( vector[i]>vector[m])
				p=m-1;
		}
			int j=u;
			guardar=vector[i];
			while(vector[j]>vector[m]) {
				vector [j+1]=vector[j];
				j--;
			}
			vector[m]=guardar;
		}
		}

	public static void main(String[] args) {
		InsercionIDirecta si = new InsercionIDirecta();
		si.insercionBinaria();
		for(int i=0;i<si.vector.length;i++) {
			System.out.println(si.vector[i]);
		}
	}

}
