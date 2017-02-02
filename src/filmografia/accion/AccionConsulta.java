package filmografia.accion;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import filmografia.beans.BeanError;
import filmografia.controlador.Accion;

public class AccionConsulta implements Accion {
	
	private final String vistaEncontrado = "WEB-INF/mostrar.jsp";
	private final String vistaError = "WEB-INF/gesError.jsp";
	private final String vistaNoEncontrado = "WEB-INF/mensaje.jsp";
	
	private String vista;
	private ServletContext sc;
	private DataSource ds;
	private HttpSession sesion;
	private BeanError error;
	
	
	public AccionConsulta(){
				
	}

	@Override
	public boolean ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		boolean respuesta = false;
		
		return respuesta;
	}

	@Override
	public String getVista() {
		
		return null;
	}
	
	public void setVista(String vista){
		this.vista = vista;
	}

	@Override
	public Object getModelo() {
		
		return null;
	}

	@Override
	public void setSc(ServletContext sc) {
		this.sc = sc;
		
	}

	@Override
	public BeanError getError() {
	
		return error;
	}

	@Override
	public void setDs(DataSource ds) {
		
		this.ds = ds;
	}

	@Override
	public void setSesion(HttpSession sesion) {
		
		this.sesion = sesion;
		
	}

}
