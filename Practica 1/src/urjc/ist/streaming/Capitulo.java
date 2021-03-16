package urjc.ist.streaming;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Capitulo {
private int id=0;
private String titulo;
private String descripcion;
private Calendar fecha_estreno;
private String lenguaje;
private int duracion; // expresado en minutos
private List<Director> directores;
private List<Actor> reparto;
	public Capitulo(String titulo, String descripcion, Calendar fecha_estreno, String lenguaje, int duracion,
			List<Director> directores, List<Actor> reparto) {
		this.id = id++;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha_estreno = fecha_estreno;
		this.lenguaje = lenguaje;
		this.duracion = duracion;
		 
		 if(directores.size()>3) {
			 this.directores=Arrays.asList(directores.get(0),directores.get(1),directores.get(2));
			}else {
				this.directores=directores;
		 }
		 if(reparto.size()>5) {
			 this.reparto=Arrays.asList(reparto.get(0),reparto.get(1),reparto.get(2),reparto.get(3),reparto.get(4));
			}else {
				this.reparto=reparto;
		 }
}
	public int getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Calendar getFecha_estreno() {
		return fecha_estreno;
	}
	public void setFecha_estreno(Calendar fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public List<Director> getDirectores() {
		return directores;
	}
	public void setDirectores(List<Director> directores) {
		 if(directores.size()>3) {
			 this.directores=Arrays.asList(directores.get(0),directores.get(1),directores.get(2));
			}else {
				this.directores=directores;
		 }
	}
	public List<Actor> getReparto() {
		return reparto;
	}
	public void setReparto(List<Actor> reparto) {
		if(directores.size()>3) {
			 this.reparto=Arrays.asList(reparto.get(0),reparto.get(1),reparto.get(2));
			}else {
				this.reparto=reparto;
		 }
	}
}
