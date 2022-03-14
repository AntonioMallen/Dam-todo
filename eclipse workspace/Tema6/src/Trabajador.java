/*3) Cada trabajador tiene un numero identificativo que va de 1 a 100, además se
controla su nombre, estado civil (S/C), turno (D/N), titulación (0 a 4) y años en la
empresa.
Escribir el código para definir la clase Trabajador y desarrollar los métodos para:
 Constructor con parámetros fijos para un trabajador nuevo
 Modificar cualquier dato menos el identificador
 Visualizar los datos de un trabajador dado
 Calcular la nómina de un trabajador teniendo en cuenta que:
 El salario base es de 425 euros para todos
 Se paga 100 euros extra en turno N
 Se paga 75 euros por año de antigüedad
 La titulación se paga 250,500,1000,1250,1500 según sea de 0 a 4
 Se efectúa una retención de impuestos de la nómina del 12% a todos salvo a
los casados que se les retiene el 10%
Declarar los atributos y métodos correspondientes, desarrollarlos y probarlos en un
programa*/
import java.math.*;
import java.util.*;
public class Trabajador {
	Scanner teclado= new Scanner(System.in);
	private int num_identificativo=1;
	private String nombre;
	private String estadocivil;
	private String turno;
	private int titulacion;
	private int aniosempresa;
	private String[] nombresAleatorios= {"anacleto", "Truman", "Al Pacino", "Mike", "Adam", "Sully","Silvia","Maria","Juana","Alex"};
	private String[] apellidosAleatorios= {"El Capo","Labiossellados","Trujillo","Toma","Berlusconni","Girocompleto","De Arco","Half life 3"};
Trabajador(){
	
	nombre= nombresAleatorios[(int)(Math.random()*10)]+" "+apellidosAleatorios[(int)(Math.random()*8)];
	System.out.println("introduzca estado civil S/N");
	estadocivil=teclado.nextLine();
	System.out.println("introduzca turno D/N");
	
	turno=teclado.nextLine();
	System.out.println("introduzca titulacion del 1 al 4");
	titulacion=teclado.nextInt();
	System.out.println("introduzca años en la empresa");
	aniosempresa= teclado.nextInt();
	
}
	
public int getNum_identificativo() {
	return num_identificativo;
}
public void setNum_identificativo(int num_identificativo) {
	this.num_identificativo = num_identificativo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getTitulacion() {
	return titulacion;
}
public void setTitulacion(int titulacion) {
	this.titulacion = titulacion;
}
public int getaniosempresa() {
	return aniosempresa;
}
public void setaniosempresa(int aniosempresa) {
	this.aniosempresa = aniosempresa;
}
void verDatos() {
	System.out.println("Identificativo: "+this.num_identificativo);
	System.out.println("Añoempresa: "+this.aniosempresa);
	System.out.println("EstadoCivil: "+this.estadocivil);
	System.out.println("Nombre: "+this.nombre);
	System.out.println("Titulacion: "+this.titulacion);
	System.out.println("Turno: "+this.turno);
}
void calcularSalario() {
	float salario=425;
	if (this.turno=="N") {salario+=100;}
	salario+=this.aniosempresa*75;
	switch (this.titulacion) {
	case 0: {
		salario+=250;
		break;}
	case 1: {
		salario+=500;
		break;}
	case 2: {
		salario+=1000;
		break;}
	case 3: {
		salario+=1250;
		break;}
	case 4: {
		salario+=1500;
		break;}
	
	default:
	System.out.println("Bobo o que");}
System.out.println("El salario es "+salario);
}
 float hacienda(float salario) {
	if(this.estadocivil=="C") {salario=(float) (salario-salario*0.1);
	}else {salario=(float) (salario-salario*0.12);}
	return salario;
}
public static void main(String[] args) {
Trabajador Juan = new Trabajador();

Juan.verDatos();
Juan.calcularSalario();
}
}