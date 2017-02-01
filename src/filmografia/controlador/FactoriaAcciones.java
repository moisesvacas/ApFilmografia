/**
 * 
 */
package filmografia.controlador;

import filmografia.accion.*;

/**
 * @author Moises Vacas.
 *
 */
public abstract class FactoriaAcciones {

	public static Accion creaAccion(String accion) {
		
		Accion accionFactoria;
		
		switch(accion) {
		   case "consulta" :
			   accionFactoria = new AccionConsulta();
		      break;
		   
		   case "mostrar" :
			   accionFactoria = new AccionMostrar();
		      break;
		   
		   case "listado" :
			   accionFactoria = new AccionListado();
		      break;
		      
		   case "mensaje" :
			   accionFactoria = new AccionMensaje();
		      break;   
		   
		   default :
			   accionFactoria = new AccionConsulta();
		}
		return accionFactoria;
	}

}
