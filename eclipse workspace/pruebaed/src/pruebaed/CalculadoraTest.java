package pruebaed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calcu= new Calculadora(10,20);
		int resultado= calcu.suma();
		assertEquals(30,resultado);
	}

	@Test
	void testResta() {
		Calculadora calcu= new Calculadora(10,20);
		int resultado= calcu.resta();
		assertEquals(10,resultado);
	}
	
	@Test
	void testMultiplica() {
		Calculadora calcu= new Calculadora(10,20);
		int resultado= calcu.multiplica();
		assertEquals(200,resultado);
	} 
	@Test
	void testDivide() {
		Calculadora calcu= new Calculadora(10,20);
		int resultado= calcu.divide();
		assertEquals(0,resultado);
	}
	@Test
	void testDivide2() {
		Calculadora calcu= new Calculadora(10,0);
		Integer resul= calcu.divide2();
		assertNull(resul);
	}
	@Test
	void testResta2() {
		Calculadora calcu= new Calculadora(10,0);
		boolean resul=calcu.resta2();
		assertFalse(resul);
	}
	
}
