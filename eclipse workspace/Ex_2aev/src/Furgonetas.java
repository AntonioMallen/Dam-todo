import java.io.*;
public class Furgonetas extends Vehiculos{
	final int ejes;
	static int precioBasePintura=500;
	Furgonetas (int ejes){
		if (ejes==2||ejes==3) {
		this.ejes=ejes;}
		else throw new IllegalArgumentException("ejes no validos");
	}

	public boolean debeRevisarse() {

		return false;
	}
	int getEjes() {	
		return this.ejes;
	}

	
	int precioPintura() {
		return precioBasePintura+(getEjes()*100);
	}

}
