package urjc.ist.streaming;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Peliculas {
	
private boolean emision; //solo se emite una vez las peliculas ya que son estrenos
private int id=0;
private String titulo;
private String descripcion;
private boolean cont_infantil;
private Calendar fecha_estreno;
private String lenguaje;
private int duracion; // expresado en minutos
private String [] productoras;
private List<Director> directores;
private List<Actor> reparto;
private int rating;
private String [] etiquetas;
	public Peliculas(boolean emision, String titulo, String descripcion, boolean cont_infantil, Calendar fecha_estreno,	String lenguaje,int duracion, String [] productoras, List<Director> directores, List<Actor> reparto, int rating, String [] etiquetas) {
		 this.emision = emision;
		 this.id = id++;
		 this.titulo = titulo;
		 this.descripcion=	descripcion;
		 this.cont_infantil= cont_infantil;
		 this.fecha_estreno= fecha_estreno;
		 this.lenguaje = lenguaje;
		 this.duracion = duracion; 
		 if(productoras.length<=2) {
				this.productoras=Arrays.copyOfRange(productoras, 0, productoras.length);
			}else {
				this.productoras=Arrays.copyOf(productoras, 3);
				System.out.println("Añadiendo solo las 3 primeras productoras");
			}
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
		 if(rating<0) {
				this.rating=0;
				System.out.println("Añadida una nota negativa, el software solo acepta valores entre 0 y 10. Se sustituira su rating por 0");
			}else if(rating>10) {
				this.rating=10;
				
				System.out.println("Añadida una nota mayor que 10, el software solo acepta valores entre 0 y 10. Se sustituira su rating por 10");
		 }else {
			 this.rating = rating;
		 }
		 if(etiquetas.length<=4) {
				this.etiquetas=Arrays.copyOfRange(etiquetas, 0, etiquetas.length);
			}else {
				this.etiquetas=Arrays.copyOf(etiquetas, 5);
				System.out.println("Añadiendo solo las 5 primeras etiquetas");
		 }
		 
		 
	}
	
	public String[] getProductoras() {
		return productoras;
	}

	public void setProductoras(String[] productoras) {
		 if(productoras.length<=2) {
				this.productoras=Arrays.copyOfRange(productoras, 0, productoras.length);
			}else {
				this.productoras=Arrays.copyOf(productoras, 3);
				System.out.println("Añadiendo solo las 3 primeras productoras");
			}
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
		if(reparto.size()>3) {
			this.reparto=Arrays.asList(reparto.get(0),reparto.get(1),reparto.get(2));
		}else {
			this.reparto=reparto;
		}
	}

	public void setId(int id) {
		this.id = id;
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

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		 if(rating<0) {
				this.rating=0;
				System.out.println("Añadida una nota negativa, el software solo acepta valores entre 0 y 10. Se sustituira su rating por 0");
			}else if(rating>10) {
				this.rating=10;
				
				System.out.println("Añadida una nota mayor que 10, el software solo acepta valores entre 0 y 10. Se sustituira su rating por 10");
		 }else {
			 this.rating = rating;
		 }
	}
	public String[] getEtiquetas() {
		return etiquetas;
	}
	public void setEtiquetas(String[] etiquetas) {
		this.etiquetas = etiquetas;
	}
	
	
}
