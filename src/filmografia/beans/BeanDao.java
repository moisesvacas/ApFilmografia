package filmografia.beans;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class BeanDao {
	/**
	 * Atributo que nos facilita los datos del datasource que vamos a utilizar
	 */
	private DataSource dataSource;

	/**
	 * Atributo que nos permite la conexion a la base de datos
	 */
	private Connection conexion = null;

	/**
	 * Constructor que recibe el DataSource
	 * @param dscine
	 */
	public BeanDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	/**
	 * Metodo que crea la conexión con la base de datos.
	 * @return la conexión
	 * @throws SQLException
	 */
	public Connection getConexion() throws SQLException {
		if (conexion == null){
		this.conexion = dataSource.getConnection();
		}
		return conexion;
	}
	
	/**
     * Metodo que cierra la conexión con la base de datos.
     * @throws SQLException
     */
	public void close() throws SQLException {
		if (conexion != null) {
			conexion.close();
		}
		conexion = null;
	}

}
