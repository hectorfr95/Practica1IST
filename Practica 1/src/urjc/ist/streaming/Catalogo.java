package urjc.ist.streaming;

import java.util.List;

public class Catalogo {
private List<Peliculas> peliculas;
private List<Serie> series;
public Catalogo(List<Peliculas> peliculas, List<Serie> series) {
	
	this.peliculas = peliculas;
	this.series = series;
}
public List<Peliculas> getPeliculas() {
	return peliculas;
}
public void setPeliculas(List<Peliculas> peliculas) {
	this.peliculas = peliculas;
}
public List<Serie> getSeries() {
	return series;
}
public void setSeries(List<Serie> series) {
	this.series = series;
}

}
