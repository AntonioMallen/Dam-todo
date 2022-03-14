/*Desarrollar un programa en Java que utilice una clase que se llame Indicador que
sea la representación de un indicador de la vida real (indicadores de nivel, de
velocidad, tacómetros, etc.). Deberá tener los mínimos elementos para representar
valores, ajustarlos con un valor de inicio, imprimir el valor, modificarlos a un valor
determinado e incrementar y disminuir el valor con el que cuentan.*/
public class Indicador {
private float valor;
Indicador(){
	valor=0;

}
	
	public float getValor() {
	return valor;
}

public void setValor(float valor) {
	this.valor = valor;
}
public void setIncremento(float incremento) {
	this.valor=incremento+this.valor;
}
public void setModificar(float modificar) {
	valor=modificar;
}
public void getImprimir() {
	System.out.println(valor);
}


}
