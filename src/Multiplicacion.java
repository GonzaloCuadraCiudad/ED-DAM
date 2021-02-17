
/**
 * 
 * @author Gonzalo Cuadra Ciudad
 * @version 1.0
 * 
 *  Clase que realiza operaciones relaccionadas con la multiplicaci�n 
 * 
 */

public class Multiplicacion {

	
	
	//
	// Atributo propiedad para las clases suma,resta y producto con un
	// contructor para poder inicializarlo
	//
	
private double acumulador;
	
	public Multiplicacion(double acumulador) {
		super();
		this.acumulador = acumulador;
	}

	/**
	 * Contructor sin parametros de la clase
	 */
	
	public Multiplicacion() {
		super();
	}

	/**
	 * M�todo que realiza la multiplicaci�n de dos n�meros reales y que devuelve otro n�mero real.
	 *<br>
	 * Acepta n�meros negativos en ambos reales devolviendo negativo si solo
	 * uno de los parametros es negativo y el otro positivo, o si ambos son negativos devuelve positivo.
	 *<br>
	 * Si uno de los n�meros es 0, devolver� siempre un 0.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * 
	 * @param parametro1 -> parametro que ser� multiplicado por el otro parametro2.
	 * @param parametro2 -> parametro que ser� multiplicado por el otro parametro1.
	 * @return devuelve la multiplicaci�n de ambos parametros.
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double multiplicarReal(double parametro1, double parametro2) {
		double resultado = 0;
		
		return resultado;
	}
	
	
	/**
	 * M�todo que realiza la multiplicaci�n de dos numeros entero y que devuelve otro n�mero entero.
	 *<br>
	 *Acepta n�meros negativos en ambos enteros devolviendo negativo si solo
	 * uno de los parametros es negativo y el otro positivo, o si ambos son negativos devuelve positivo.
	 *<br>
	 * Si uno de los n�meros es 0, devolvera siempre un 0.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * 
	 * @param parametro1 -> parametro que ser� multiplicado por el otro parametro2.
	 * @param parametro2 -> parametro que ser� multiplicado por el otro parametro1.
	 * @return devuelve la multiplicaci�n de ambos parametros.
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado.
	 * 
	 */
	
	public long multiplicarEntero(int parametro1, int parametro2) {
		long resultado = 0;
		
		return resultado;
	}

	/**
	 * M�todo que realiza la multiplicaci�n de tres n�meros reales y que devuelve otro n�mero real.
	 *<br>
	 *Acepta n�meros negativos en los n�meros devolviendo negativo si solo
	 * uno de los parametros es negativo o si los tres n�meros son negativos, o si ambos son negativos devuelve positivo.
	 *<br>
	 * Si uno de los n�meros es 0, devolvera siempre un 0.
	 *<br>
	 * Si alguno de los parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * 
	 * @param parametro1 -> parametro que ser� multiplicado por los otros dos numeros.
	 * @param parametro2 -> parametro que ser� multiplicado por los otros dos numeros.
	 * @param parametro3 -> parametro que ser� multiplicado por los otros dos numeros.
	 * @return devuelve la multiplicaci�n de todos los n�meros.
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public double multiplicacionLarga(double parametro1, double parametro2, double parametro3) {
		double resultado = 0;
		
		return resultado;
	}
	
	/**
	 * M�todo que calcula la potencia de la base elevado a un exponente, y que dar� como resultado un n�mero entero.
	 *<br>
	 * Si la base es positiva, el resultado es positivo si el exponente es par y negativo si es impar.
	 *<br>
	 * Si el exponente es negativo provocar� una excepci�n.
	 *<br>
	 * Si el parametros de entrada es null o no est� inicializado
	 * se generar� una excepcion IllegalArgumentException.
	 * *<br>
	 * Para ello utilizaremos la funci�n Math.Pow()
	 * 
	 * @param base -> parametro el cual vamos a multiplicar tantas veces nos indique el exponente.
	 * @param exponente -> parametro que nos indica las veces que tenemos que multiplicar la base.
	 * @return devuelve la potencia de la base elevado al exponente de los parametros introducidos.
	 * @throws IllegalArgumentException se generar� est� excepci�n cuando se introduzca
	 * un parametro no deseado
	 * 
	 */
	public long potencia(int base, int exponente) {
		long resultado = 0;
		
		return resultado;
	}
	}