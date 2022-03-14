
public class Automovil extends Vehiculos {
	static int ejes=2;
	static int precioBasePintura=600;
	
	int getEjes() {return 2;}
	public boolean debeRevisarse() {
		if(this.km>15000||this.dias>360) {return true;}
		else {return false;}
	}
		

	int precioPintura() {
		return precioBasePintura;
	}
}
