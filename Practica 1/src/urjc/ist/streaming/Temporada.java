package urjc.ist.streaming;

import java.util.Calendar;
import java.util.List;

public class Temporada{
	
	private String titulo;
	private String descripcion;
	private Calendar fecha_estreno;
	private String lenguaje;
	private int duracion; // expresado en minutos
	private List<Actor> reparto;  // List<Actor> reparto;
	private List <Capitulo> capitulos;
	public Temporada(String titulo, String descripcion, Calendar fecha_estreno, String lenguaje, int duracion, List<Capitulo> capitulos) {
		
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha_estreno = fecha_estreno;
		this.lenguaje = lenguaje;
		this.duracion = duracion;
		if(capitulos.isEmpty()!=true) {
			for(int i=0;i<capitulos.size();i++) {
				this.reparto.addAll(this.capitulos.get(i).getReparto());
			}
		}
		this.capitulos = capitulos;
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

	public List<Actor> getReparto() {
		return reparto;
	}
	public void setReparto(List<Actor> reparto) {
		this.reparto = reparto;
	}
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
	
}
