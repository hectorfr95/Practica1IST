package urjc.ist.streaming;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Serie {
private String titulo;
private String descripcion;
private boolean cont_infantil;
private Calendar fecha_estreno;
private Calendar fecha_estreno_ultimocap;
private String lenguaje;
private List<Actor> reparto;  // List<Actor> reparto;
private List <Temporada> temporada;

public Serie(String titulo, String descripcion, boolean cont_infantil, Calendar fecha_estreno,
		Calendar fecha_estreno_ultimocap, String lenguaje, List<Temporada> temporada) {

	this.titulo = titulo;
	this.descripcion = descripcion;
	this.cont_infantil = cont_infantil;
	this.fecha_estreno = fecha_estreno;
	this.fecha_estreno_ultimocap = fecha_estreno_ultimocap;
	this.lenguaje = lenguaje;
	if(temporada.isEmpty()!=true) {
		for(int i=0;i<temporada.size();i++) {
			if(temporada.get(i).getCapitulos().isEmpty()!=true) {
				for(int j=0;j<temporada.get(i).getCapitulos().size();j++) {
					this.reparto.addAll(temporada.get(i).getCapitulos().get(j).getReparto());
				}
			}
		
		}
	}
	this.temporada = temporada;
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

public Calendar getFecha_estreno_ultimocap() {
	return fecha_estreno_ultimocap;
}

public void setFecha_estreno_ultimocap(Calendar fecha_estreno_ultimocap) {
	this.fecha_estreno_ultimocap = fecha_estreno_ultimocap;
}

public String getLenguaje() {
	return lenguaje;
}

public void setLenguaje(String lenguaje) {
	this.lenguaje = lenguaje;
}



public List<Actor> getReparto() {
	return reparto;
}

public void setReparto(List<Actor> reparto) {
	this.reparto = reparto;
}

public List<Temporada> getTemporada() {
	return temporada;
}

public void setTemporada(List<Temporada> temporada) {
	this.temporada = temporada;
}


}
