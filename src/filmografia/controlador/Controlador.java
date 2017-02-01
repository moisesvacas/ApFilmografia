/**
 * 
 */
package filmografia.controlador;

import java.io.IOException;

import javax.jws.soap.InitParam;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import filmografia.beans.BeanError;

/**
 * @author Moises Vacas
 *
 */
@WebServlet(value = "/controlador",
		initParams = @WebInitParam (name="UrlDataSource",value="java:jboss/datasources/dscine"))
public class Controlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1928211419040476316L;
	
	private DataSource dataSource;
	
	private ServletContext sc;
	
	
	public void init(ServletConfig config) throws ServletException{
		
		super.init(config);
		
		try{
			InitialContext initCtx = new InitialContext();
			
			this.setDataSource((DataSource)initCtx.lookup(this.getInitParameter("UrlDataSource")));
			
			
			if(this.getDataSource()==null){
				sc = config.getServletContext();
				sc.setAttribute("dataSource", this.getDataSource());
			}
		}
		catch(NamingException ne){
			System.out.println("Error:Método init(). tipo NamingException.");
		}
		
	}
	
	public void destroy(){
		
		sc.removeAttribute("dataSource");
		sc = null;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		this.doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		HttpSession sesion = request.getSession();
		
		AyudaSolicitud ayudaSol = new AyudaSolicitud(request);
		
		Accion accion = ayudaSol.getAccion();
		
		accion.setDs(dataSource);
		
		accion.setSesion(sesion);
		
		if(accion.ejecutar(request, response)){
			
			String vista = accion.getVista();
			
			request.setAttribute("modelo", accion.getModelo());
			
			RequestDispatcher rd = request.getRequestDispatcher(vista);
			rd.forward(request, response);
			
		} else {
			gesError(accion.getVista(),accion.getError(),request,response);
		}
	}


	private void gesError(String vistaError, BeanError excepcion, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher(vistaError);
		rd.forward(request, response);
	}

	/**
	 * @return the datasource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}


	/**
	 * @param datasource the datasource to set
	 */
	public void setDataSource(DataSource datasource) {
		this.dataSource = datasource;
	}

}
