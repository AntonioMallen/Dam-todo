
public abstract class Vehiculos implements Revision {
	int dias=1;
	int km=0;
	int color=0xFFFFFF;
	public void pintar (int pintura) {
		this.color=pintura;
	}
	public int getColor() {
		return this.color;
	}
	abstract int getEjes();
	abstract int precioPintura();
	void distanciaRecorrida(int dias, int km) {
		this.dias=dias;
		this.km=km;
	}
	void distanciaRecorrida(int km) {
		distanciaRecorrida(1,km);
	}
	public void pasarRevision() {
		this.dias=1;
		this.km=0;	
	}
	
}
