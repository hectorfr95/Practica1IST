package urjc.ist.streaming;

import java.util.Calendar;

public class Peliculas {
	
private boolean emision;
private int id;
private String titulo;
private String descripcion;
private boolean cont_infantil;
private Calendar fecha_estreno;
private String lenguaje;
private int duracion; // expresado en minutos
private String [] productoras;
private String [] directores;
private String [] reparto;
private int rating;
private String [] etiquetas;
	public Peliculas(boolean emision, int id, String titulo, String descripcion, boolean cont_infantil, Calendar fecha_estreno,	String lenguaje,int duracion, String [] productoras, String [] directores, String [] reparto, int rating, String [] etiquetas) {
		 this.emision = emision;
		 this.id = id;
		 this.titulo = titulo;
		 this.descripcion=	descripcion;
		 this.cont_infantil= cont_infantil;
		 this.fecha_estreno= fecha_estreno;
		 this.lenguaje = lenguaje;
		 this.duracion = duracion; 
		 this.productoras = productoras;
		 this.directores = directores;
		 this.reparto = reparto;
		 this.rating = rating;
		 this.etiquetas = etiquetas;
	}
	public boolean isEmision() {
		return emision;
	}
	public void setEmision(boolean emision) {
		this.emision = emision;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isCont_infantil() {
		return cont_infantil;
	}
	public void setCont_infantil(boolean cont_infantil) {
		this.cont_infantil = cont_infantil;
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
	public String[] getProductoras() {
		return productoras;
	}
	public void setProductoras(String[] productoras) {
		this.productoras = productoras;
	}
	public String[] getDirectores() {
		return directores;
	}
	public void setDirectores(String[] directores) {
		this.directores = directores;
	}
	public String[] getReparto() {
		return reparto;
	}
	public void setReparto(String[] reparto) {
		this.reparto = reparto;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String[] getEtiquetas() {
		return etiquetas;
	}
	public void setEtiquetas(String[] etiquetas) {
		this.etiquetas = etiquetas;
	}
	
	
}
