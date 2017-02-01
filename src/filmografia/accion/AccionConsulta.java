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
		
		return false;
	}

	@Override
	public String getVista() {
		
		return null;
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
