package temafinej2;

import java.util.ArrayList;

public class Empresa {
ArrayList<Viajante> vector= new ArrayList<Viajante>();
public void annadirViajante(Viajante a) {
	vector.add(a);
}
public void eliminarViajante(int a) {
	vector.remove(a);
}
}

