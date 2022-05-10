package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void queCuandoSumeCincoMasCincoMeDeDiez() {
		final int resultadoEsperado = 10, operador1 = 5, operador2 = 5;
		int resultadoObtenido = 0;

		Calculadora casio = new Calculadora();
		resultadoObtenido = casio.sumar(operador1, operador2);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void queCuandoSumeCincoPuntoCeroMasCincoPuntoCincoMeDeDiezPuntoCinco() {
		final double resultadoEsperado = 10.5, operador1 = 5.0, operador2 = 5.5;
		double resultadoObtenido = 0;

		Calculadora casio = new Calculadora();
		resultadoObtenido = casio.sumar(operador1, operador2);

		assertNotNull(casio);
		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}

	@Test
	public void queUnNumeroNegativoSeaConsideradoComoTal() {
		// Preparación
		final int operador1 = -5;
		boolean resultadoObtenido;
		// Ejecución
		Calculadora casio = new Calculadora();
		resultadoObtenido = casio.esNegativo(operador1);
		// Validación
		assertTrue(resultadoObtenido);
	}
	
	@Test
	public void queDosNumerosSePuedanMultiplicar() {
		final double resultadoEsperado = 25, operador1 = 5, operador2 = 5;
		double resultadoObtenido = 0;

		Calculadora casio = new Calculadora();
		resultadoObtenido = casio.multiplicar(operador1, operador2);

		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}
	
	@Test
	public void queDosNumerosSePuedanDividir() {
		double valueA = 10;
		double valueB = 5;
		
		Calculadora casio = new Calculadora();
		double div = casio.dividir(valueA, valueB);

		assertEquals(2, div, 0.01);
	}
	

}
