package com.java.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
/**
 * 
 * @author estudiante
 *En el primer test he probado la longitud, el metodo size de la 
 *clase ArrayList.
 */
class TestJdk {
	@ValueSource (ints= {1,2,3,4})
	@ParameterizedTest
	void testSize(int a) {
		List<Integer> listaEjemplo = new ArrayList<>();
		listaEjemplo.add(a);
		assert(listaEjemplo.size()!=0);	
	}
	/**
	 * En este test, de manera unitaria, probamos de la clase ArrayList, el método size
	 * No le pasamos ningún parametro, y debe darnos que la longitud de dicha lista es 0, con eso nos cubrimos
	 * un caso en el que no debe fallar, puesto que en la creacion de una lista al no añadirle ningun valor
	 * la longitud debe ser 0.
	 * 
	 * 
	 */
	@Test
	void testNoSize() {
		List<Integer> listaEjemplo = new ArrayList<>();
		assert(listaEjemplo.size()==0);	
	}
	
	
	/**
	 * En el segundo test, he probado el metodo Empty de la clase ArrayList
	 * pasandole varios parametros , añadiendoselos a la lista y comprobando que no está vacia.
	 * @param a
	 */
	@ValueSource(ints= {1,5,8})
	@ParameterizedTest
	void testNoIsEmpty(int a) {
		List<Integer> listaEjemplo = new ArrayList<>();
		listaEjemplo.add(a);
		assertEquals(listaEjemplo.isEmpty(), false);
	}
	/**
	 *  A continuacion he probado un test unitario de la clase ArrayList, comcretamente
	 * del metodo Empty, creamos una lista y posteriormente le aplicamos el metodo Empty, 
	 * el resultado debe de ser true.
	 */
	@Test
	void testIsEmpty() {
		List<Integer> listaEjemplo = new ArrayList<>();
		assertEquals(listaEjemplo.isEmpty(), true);
	}
	/**
	 * A continuación, he probado un test parametrizado de varios valores, a la clase ArrayList,
	 * concretamente al metodo Clear, le hemos pasado varios valores y le hemos aplicado el metodo clear
	 * El assert espera recibir un true y le indicamos que la longitud de la lista después de aplicarle el clear es de 0.
	 * @param a
	 */
	@ValueSource(ints= {1,5,8})
	@ParameterizedTest
	void testClear(int a) {
		List<Integer> listaEjemplo = new ArrayList<>();
		listaEjemplo.add(a);
		listaEjemplo.clear();
		assert(listaEjemplo.size()==0);
		
	}
	/**
	 * A continuacion hemos probado otro caso de prueba para el método Clear, le hemos pasado 
	 * datos pero está vez no lo hemos llamado, entonces al no hacer uso de este método
	 * de la clase Arraylist, su longitud debe ser diferente a 0.
	 * @param a
	 */
	@ValueSource(ints= {1,5,8})
	@ParameterizedTest
	void testNoClear(int a) {
		List<Integer> listaEjemplo = new ArrayList<>();
		listaEjemplo.add(a);
		assert(listaEjemplo.size()!=0);	
	}

}
