package ar.edu.unlam.pb2;

public class Calculadora {

	public int sumar(int operador1, int operador2) {

		return operador1 + operador2;
	}

	public double sumar(double operador1, double operador2) {

		return operador1 + operador2;
	}

	public boolean esNegativo(int operador1) {
		if (operador1 < 0) {
			return true;
		} else {
			return false;
		}
	}

	public double multiplicar(double operador1, double operador2) {
		
		return (operador1 * operador2);
	}

	public double dividir(double valueA, double valueB) {
		
		return (valueA / valueB);
	}



}
