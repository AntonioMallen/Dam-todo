
public class Hora_Prueba {

	public static void main(String[] args) {
		Hora reloj = new Hora();
		reloj.Leer(12,5,2);
		reloj.Imprimir();
		System.out.println();
		reloj.Operacion(12, 6, 3);
		reloj.Imprimir();
		System.out.println();
		
		reloj.opHoras();
		reloj.Imprimir();
	}

}
