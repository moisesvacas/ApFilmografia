package filmografia.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Director {
	private String nombre;
	private String titulo;
	private Date fecha;
	
	public Director(){
		
	}
	
	public Director(String nombre, String titulo, Date fecha){
		this.nombre = nombre;
		this.titulo = titulo;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecha() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
	    return dateFormat.format(fecha);
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
