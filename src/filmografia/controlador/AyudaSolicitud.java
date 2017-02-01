/**
 * 
 */
package filmografia.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Moises Vacas.
 *
 */
public class AyudaSolicitud {
	
	HttpServletRequest request;

	public AyudaSolicitud(HttpServletRequest request) throws ServletException, IOException {
		
		this.request = request;
	}

	public Accion getAccion() {
		
		String accion = (String)request.getParameter("accion");
		
		return FactoriaAcciones.creaAccion(accion);
	}

}
