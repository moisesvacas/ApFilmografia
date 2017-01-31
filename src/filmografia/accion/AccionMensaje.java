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

public class AccionMensaje implements Accion {

	@Override
	public boolean ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getVista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getModelo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSc(ServletContext sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BeanError getError() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDs(DataSource ds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSesion(HttpSession sesion) {
		// TODO Auto-generated method stub
		
	}

}
