package urjc.ist.streaming;

import java.util.List;

public class ColeccionPeliculas {
private String nombre;
private List <Peliculas> pelicula;
public ColeccionPeliculas(String nombre, List<Peliculas> pelicula) {
	
	this.nombre = nombre;
	this.pelicula = pelicula;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public List<Peliculas> getPelicula() {
	return pelicula;
}
public void setPelicula(List<Peliculas> pelicula) {
	this.pelicula = pelicula;
}

}
