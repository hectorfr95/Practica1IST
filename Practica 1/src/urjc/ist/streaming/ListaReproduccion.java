package urjc.ist.streaming;

import java.util.Arrays;
import java.util.List;

public class ListaReproduccion {
private List<Peliculas> peliculas;
private List<Serie> series;
private int id_last_film;
private int last_film_min;
private int id_last_chapter;
private int last_chapter_min;
private String last_season;
private String last_series;

public ListaReproduccion(List<Peliculas> peliculas, List<Serie> series) {
	this.peliculas = peliculas;
	this.series = series;
}


public ListaReproduccion(List<Peliculas> peliculas, List<Serie> series, int id_last_film, int last_film_min,
		int id_last_chapter, int last_chapter_min, String last_season, String last_series) {
	
	this.peliculas = peliculas;
	this.series = series;
	this.id_last_film = id_last_film;
	this.last_film_min = last_film_min;
	this.id_last_chapter = id_last_chapter;
	this.last_chapter_min = last_chapter_min;
	this.last_season = last_season;
	this.last_series = last_series;
}

public ListaReproduccion(Catalogo catalogo) {
	
	inicializarListapeliculas(catalogo);
	inicializarListaSeries(catalogo);

	this.id_last_film = 0;
	this.last_film_min = 0;
	this.id_last_chapter = 0;
	this.last_chapter_min = 0;
	this.last_season = this.series.get(0).getTemporada().get(0).getTitulo();
	this.last_series = this.series.get(0).getTitulo();
}

public ListaReproduccion(List<Peliculas> peliculas , List<Serie> series, int asig ) {
	// Si escogemos 1 añadiremos tanto la lista de peliculas como la de series, si es 2 solo peliculas y si es 3 solo series, en otro caso se añadiran ambas listas
	
	if(asig==1) {
		this.peliculas = peliculas;
		this.series = series;
		}
	if(asig==2) {
		this.peliculas = peliculas;
		this.series = null;
		}
	if(asig==3) {
	this.peliculas = null;
	this.series = series;
	}else {
		this.peliculas = peliculas;
		this.series = series;
	}
}



public int getLast_film_min() {
	return last_film_min;
}

public void setLast_film_min(int last_film_min) {
	this.last_film_min = last_film_min;
}

public int getLast_chapter_min() {
	return last_chapter_min;
}

public void setLast_chapter_min(int last_chapter_min) {
	this.last_chapter_min = last_chapter_min;
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
public int getId_last_film() {
	return id_last_film;
}
public void setId_last_film(int id_last_film) {
	this.id_last_film = id_last_film;
}
public int getId_last_chapter() {
	return id_last_chapter;
}
public void setId_last_chapter(int id_last_chapter) {
	this.id_last_chapter = id_last_chapter;
}
public String getLast_season() {
	return last_season;
}
public void setLast_season(String last_season) {
	this.last_season = last_season;
}
public String getLast_series() {
	return last_series;
}
public void setLast_series(String last_series) {
	this.last_series = last_series;
}
public boolean hasListaPeliculas() {
	 if(this.peliculas == null){
       return false;
   }
   return true;
}
public boolean hasListaSeries() {
	 if(this.series == null){
      return false;
  }
  return true;
}

public void añadirPelicula(Peliculas pelicula, Usuario user1) {
	if(pelicula!=null) {
		if(pelicula.isCont_infantil()== true && user1.isCont_infantil()==false) {
			System.out.println("Usuario infantil, acceso denegado a peliculas con calificacion adulta, no se añadio su pelicula a la lista de reproduccion");
		}else if(this.peliculas.lastIndexOf(pelicula)==-1){
			this.peliculas.add(pelicula);
		}
	}
}
public void eliminarPelicula(Peliculas pelicula) {
	if (pelicula!=null&& this.peliculas.isEmpty()!=true)  {
		while(this.peliculas.lastIndexOf(pelicula)!=-1) {
			if(this.peliculas.lastIndexOf(pelicula)!=-1) { // Por si acaso el while se mete aqui e intenta borrar algo que ya no existe
			this.peliculas.remove(pelicula);
			}
		}
	}
}

public Peliculas getPelicula(Peliculas pelicula) {
	if (pelicula!=null&& this.peliculas.isEmpty()!=true)  {
		if(this.peliculas.lastIndexOf(pelicula)!=-1) {
		Peliculas pelicula_aux=this.peliculas.get(this.peliculas.lastIndexOf(pelicula));
		return pelicula_aux;
		}
	}
	
	return null;
}
public Peliculas getPelicula(String pelicula) {
	if (pelicula!=null&& this.peliculas.isEmpty()!=true)  {
		for(int i=0;i<this.peliculas.size();i++) {
			if(this.peliculas.get(i).getTitulo().equalsIgnoreCase(pelicula)==true) {
				Peliculas pelicula_aux=this.peliculas.get(i);
				return pelicula_aux;
			}
		}
		
	}
	
	return null;
}
public Peliculas getPelicula(int idPelicula) {
	if ( this.peliculas.isEmpty()!=true)  {
		for(int i=0;i<this.peliculas.size();i++) {
			if(this.peliculas.get(i).getId()==idPelicula) {
				Peliculas pelicula_aux=this.peliculas.get(i);
				return pelicula_aux;
			}
		}
		
	}
	
	return null;
}

public void inicializarListapeliculas(Catalogo cat){
	if(cat.getPeliculas().isEmpty()!=true && cat.getPeliculas().get(0)!=null && cat.getPeliculas().get(1)!=null && cat.getPeliculas().get(2)!=null ) {
		if(cat.getPeliculas().get(0).getId()!=cat.getPeliculas().get(1).getId() && cat.getPeliculas().get(0).getId()!=cat.getPeliculas().get(2).getId() && cat.getPeliculas().get(1).getId()!=cat.getPeliculas().get(2).getId()) {
			List<Peliculas> films = Arrays.asList(cat.getPeliculas().get(0),cat.getPeliculas().get(1),cat.getPeliculas().get(2));
			this.peliculas=films;
		}else{
			List<Peliculas> films = Arrays.asList(cat.getPeliculas().get(0));
			this.peliculas=films;
		}
	}
}








public void añadirSerie(Serie serie, Usuario user1) {
	if(serie!=null) {
		if(serie.isCont_infantil()== true && user1.isCont_infantil()==false) {
			System.out.println("Usuario infantil, acceso denegado a series con calificacion adulta, no se añadio su serie a la lista de reproduccion");
		}else if(this.series.lastIndexOf(serie)==-1){
			this.series.add(serie);
		}
	}
}
public void eliminarSerie(Serie serie) {
	if (serie!=null&& this.series.isEmpty()!=true)  {
		while(this.series.lastIndexOf(serie)!=-1) {
			if(this.series.lastIndexOf(serie)!=-1) { // Por si acaso el while se mete aqui e intenta borrar algo que ya no existe
				this.series.remove(serie);
			}
		}
	}
}
public void inicializarListaSeries(Catalogo cat){
	if(cat.getSeries().isEmpty()!=true && cat.getSeries().get(0)!=null && cat.getSeries().get(1)!=null && cat.getSeries().get(2)!=null ) {
		if(cat.getSeries().get(0).equals(cat.getSeries().get(1))!=true && cat.getSeries().get(0).equals(cat.getSeries().get(2))!=true && cat.getSeries().get(1).equals(cat.getSeries().get(2))!=true) {
			List<Serie> series = Arrays.asList(cat.getSeries().get(0),cat.getSeries().get(1),cat.getSeries().get(2));
			this.series=series;
		}else {
			List<Serie> series = Arrays.asList(cat.getSeries().get(0));
			this.series=series;
		}
	}

}

public Capitulo getCapitulo(Capitulo capitulo) {
	if (capitulo!=null&& this.series.isEmpty()!=true)  {
		for(int i=0;i<this.series.size();i++) {
			if (this.series.get(i).getTemporada().isEmpty()!=true)  {
				for(int j=0;j<this.series.get(i).getTemporada().size();j++) {
					if(this.series.get(i).getTemporada().get(j).getCapitulos().isEmpty()!=true)  {
						if(this.series.get(i).getTemporada().get(j).getCapitulos().lastIndexOf(capitulo)!=-1) {
							Capitulo capitulo_aux=this.series.get(i).getTemporada().get(j).getCapitulos().get(this.series.get(i).getTemporada().get(j).getCapitulos().lastIndexOf(capitulo));
							return capitulo_aux;
						}
					}
				}
			}
		}
	}
	
	return null;
}
public Capitulo getCapitulo(String capitulo) {
	if (capitulo!=null&& this.series.isEmpty()!=true)  {
		for(int i=0;i<this.series.size();i++) {
			if (this.series.get(i).getTemporada().isEmpty()!=true)  {
				for(int j=0;j<this.series.get(i).getTemporada().size();j++) {
					if(this.series.get(i).getTemporada().get(j).getCapitulos().isEmpty()!=true)  {
						for(int k=0;k<this.series.get(i).getTemporada().get(j).getCapitulos().size();j++) {
							if(this.series.get(i).getTemporada().get(j).getCapitulos().get(k).getTitulo().equalsIgnoreCase(capitulo)) {
								Capitulo capitulo_aux=this.series.get(i).getTemporada().get(j).getCapitulos().get(k);
								return capitulo_aux;
							}
						}
					}
				}
			}
		}
	}
	
	return null;
}

public Capitulo getCapitulo(int idCapitulo) {
	if (this.series.isEmpty()!=true) {
		for(int i=0;i<this.series.size();i++) {
			if (this.series.get(i).getTemporada().isEmpty()!=true)  {
				for(int j=0;j<this.series.get(i).getTemporada().size();j++) {
					if(this.series.get(i).getTemporada().get(j).getCapitulos().isEmpty()!=true)  {
						for(int k=0;k<this.series.get(i).getTemporada().get(j).getCapitulos().size();j++) {
							if(this.series.get(i).getTemporada().get(j).getCapitulos().get(k).getId()==idCapitulo) {
								Capitulo capitulo_aux=this.series.get(i).getTemporada().get(j).getCapitulos().get(k);
								return capitulo_aux;
							}
						}
					}
				}
			}
		}
	}
	
	return null;
}

public Capitulo getCapitulo(String nombre, Serie serie, Temporada temporada) {
	if (serie!=null && temporada != null && this.series.isEmpty()!=true) {
		for(int i=0;i<this.series.size();i++) {
			if (this.series.get(i)==serie)  {
				if(this.series.get(i).getTemporada().isEmpty()!=true)  {
					for(int j=0;j<this.series.get(i).getTemporada().size();j++) {
						if (this.series.get(i).getTemporada().get(j)==temporada)  {
							if(this.series.get(i).getTemporada().get(j).getCapitulos().isEmpty()!=true) {
								for(int k=0;k<this.series.get(i).getTemporada().get(j).getCapitulos().size();j++) {
									if(this.series.get(i).getTemporada().get(j).getCapitulos().get(k).getTitulo().equalsIgnoreCase(nombre)) {
										Capitulo capitulo_aux=this.series.get(i).getTemporada().get(j).getCapitulos().get(k);
										return capitulo_aux;
									}
									
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	return null;
}
public Capitulo getCapitulo(int idCapitulo, Serie serie, Temporada temporada) {
	if (serie!=null && temporada != null && this.series.isEmpty()!=true) {
		for(int i=0;i<this.series.size();i++) {
			if (this.series.get(i)==serie)  {
				if(this.series.get(i).getTemporada().isEmpty()!=true)  {
					for(int j=0;j<this.series.get(i).getTemporada().size();j++) {
						if (this.series.get(i).getTemporada().get(j)==temporada)  {
							if(this.series.get(i).getTemporada().get(j).getCapitulos().isEmpty()!=true) {
								for(int k=0;k<this.series.get(i).getTemporada().get(j).getCapitulos().size();j++) {
									if(this.series.get(i).getTemporada().get(j).getCapitulos().get(k).getId()==idCapitulo) {
										Capitulo capitulo_aux=this.series.get(i).getTemporada().get(j).getCapitulos().get(k);
										return capitulo_aux;
									}
									
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	return null;
}
public Capitulo getCapitulo(int idCapitulo, String serie, String temporada) {
	if (serie!=null && temporada != null && this.series.isEmpty()!=true) {
		for(int i=0;i<this.series.size();i++) {
			if (this.series.get(i).getTitulo().equalsIgnoreCase(serie))  {
				if(this.series.get(i).getTemporada().isEmpty()!=true)  {
					for(int j=0;j<this.series.get(i).getTemporada().size();j++) {
						if (this.series.get(i).getTemporada().get(j).getTitulo().equalsIgnoreCase(temporada))  {
							if(this.series.get(i).getTemporada().get(j).getCapitulos().isEmpty()!=true) {
								for(int k=0;k<this.series.get(i).getTemporada().get(j).getCapitulos().size();j++) {
									if(this.series.get(i).getTemporada().get(j).getCapitulos().get(k).getId()==idCapitulo) {
										Capitulo capitulo_aux=this.series.get(i).getTemporada().get(j).getCapitulos().get(k);
										return capitulo_aux;
									}
									
								}
							}
						}
					}
				}
			}
		}
	}
	
		

	
	return null;
}

public void inicializarLista(Catalogo catalogo) {
	inicializarListapeliculas(catalogo);
	inicializarListaSeries(catalogo);
	this.id_last_film = 0;
	this.last_film_min = 0;
	this.id_last_chapter = 0;
	this.last_chapter_min = 0;
}

}
