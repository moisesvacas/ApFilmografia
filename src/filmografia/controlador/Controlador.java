/**
 * 
 */
package filmografia.controlador;

import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;

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
	
	private DataSource datasource;
	
	private ServletContext sc;
	
	
	public void init(ServletConfig config) throws ServletException{
		
		super.init(config);
		
		try{
			
		}
		catch(NamingException ne){
			
		}
		
	}

}
