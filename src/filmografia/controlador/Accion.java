/**
 * 
 */
package filmografia.controlador;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import filmografia.beans.BeanError;

/**
 * @author Moises Vacas.
 *
 */
public interface Accion {
	public boolean ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	public String getVista();
	
	public Object getModelo();
	
	public void setSc(ServletContext sc);
	
	public BeanError getError();
	
	public void setDs(DataSource ds);
	
	public void setSesion(HttpSession sesion);
}
