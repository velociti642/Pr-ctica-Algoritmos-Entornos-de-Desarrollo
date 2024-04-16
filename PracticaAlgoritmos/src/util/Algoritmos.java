package util;

public abstract class Algoritmos {

	/**
	 * Devuelve el factorial del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el factorial
	 * @return			el factorial del numero especificado
	 */

	public static int factorial(int numero) {
		int suma = 1;
		
		for(int i = 1; i <= numero; i++) {
			suma *= i;
		}
		return suma;
	}
}
