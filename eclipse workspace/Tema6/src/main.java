
public class main {

	
	public static void main(String[] args) {
	Ejercicio11 m=new Ejercicio11(3);

	
	for(int i=1;i<=9;i++) {
	// fila =(posicion -1) /3+1
	// columna =(posicion -1) %3+1
		m.setValor((i-1)/3+1,(i-1)%3+1,i);
	}
	for(int i =1; i<=3;i++) {
		for(int j=1;j<=3;j++) {
			System.out.print(m.getValor(i, j)+" ");
		}
	System.out.println();
	}
	
	
	
	}

}
