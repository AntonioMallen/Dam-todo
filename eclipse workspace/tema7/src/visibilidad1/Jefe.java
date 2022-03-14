package visibilidad1;
import visibilidad2.EmpleadoEspecial;
public class Jefe extends Empleado{
public Jefe(){
	/* super. (te deja llamar a todas las variables del metodo empleado menos las
	* privates y las que no se expecifica el modificador (en blanco) 
	*/ 
	EmpleadoEspecial empleado = new EmpleadoEspecial();
	//empleado. te salen solo los modificadores public
	 
}
}