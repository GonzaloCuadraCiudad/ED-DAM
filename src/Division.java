

/**
 * 
 * @author Alfredo de los Rios Carrizo
 * @version 1.0
 * 
 *  Clase que realiza operaciones relaccionadas con la división 
 * 
 */

public class Division {

	/**
	 * Contructor sin parametros de la clase
	 */
	public Division() {
		super();
	}

	/**
	 * Método que realiza la división entre dos números enteros que devuelve
	 * otro número entero obviando la parte fraccionaria.
	 *<br>
	 * Acepta números negativos en ambos operandos devolviendo negativo si solo
	 * uno de los parametros es negativo y positivo si ambos son negativos.
	 *<br>
	 * Si el denominador es cero la función devolverá cero.
	 *<br> 
	 * Si el divisor es cero devolverá se generará una excepcion
	 * IllegalArgumentException.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * 
	 * @param denominador -> parametro que será dividido por el segundo parametro.
	 * @param divisor -> parametro que divide al primer parametro.
	 * @return devuelve la parte entera de la división de los dos parametros.
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public long dividir(int denominador, int divisor) {
		long resultado = 0;
		
		return resultado;
	}
	
	/**
	 * Método que realiza la división entre dos números reales que devuelve
	 *  otro número real incorporando la parte fraccionaria.
	 *<br>
	 * Acepta números negativos en ambos operandos devolviendo negativo si solo
	 * uno de los parametros es negativo y positivo si ambos son negativos.
	 *<br>
	 * Si el denominador es cero la función devolverá cero.
	 *<br>
	 * Si el divisor es cero devolverá se generará una excepcion
	 * IllegalArgumentException.
	 *<br> 
	 * Si alguno de los parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * 
	 *  
	 * @param denominador -> parametro que será dividido por el segundo parametro. 
	 * @param divisor -> parametro que divide al primer parametro.
	 * @return resultado de la división de los 2 parametros de entrada.
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double dividir(double denominador, double divisor) {
		double resultado = 0;
		
		return resultado;
	}

	/**
	 * Método que calcula el número inverso (1/n) del número dado como parametro.
	 * Devuelve un número real.
	 *<br>
	 * Si el parametro de entrada es negativo devolverá un número negativo.
	 *<br>
	 * Si el parametro es cero la función devolverá cero.
	 *<br>
	 * Si el parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * 
	 * @param numero -> parametro del cual calcularemos el inverso.
	 * @return devuelve el inverso del parametro de entrada (1 / numero).
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double inverso(double numero) {
		double resultado = 0;
		
		return resultado;
	}
	
	/**
	 * Método que calcula la raiz cuadrada del número dado como parametro.
	 * Devuelve un número real.
	 *<br>
	 * Si el parametro de entrada es negativo provocará una excepción.
	 *<br>
	 * Si el parametros de entrada es null o no está inicializado
	 * se generará una excepcion IllegalArgumentException.
	 * 
	 * @param numero -> parametro al cual aplicar la raiz cuadrada.
	 * @return devuelve la raiz cuadrada del parametro introducido.
	 * @throws IllegalArgumentException se generará está excepción cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double raiz(double numero) {
		double resultado = 0;
		
		return resultado;
	}
	
	
	
}
