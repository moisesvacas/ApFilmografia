/**
 * 
 */
package filmografia.beans;

import java.io.Serializable;

/**
 * @author Moises Vacas.
 *
 */
public class BeanError extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 889504704847326741L;
	
	/**
	 * Información del código del error
	 */
	private int codigoError;
	
	/**
	 * Información del mensaje del error
	 */
	private String mensajeError;
	
	/**
	 * Constructor, recibe el código y el mensaje del error
	 * @param codigoError
	 * @param mensajeError
	 */
	public BeanError(int codigoError, String mensajeError) {
	    super();
	    this.codigoError=codigoError;
	    this.mensajeError=mensajeError;
	}
	
	/**
	 * Método que imprime la información del error
	 */
	public String toString(){
		return "Código error: "+this.codigoError+", "+this.mensajeError;
	}

}
