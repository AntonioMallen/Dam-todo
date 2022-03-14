package tema4;

public class pruebaejs {
	public class AlgunaClase { 
		int variable; 
		final int CONSTANTE = 3; 
		public void algunMetodo(int parametro) { 
			int variable; 
			variable = parametro * CONSTANTE; 
			final int CONSTANTE = 10; 
			variable = 5; 
			System.out.println("" + this.variable);
		} 
		}

	public static void main(String[] args) {
		Jefe jefe= new Jefe();

	}

}
