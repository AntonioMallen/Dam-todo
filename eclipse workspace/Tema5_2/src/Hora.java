/*Desarrollar un programa en Java que utilice una clase que se llame Hora con
miembros de tipo int para hora, minutos y segundos. Deberá tener un constructor
para inicializar la hora a 0 o a una hora determinada (hora, minutos, segundos).Se
deberá poder sumar y restar horas, así como imprimir y leer una hora. El formato de
impresión y lectura será hh:mm:ss, todo en modo 24 horas.*/
public class Hora {
private int hora;
private int minutos;
private int segundos;
Hora(){
hora=0;
minutos=0;
segundos=0;
}

public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMinutos() {
	return minutos;
}
public void setMinutos(int minutos) {
	this.minutos = minutos;
}
public int getSegundos() {
	return segundos;
}
public void setSegundos(int segundos) {
	this.segundos = segundos;
}
public void Leer(int hora, int minutos, int segundos) {
	this.hora=hora;
	this.minutos=minutos;
	this.segundos=segundos;
}
public void Operacion(int hora, int minutos, int segundos) {
	this.segundos+=segundos;
	if(segundos<0) {
	this.minutos-=1;
	this.segundos+=60;
	}
	this.minutos+=minutos;
	if(this.minutos<0) {
	this.hora-=1;
	this.minutos+=60;
	}
	this.hora+=hora;
	if(this.hora<0) {
		this.hora+=24;
		}
}
public void opHoras() {
	if(segundos>=60) {
		for(int i=0;i!=(segundos/60);i++) 
		{this.minutos+=1;}
		segundos=segundos%60;
	}
	if(minutos>=60) {
		for(int i=0;i!=(minutos/60);i++) 
		{this.hora+=1;}
		minutos=minutos%60;
	}
	if(this.hora>=24) {
		hora=hora%24;
	}

	
}
public void Imprimir() {
	System.out.print(hora +":"+ minutos+":"+segundos);
}



}
