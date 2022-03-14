
public class Camiones extends Vehiculos{
	final int ejes;
	static int precioBasePintura=300;
	Camiones(int ejes){
		if(ejes>3||ejes<6) {
			this.ejes=ejes;
		}
		else throw new IllegalArgumentException("ejes no validos");
	}
	public boolean debeRevisarse() {
		
		return false;
	}


	int getEjes() {
		
		return this.ejes;
	}

	int precioPintura() {		
		return precioBasePintura+(getEjes()*200);
	}

}
